/*
Inicio
Var a, b;

Escreva -> "Digite o coeficiente A:";
Escreva -> "Digite o coeficiente B:";

se (a!=0)
      real x = -b / a;
      real y = 0;
      
      Escreva -> "O ponto onde a reta toca o eixo X é: (" + String.format("%.2f", x) + ", " + y + ")");
senão
      Escreva -> "A não pode ser igual a 0."

Fim 

Teste de Mesa

a  , b  , se, senão
10  5.2   V     -
 0  10    -     V
*/
package questão29;

import javax.swing.JOptionPane;

public class Questão29 {

    public static void main(String[] args) {
        double a, b;
        String s_A,s_B;
        
        s_A = JOptionPane.showInputDialog(null, "Digite o coeficiente A:");
        a = Double.parseDouble(s_A);
        s_B = JOptionPane.showInputDialog(null, "Digite o coeficiente B:");
        b = Double.parseDouble(s_B);

        if (a != 0) {
            double x = -b / a;
            double y = 0;

            JOptionPane.showMessageDialog(null, "O ponto onde a reta toca o eixo X é: (" + String.format("%.2f", x) + ", " + y + ")");
        } else {
            JOptionPane.showMessageDialog(null, "A não pode ser igual a 0.");

    }
    
}
}
