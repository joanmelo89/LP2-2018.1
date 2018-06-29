/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author joan-
 */
public class Fatorial {
    public int fatorialNaoRecursivo(int num){
    if(num == 0){
        return 1;
    }
    int total = 1;
    for(int i=num; i > 1; i--){
        total *= i;
    }
    return total;
    }
    
    public int calculaFatorial(int num){
        if(num == 0){
        return 1;
            }
        return num * calculaFatorial(num-1);
    }
}
