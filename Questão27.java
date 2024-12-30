/*
Inicio
Var compra1,compra2, compra3,compra4,totalgasto,pontos;

Escreva -> "Digite o valor da primeira compra";
Escreva -> "Digite o valor da segunda compra";
Escreva -> "Digite o valor da terceira compra";
Escreva -> "Digite o valor da quarta compra";

totalgasto <- compra1 + compra2 + compra3 + compra4;
pontos <- totalgasto/5.0;

Escreva -> "o total de pontos acumulados é: " + pontos;

Fim

Teste de Mesa

compra1,compra2, compra3,compra4,totalgasto,pontos,escreva
  100     25       75       50     250        50     50
   15     18       12       69     114        28.8   28.8
*/
package questão27;

import javax.swing.JOptionPane;

public class Questão27 {

    public static void main(String[] args) {
        double compra1,compra2, compra3,compra4,totalgasto,pontos;
        String s_compra1,s_compra2,s_compra3,s_compra4;

         s_compra1 = JOptionPane.showInputDialog("Digite o valor da primeira compra");
         compra1 = Double.parseDouble(s_compra1);
         s_compra2 = JOptionPane.showInputDialog("Digite o valor da segunda compra");
         compra2 = Double.parseDouble(s_compra2);
         s_compra3 = JOptionPane.showInputDialog("Digite o valor da terceira compra");
         compra3 = Double.parseDouble(s_compra3);
         s_compra4 = JOptionPane.showInputDialog("Digite o valor da quarta compra");
         compra4 = Double.parseDouble(s_compra4);

         totalgasto = compra1 + compra2 + compra3 + compra4;
         pontos = totalgasto/5.0;

         JOptionPane.showMessageDialog(null,"ao gastar: " + totalgasto + " o total de pontos acumulados é: " + pontos);

    }
    
}
