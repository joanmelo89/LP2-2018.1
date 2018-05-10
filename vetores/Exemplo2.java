/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

/**
 *
 * @author joan-
 */
import java.util.Scanner;
public class Exemplo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[8];
        int[] vetorB = new int[8];
        
        for(int i = 0;i < vetorA.length;i++){
            System.out.println("Entre com o valor da posição"+"["+i+"]");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] * 2;
        }
         System.out.println("Valores do vetor A = ");
        for(int i = 0;i < vetorA.length;i++){
            System.out.println(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Valores do vetor B = ");
        for(int i = 0;i < vetorB.length;i++){
            System.out.println(vetorB[i] + " ");
        }
        System.out.println();
    }
}
