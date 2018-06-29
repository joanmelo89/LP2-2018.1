/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaMetodo;

/**
 *
 * @author joan-
 */
public class testeCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
        System.out.println(calc.soma(7, 8));
        System.out.println(calc.soma(7.6 , 8.9));
        System.out.println(calc.soma(8, 9, 6));
        
    }
}
