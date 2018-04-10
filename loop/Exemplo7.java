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
public class Exemplo7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean notaValida = false;
        do{
            System.out.println("Digite o valor da nota");
            double nota = input.nextDouble();
            if(nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Parabéns, você digitou uma nota "+nota+" válida!");
            }else{
                //notaValida = false;
                System.out.println("Nota inválida!");
            }
        }while(!notaValida);
    }
}
