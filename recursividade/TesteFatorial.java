/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author joan-
 */
public class TesteFatorial {
    public static void main(String[] args) {
        Fatorial calc = new Fatorial();
        
        int fatorialNR = calc.fatorialNaoRecursivo(8);
        System.out.println(fatorialNR);
        
        int fatorialR = calc.calculaFatorial(4);
        System.out.println(fatorialR);
    }
}
