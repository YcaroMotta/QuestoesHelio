/*
Inicio 
Var primeiro,segundo,terceiro,totalprimeiro,totalsegundo,totalterceiro,proporção,divisao;

Escreva ->"DIGA A QUANTIDADE DE PONTOS"
Escreva ->"DIGA A QUANTIDADE DE PONTOS"
Escreva ->"DIGA A QUANTIDADE DE PONTOS"

proporção <- primeiro + segundo + terceiro;
divisão <-(500000)/proporção;
totalprimeiro <- divisao*primeiro;
totalsegundo <- divisao*segundo;
totalterceiro <- divisao*terceiro;

Escreva -> "A divisão do primeiro é " +totalprimeiro + "a divisão do segundo é " +totalsegundo + "a divisao do terceiro é" +totalterceiro;

Fim

Teste de Mesa

primeiro,segundo,terceiro,totalprimeiro,totalsegundo,totalterceiro , escreva;
   10      10       10      166666.66     166666.66    166666.66     166666.66
    7      15       13      100000.00     214285.70    185714.28     100000.00 214285.70 185714.28

*/
package questão.pkg26;

import javax.swing.JOptionPane;

public class Questão26 {

    public static void main(String[] args) {
        float primeiro,segundo,terceiro,totalprimeiro,totalsegundo,totalterceiro,proporção,divisao;
        String sprimeiro,ssegundo,sterceiro;
        
        sprimeiro =  JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        primeiro = Float.parseFloat(sprimeiro);
        
        ssegundo = JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        segundo = Float.parseFloat(ssegundo);
        
        sterceiro = JOptionPane.showInputDialog(null," DIGA A QUANTIDADE DE PONTOS ");
        terceiro =Float.parseFloat(sterceiro);
        
        proporção = primeiro + segundo + terceiro;
        divisao = (500000)/proporção;
        totalprimeiro = divisao*primeiro;
        totalsegundo = divisao*segundo;
        totalterceiro = divisao*terceiro;
        
        JOptionPane.showMessageDialog(null,"A divisão do primeiro é " + totalprimeiro + " a divisão do segundo é " + totalsegundo + " a divisao do terceiro é " + totalterceiro  );
       

    }
    
}
