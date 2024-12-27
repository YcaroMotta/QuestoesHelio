/*
Inicio
Var valor,valorporpessoa,centavos;
Escreva -> "Digite o valor da conta";

valorporpessoa <- math.floor(valor/3);
centavos <- valor - (valorporpessao*3);

Escreva -> "Valor que André vai pagar em R$" + valorporpessoa;
Escreva -> "Valor que Marcos vai pagar em R$" + valorporpessoa;
Escreva -> "Valor que Felipe vai pagar em R$" + (valorporpessoa + centavos);

FIM

Teste de Mesa

valor,valorporpessoa,centavos,André,Marcos,Félipe,Escreva
200  ,      66      ,  3     , 66   ,66   , 68   ,66 66 68
160  ,      53      ,  1     , 53   , 53  ,54    ,53 53 54


*/
package questao15;

import javax.swing.JOptionPane;

public class Questao15 {

    public static void main(String[] args) {
               double valor,valorporpessoa,centavos;
        String svalor;

        svalor = JOptionPane.showInputDialog(null,"Digite o valor da conta");
        valor = Double.parseDouble(svalor);

        valorporpessoa = Math.floor(valor / 3);
        centavos = valor - (valorporpessoa * 3);

        JOptionPane.showMessageDialog(null, "Valor que André vai pagar é R$ " + String.format("%.2f", valorporpessoa));
        JOptionPane.showMessageDialog(null, "Valor que Marcos vai pagar é R$ " + String.format("%.2f", valorporpessoa));
        JOptionPane.showMessageDialog(null, "Valor que Felipe vai pagar é R$ " + String.format("%.2f", (valorporpessoa + centavos)));
    }
}
