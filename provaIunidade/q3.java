/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaIunidade;

/**
 *
 * @author joan-
 */
import javax.swing.JOptionPane;
public class q3 {
    public static void main(String[] args) {
        
    String p1,t1;
    double medp, medt, medf;
    double acump=0,acumt=0;
for(int cont = 1;cont<=4;cont++){
p1 = JOptionPane.showInputDialog("DIGITE A NOTA DA PROVA"+cont);
double p = Double.parseDouble(p1);
t1 = JOptionPane.showInputDialog("DIGITE A NOTA DO TESTE"+cont);
double t = Double.parseDouble(t1);
acump = acump + p;
acumt = acumt + t;

}

medp = acump/4;
medt = acumt/4;
medf = (0.8*medp) + (0.2*medt);       

if(medf>=6){
    String msg;
    msg = "O ALUNO FOI APROVADO COM MEDIA - " +medf;
    JOptionPane.showMessageDialog(null, msg);
}else{
    String msg;
    msg = "O ALUNO FOI REPROVADO COM MEDIA - " +medf;
    JOptionPane.showMessageDialog(null, msg);
    
    
}
    }
    
    }

