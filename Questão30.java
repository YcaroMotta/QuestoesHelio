/*
Inicio
Var projeto_Grande,projeto_Médio,projeto_Pequeno,tempo_de_Empresa,Total;

Escreva -> "Quantos Projetos Grandes Participou";
Escreva -> "Quantos Projetos Médios Participou";
Escreva -> "Quantos Projetos Pequenos Participou";
Escreva -> "Quantos Anos de Empresa Possui";

total <- ((projeto_Grande*10) + (projeto_Medio*5)+ (projeto_Pequeno*2)+ (tempo_de_Empresa*2));

Escreva -> "O Total de Pontos é: " + total;

Fim

Teste de Mesa

projeto_Grande,projeto_Medio,projeto_Pequeno,tempo_de_Empresa,total;
       5             10            10              10          140
       7             14            29              3           204
*/
package questão30;

import javax.swing.JOptionPane;

public class Questão30 {

    public static void main(String[] args) {
        int projeto_Grande,projeto_Medio,projeto_Pequeno,tempo_de_Empresa,total;
        String s_projeto_Grande,s_projeto_Medio,s_projeto_Pequeno,s_tempo_de_Empresa;
        
        s_projeto_Grande = JOptionPane.showInputDialog(null, "Quantos Projetos Grandes Participou");
        projeto_Grande = Integer.parseInt(s_projeto_Grande);
        s_projeto_Medio = JOptionPane.showInputDialog(null, "Quantos Projetos Médios Participou");
        projeto_Medio = Integer.parseInt(s_projeto_Medio);
        s_projeto_Pequeno = JOptionPane.showInputDialog(null, "Quantos Projetos Pequenos Participou");
        projeto_Pequeno = Integer.parseInt(s_projeto_Pequeno);
        s_tempo_de_Empresa = JOptionPane.showInputDialog(null, "Quantos Anos de Empresa Possui");
        tempo_de_Empresa = Integer.parseInt(s_tempo_de_Empresa);
        
        total = ((projeto_Grande*10) + (projeto_Medio*5)+ (projeto_Pequeno*2)+ (tempo_de_Empresa*2));
        
        JOptionPane.showMessageDialog(null, "O Total de Pontos é: " + total);
    }
    
}
