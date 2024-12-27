/*
Inicio
Var moeda1cent,moeda5cent,moeda10cent,moeda25cent,moeda50cent,moeda1real,total;

Escreva -> "Digite a Quantidade de Moeda de 1 centavos";
Escreva -> "Digite a Quantidade de Moeda de 5 centavos";
Escreva -> "Digite a Quantidade de Moeda de 10 centavos";
Escreva -> "Digite a Quantidade de Moeda de 25 centavos";
Escreva -> "Digite a Quantidade de Moeda de 50 centavos";
Escreva -> "Digite a Quantidade de Moeda de 1 Real";

total <- (moeda1cent*0.01)+(moeda5cent*0.05)+(moeda10cent*0.10)+(moeda25cent*0.25)+(moeda50cent*0.50)+(moeda1real*1.00);

Escreva <- "Total economizado: R$ " + total;

Fim
Teste de mesa
moeda1cent,moeda5cent,moeda10cent,moeda25cent,moeda50cent,moeda1real,total,escreva
     1         2          3           4            5          6      9.91    9.91
     4         4          4           4            4          4      7.64    7.64
*/
package pedrinho;

import javax.swing.JOptionPane;

public class Pedrinho {

    public static void main(String[] args) {
        int moeda1cent,moeda5cent,moeda10cent,moeda25cent,moeda50cent,moeda1real;
        double total;
        String s_moeda1cent,s_moeda5cent,s_moeda10cent,s_moeda25cent,s_moeda50cent,s_moeda1real;
        
        s_moeda1cent = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 1 centavos");
        moeda1cent = Integer.parseInt(s_moeda1cent);
        s_moeda5cent = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 5 centavos");
        moeda5cent = Integer.parseInt(s_moeda5cent);
        s_moeda10cent = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 10 centavos");
        moeda10cent = Integer.parseInt(s_moeda10cent);
        s_moeda25cent = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 25 centavos");
        moeda25cent = Integer.parseInt(s_moeda25cent);
        s_moeda50cent = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 50 centavos");
        moeda50cent = Integer.parseInt(s_moeda50cent);
        s_moeda1real = JOptionPane.showInputDialog(null, "Digite a Quantidade de Moeda de 1 Real");
        moeda1real = Integer.parseInt(s_moeda1real);

        total = (moeda1cent * 0.01) + (moeda5cent * 0.05) + (moeda10cent * 0.10) + (moeda25cent * 0.25) + (moeda50cent * 0.50) + (moeda1real * 1.00);

        JOptionPane.showMessageDialog(null, "Total economizado: R$ " + String.format("%.2f", total));

    }
    
}
