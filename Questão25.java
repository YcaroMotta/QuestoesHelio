/*
Inicio
Var volume,raio2,altura;

Escreva ->"Digite o valor do raio:";
Escreva -> "Digite o valor da altura:":

volume <- (raio2 * raio2) * altura * 3.14

Escreva -> "O volume da caixa d'água é: " + volume

FIM

TESTE DE MESA

RAIO , ALTURA , VOLUME , ESCREVA
4        4      200.96    200.96
3.5     8.14    313.10    31310

 
 */

package caixadeagua;

import javax.swing.JOptionPane;

public class CaixadeAgua {

    public static void main(String[] args) {
        double volume,raio2,altura;
        
        String sraio2,saltura;
        
        sraio2 = JOptionPane.showInputDialog(null," Valor do raio ");
        raio2 = Double.parseDouble(sraio2);
        
        saltura = JOptionPane.showInputDialog(null," Valor da altura ");
        altura = Double.parseDouble(saltura);
        
        volume = (raio2*raio2)*altura*3.14;
        
        JOptionPane.showMessageDialog(null,"O volume da caixa D'Água é " + volume);

    }
    
}
