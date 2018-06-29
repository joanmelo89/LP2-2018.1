/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradaGrafica;

/**
 *
 * @author joan-
 */
import javax.swing.JOptionPane;
public class Exemplo2 {
    public static void main(String[] args) {
        String n1;
        String n2;
        String n3;
        
        n1 = JOptionPane.showInputDialog("Digite o primeiro valor");
        n2 = JOptionPane.showInputDialog("Digite o segundo valor");
        n3 = JOptionPane.showInputDialog("Digite o terceiro valor");
        
        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);
        double num3 = Double.parseDouble(n3);
        double res = (num1 + num2 + num3)/3;
        
        if(res >= 7){
        String msg;
        msg = "Aprovado | Média: "+res;
        JOptionPane.showMessageDialog(null, msg);
        }
        if(res < 7){
        String msg;
        msg = "Reprovado | Média: "+res;
        JOptionPane.showMessageDialog(null, msg);
        }
    }
}
