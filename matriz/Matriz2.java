/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author joan-
 */
import java.util.Random;
public class Matriz2 {
    public static void main(String[] args) {
        int[][] numerosAleatorios = new int[10][10];
        Random numeroRandom = new Random();
        for(int i=0;i < numerosAleatorios.length;i++){
            for(int j = 0;j < numerosAleatorios[i].length;j++){
                numerosAleatorios[i][j] = numeroRandom.nextInt(10);
            }
        }
        for(int i = 0;i < numerosAleatorios.length; i++){
            for(int j=0;j < numerosAleatorios[i].length; j++){
                System.out.print(numerosAleatorios[i][j]+" ");
            }
            System.out.println();
        }
        int maiorLinha5 = 0;
        int menorLinha5 = 101;
        int linha5 = 5;
        
        for(int i = 0;i < numerosAleatorios[linha5].length; i++){
        if(numerosAleatorios[linha5][i] > maiorLinha5){
            maiorLinha5 = numerosAleatorios[linha5][i];
        }
        if(numerosAleatorios[linha5][i] < menorLinha5){
            menorLinha5 = numerosAleatorios[linha5][i];
        }
        
    }
        System.out.println("Maior valor da linha 5: "+maiorLinha5);
        System.out.println("Menor valor da linha 5: "+menorLinha5);
        
        int maiorColuna7 = 0;
        int menorColuna7 = 101;
        int col7 = 7;
        
        for(int i=0;i < numerosAleatorios.length;i++){
            if(numerosAleatorios[i][col7] > maiorColuna7){
                maiorColuna7 = numerosAleatorios[i][col7]; 
            }
            if(numerosAleatorios[i][col7] < menorColuna7){
                menorColuna7 = numerosAleatorios[i][col7];
            }
        }
        System.out.println("Maior valor da coluna 7: "+maiorColuna7);
        System.out.println("Menor valor da coluna 7: "+menorColuna7);
            
        
    }
}
