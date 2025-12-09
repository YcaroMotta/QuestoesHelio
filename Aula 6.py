import pandas as pd
import networkx as nx
import matplotlib.pyplot as plt
from itertools import combinations

# Ler o CSV
df = pd.read_csv("caixa_atualizado.csv")

# Agrupar pares de produtos por data
pares = []
for data, grupo in df.groupby("Data"):
    produtos = grupo["Produto"].tolist()
    for combo in combinations(produtos, 2):
        pares.append(combo)

# Contar frequência dos pares
df_pares = pd.DataFrame(pares, columns=["Produto1", "Produto2"])
freq = df_pares.value_counts().reset_index(name="Frequência")

# Criar grafo
G = nx.Graph()
for _, row in freq.iterrows():
    G.add_edge(row["Produto1"], row["Produto2"], weight=row["Frequência"])

# Calcular métricas de centralidade (para destacar nós importantes)
centralidade = nx.degree_centrality(G)

# Configurar tamanhos dos nós proporcional à centralidade
node_sizes = [3000 * centralidade[n] for n in G.nodes()]

# Configurar cores dos nós proporcional à centralidade
node_colors = [centralidade[n] for n in G.nodes()]

# Plotar grafo avançado
plt.figure(figsize=(12,10))
pos = nx.spring_layout(G, seed=42, k=0.4)  # layout mais espaçado

# Nós
nx.draw_networkx_nodes(G, pos, node_size=node_sizes, node_color=node_colors, cmap=plt.cm.plasma, alpha=0.9, edgecolors="black")

# Arestas com espessura proporcional à frequência
nx.draw_networkx_edges(G, pos, width=[d['weight']*1.5 for (_,_,d) in G.edges(data=True)], edge_color="gray", alpha=0.7)

# Rótulos dos nós
nx.draw_networkx_labels(G, pos, font_size=12, font_weight="bold")

# Rótulos das arestas (frequência)
edge_labels = nx.get_edge_attributes(G, 'weight')
nx.draw_networkx_edge_labels(G, pos, edge_labels=edge_labels, font_size=10)

# Título e ajustes
plt.title("Rede Avançada de Produtos Comprados Juntos", fontsize=16, fontweight="bold")
plt.axis("off")
plt.tight_layout()
plt.show()
