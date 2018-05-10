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
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[10];
        for(int i=0;i < vetorA.length; i++){
            System.out.println("Entre com o valor da posição "+i);
            vetorA[i] = input.nextInt();
        }
        int qtdPares = 0;
        for(int i=0;i < vetorA.length; i++){
            if(vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }
        System.out.println("Valores do vetor A = ");
        for(int i = 0;i < vetorA.length;i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A quantidade de números pares no vetor é: "+qtdPares);
    }
}
