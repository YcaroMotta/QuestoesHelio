/*
Inicio
Var valorCheque, imposto;

Escreva -> "Digite o valor do cheque:"

imposto <- valorCheque * 0.38;

Escreva -> "O valor descontado pelo imposto é: R$ " + String.format("%.2f", imposto);

Fim 

Teste de Mesa

valorCheque,imposto,escreva;
   1000      380     380
    750      285     285
*/
package questão28;

import javax.swing.JOptionPane;

public class Questão28 {

    public static void main(String[] args) {
        double valorCheque,imposto;
        String sValorCheque;

        sValorCheque = JOptionPane.showInputDialog("Digite o valor do cheque:");
        valorCheque = Double.parseDouble(sValorCheque);
        imposto = valorCheque * 0.0038;

        JOptionPane.showMessageDialog(null, "O valor descontado pelo imposto é: R$ " + String.format("%.2f", imposto));
    }
    
}
