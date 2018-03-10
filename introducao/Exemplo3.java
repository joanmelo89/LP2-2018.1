/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducao;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Exemplo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double media;
        System.out.println("Valor da primeira nota");
        n1 = input.nextDouble();
        System.out.println("Valor da segunda nota");
        n2 = input.nextDouble();
        System.out.println("Valor da terceira nota");
        n3 = input.nextDouble();
        media = (n1 + n2 + n3)/3;
        System.out.printf("A média é: %.2f",media);
    }
}
