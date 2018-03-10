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
public class Exemplo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double qtdLitros;
        double desconto;
        double valorLitro;
        valorLitro = 3.50;
        System.out.println("Digite a quantidade desejada");
        qtdLitros = input.nextDouble();
        if(qtdLitros <= 20){
            desconto = ((3.50 * qtdLitros) * 3)/100;
            System.out.printf("O valor do desconto é: R$ %.2f",desconto);
        }else{
            desconto = ((3.50 * qtdLitros) * 5)/100;
            System.out.printf("O valor do desconto é: R$ %.2f",desconto);
        }
    }
}
