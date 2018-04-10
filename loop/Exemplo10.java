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
public class Exemplo10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int maior = 0;
        for(int i = 0;i <= 4;i++){
            System.out.println("Digite o número:");
            num = input.nextInt();
            if(num > maior){
                maior = num;
            }
        }
        System.out.println("O maior número digitado foi: "+maior);
    }
}
