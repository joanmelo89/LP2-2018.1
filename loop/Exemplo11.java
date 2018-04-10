/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Exemplo11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double soma = 0;
        double media;
        double num;
        for(int i = 0;i <= 4;i++){
            System.out.println("Digite o número:");
            num = input.nextInt();
            soma += num;
        }
        media = soma / 5;
        System.out.println("O valor da média foi: "+media);
        System.out.println("O valor da soma foi: "+soma);
    }
}
