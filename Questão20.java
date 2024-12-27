/*
Inicio
Var blusas, novelos, novelosporblusas: real

escreva("Número de blusas: ")
blusas <- converteReal(s_blusas)

escreva("Número de novelos: ")
novelos <- converteReal(s_novelos)


novelosporblusas <- novelos / blusas

Escreva -> "O GASTO É " + novelosporblusas

Fim

TESTE DE MESA

blusas,novelos,escreva
4        40       10
5        25        5

*/
package blusa;

import javax.swing.JOptionPane;

public class Blusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double blusas,novelos, novelosporblusas ;
      String s_blusas, s_novelos;
      
      s_blusas = JOptionPane.showInputDialog(null, " numero de blusas ");
      blusas = Double.parseDouble(s_blusas);
      
      s_novelos = JOptionPane.showInputDialog(null, " numero de novelos ");
      novelos = Double.parseDouble(s_novelos);
      
      novelosporblusas = novelos / blusas;
      
      JOptionPane.showMessageDialog(null,"O GASTO É " + novelosporblusas);

    }
    
}
