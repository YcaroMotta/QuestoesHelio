/*
Inicio
Var anelchip,anelalimentos,gasto,frangos;
Escreva -> "quantidade de frangos"
anelchip -> 4;
anelalimentos -> 3.50;

gasto <- (frangos*anelchip)+((anelalimentos*2)*frangos);

Escreva -> "o gasto foi de:" + gasto;

Fim 

Teste de Mesa

frangos,anelchip,anelalimentos,gasto,escreva
   10     40         70         110    110
    7     28         49          77     77
*/
package granja;

import javax.swing.JOptionPane;

public class Granja {

    public static void main(String[] args) {
      int frangos;
      double anelchip,anelalimentos, gasto;
      
      String s_frangos;
      
      s_frangos = JOptionPane.showInputDialog(null, " quantidade de frangos ");
      frangos = Integer.parseInt(s_frangos);
      
      anelchip = 4;
      anelalimentos = 3.50;
      
      gasto = (frangos*anelchip)+((anelalimentos*2)*frangos);
      
      JOptionPane.showMessageDialog(null,"o gasto foi de: " + gasto);
    
    }
 }
