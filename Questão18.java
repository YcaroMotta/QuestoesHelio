/*
Inicio
Var horas_trabalhadas,horas_trabalhadas_extra,salariobruto,salarioliquido;

Escreva ->"Digite o número de Horas Trabalhadas";
Escreva ->"Digite o número de Horas Trabalhadas Extra";

salariobruto <- (horas_trabalhadas*10)+(horas_trabalhadas*15);
salarioliquido <- (salariobruto-(salariobruto*0.10);

Escreva ->"o Salário Bruto é:" + salariobruto;
Escreva ->"o Salário líquido é:" + salarioliquido;

Fim

Teste de Mesa

horas_trabalhadas,horas_trabalhadas_extra,salariobruto,salarioliquido,escreva
       8                       2            110.00            99.00      99.00
       5                       5            125.00           112.50     112.50
*/
package sálario;

import javax.swing.JOptionPane;

public class Sálario {

    public static void main(String[] args) {
        double horas_trabalhadas,horas_trabalhadas_extra,salariobruto,salarioliquido;
        String s_horas_trabalhadas,s_horas_trabalhadas_extra;
;
        
        s_horas_trabalhadas = JOptionPane.showInputDialog(null, "Digite o número de Horas Trabalhadas");
        s_horas_trabalhadas_extra = JOptionPane.showInputDialog(null, "Digite o número de Horas Trabalhadas Extra");
        horas_trabalhadas = Integer.parseInt(s_horas_trabalhadas);
        horas_trabalhadas_extra = Integer.parseInt(s_horas_trabalhadas_extra);
        
        salariobruto = (horas_trabalhadas*10)+(horas_trabalhadas_extra*15);
        salarioliquido = salariobruto-(salariobruto*0.10);
        
        JOptionPane.showMessageDialog(null, String.format("o Salário Bruto é: %.2f", + salariobruto));
        JOptionPane.showMessageDialog(null, String.format("o Salário líquido é: %.2f", + salarioliquido));
        

    }
    
}
