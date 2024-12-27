/*
Inicio
Var lata350ml,garrafa600ml,garrafa2L,litrostotal;

Escreva -> "DIGA A QUANTIDADE DE LATAS DE 350ML";
Escreva -> "DIGA A QUANTIDADE DE GARRAFAS DE 600ML";
Escreva -> "DIGA A QUANTIDADE DE GARRAFAS DE 2L";

litrostotal <- (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2);

Escreva -> "A QUANTIDADE DE LITROS QUE ELE COMPROU É " + litrostotal;

Fim

Teste de Mesa

lata350ml,garrafa600ml,garrafa2L,litrostotal
   3          5           8         20.05
   4          4           4         11.80
*/
package fabrica;

import javax.swing.JOptionPane;

public class Fabrica {

    public static void main(String[] args) {
        double lata350ml, garrafa600ml, garrafa2L, litrostotal;
        String s_lata350ml, s_garrafa600ml, s_garrafa2L;
        
        s_lata350ml = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE LATAS DE 350ML");
        lata350ml = Double.parseDouble(s_lata350ml);
        
        s_garrafa600ml = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE GARRAFAS DE 600ML");
        garrafa600ml = Double.parseDouble(s_garrafa600ml);
        
        s_garrafa2L = JOptionPane.showInputDialog(null, "DIGA A QUANTIDADE DE GARRAFAS DE 2L");
        garrafa2L = Double.parseDouble(s_garrafa2L);
        
        litrostotal = (lata350ml * 0.35) + (garrafa600ml * 0.6) + (garrafa2L * 2);
        
        JOptionPane.showMessageDialog(null, "A QUANTIDADE DE LITROS QUE ELE COMPROU É " + litrostotal);

    }
    
}
