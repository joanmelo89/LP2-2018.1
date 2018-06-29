/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteIIUnidade;

/**
 *
 * @author NOT01
 */
import java.util.Random;
public class dado {
    public static void main(String[] args) {
    Random numRandom = new Random();
    int cont = 1;
    int soma;
    do{
        int n1 = numRandom.nextInt(6)+1;
        int n2 = numRandom.nextInt(6)+1;
        soma = n1 + n2;
        System.out.println("Valor n1 "+n1);
        System.out.println("Valor n2 "+n2);
        System.out.println("Soma n1 + n2 "+soma);
        cont++;
    }while(cont < 36);
   }
}
