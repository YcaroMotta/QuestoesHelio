/*
Inicio
Var alturaPessoa,sombraPessoa,sombraPredio,alturaPredio;

Escreva -> "Digite a sua altura (em metros):";
Escreva -> "Digite o comprimento da sua sombra (em metros):";
Escreva -> "Digite o comprimento da sombra do prédio (em metros):";

alturaPredio <- (alturaPessoa*sombraPredio)/sombraPessoa;

Escreva -> "A altura do prédio é aproximadamente" + alturaPredio;

Fim

Teste de mesa

alturaPessoa,sombraPessoa,sombraPredio,alturaPredio,escreva
    160         180           400         355.56     355.56
    180         200           400         360.00     360.00
*/

package predio;

import javax.swing.JOptionPane;

public class Predio {

    public static void main(String[] args) {
        double alturaPessoa,sombraPessoa,sombraPredio,alturaPredio;
        String s_alturaPessoa,s_sombraPessoa,s_sombraPredio;
        
        s_alturaPessoa = JOptionPane.showInputDialog("Digite a sua altura (em metros):");
        alturaPessoa = Double.parseDouble(s_alturaPessoa);
        s_sombraPessoa = JOptionPane.showInputDialog("Digite o comprimento da sua sombra (em metros):");
        sombraPessoa = Double.parseDouble(s_sombraPessoa);
        s_sombraPredio = JOptionPane.showInputDialog("Digite o comprimento da sombra do prédio (em metros):");
        sombraPredio = Double.parseDouble(s_sombraPredio);
      
        alturaPredio = (alturaPessoa*sombraPredio)/sombraPessoa;

        JOptionPane.showMessageDialog(null, String.format("A altura do prédio é aproximadamente %.2f metros.", alturaPredio));
    }
    
}
