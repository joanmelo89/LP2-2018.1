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
public class Exemplo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1, n2, n3, media;
        System.out.println("Digite a primeira nota");
        n1 = input.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = input.nextDouble();
        System.out.println("Digite a terceira nota");
        n3 = input.nextDouble();
        media = (n1 + n2 + n3)/3;
        if(media >= 7){
            System.out.println("Aprovado");
            System.out.printf("A média do aluno foi: %.1f",media);
        }
        if(media >= 4 && media <= 6.9){
            System.out.println("Recuperação");
            System.out.printf("A média do aluno foi: %.1f",media);
        }
        if(media < 4){
            System.out.println("Reprovado direto");
            System.out.printf("A média do aluno foi: %.1f",media);
        }
       
    }
}
