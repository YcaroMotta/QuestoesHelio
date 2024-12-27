/*
Inicio
Var agua,suco,litrosTotal;

Escreva -> "Digite a Quantidade de Suco a ser Feita"

agua <- litrosTotal*0.8;
suco <- litrosTotal*0.2;

Escreva -> String.format("Para fazer %.2f Litros de Suco e nescessário %.2f Litros de Àgua é %.2f Litros de suco", + litrosTotal,agua,suco);

Fim

Teste de Mesa

litrosTotal, agua  , suco ,escreva
   3         2.40    0.60   2.40 0.60  
  10         8.00    2.00   8.00 2.00     
*/
package questao24;

import javax.swing.JOptionPane;

public class Questao24 {

    public static void main(String[] args) {
        double agua,suco,litrosTotal;
        String s_litrosTotal;
        
        s_litrosTotal = JOptionPane.showInputDialog(null, "Digite a Quantidade de Suco a ser Feita");
        litrosTotal = Double.parseDouble(s_litrosTotal);
        
        agua = litrosTotal*0.8;
        suco = litrosTotal*0.2;
        
        JOptionPane.showMessageDialog(null, String.format("Para fazer %.2f Litros de Suco e nescessário %.2f Litros de Àgua é %.2f Litros de suco", + litrosTotal,agua,suco));

    }
    
}
