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
public class Exemplo3 {
    public static void main(String[] args) {
        String salarioBruto;
        
        salarioBruto = JOptionPane.showInputDialog("Digite o valor do salário bruto:");
        
        double salBruto = Double.parseDouble(salarioBruto);
        
        double novoSalario;
        novoSalario = salBruto - (0.11 * salBruto) - (0.08 * salBruto);
        
        String msg;
        msg = "O novo salário é de: R$ "+novoSalario;
        JOptionPane.showMessageDialog(null, msg);
        
        
    }
}
