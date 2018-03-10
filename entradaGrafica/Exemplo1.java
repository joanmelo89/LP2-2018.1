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
public class Exemplo1 {
    public static void main(String[] args) {
        
    String n1;
    String n2;
    
    n1 = JOptionPane.showInputDialog("Digite o primeiro valor:");
    n2 = JOptionPane.showInputDialog("Digite o segundo valor:");
    
    int num1 = Integer.parseInt(n1);
    int num2 = Integer.parseInt(n2);
    
    int res = num1 + num2;
    
    String msg;
    msg = "O valor da soma é: "+res;
    JOptionPane.showMessageDialog(null, msg);

    }
    
}
