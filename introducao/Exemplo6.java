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
public class Exemplo6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario;
        double novoSalario;
        System.out.println("Digite o valor do salário");
        salario = input.nextDouble();
        if(salario <= 280){
            novoSalario = salario + (salario * 0.20);
            System.out.printf("O salário antes do reajuste é: R$ %.2f",salario);
            System.out.println();
            System.out.printf("O valor do novo salário é: R$ %.2f",novoSalario);
            System.out.println();
            double valorAumento = novoSalario - salario;
            System.out.printf("O valor do aumento foi de R$ %.2f",valorAumento);
            
        }
        if(salario > 280 && salario <=700){
            novoSalario = salario + (salario * 0.15);
            System.out.printf("O salário antes do reajuste é: R$ %.2f",salario);
            System.out.println();
            System.out.printf("O valor do novo salário é: R$ %.2f",novoSalario);
            System.out.println();
            double valorAumento = novoSalario - salario;
            System.out.printf("O valor do aumento foi de R$ %.2f",valorAumento);
            
        }
        if(salario > 700 && salario <=1500){
            novoSalario = salario + (salario * 0.10);
            System.out.printf("O salário antes do reajuste é: R$ %.2f",salario);
            System.out.println();
            System.out.printf("O valor do novo salário é: R$ %.2f",novoSalario);
            System.out.println();
            double valorAumento = novoSalario - salario;
            System.out.printf("O valor do aumento foi de R$ %.2f",valorAumento);
            
        }
        if(salario > 1500){
            novoSalario = salario + (salario * 0.05);
            System.out.printf("O salário antes do reajuste é: R$ %.2f",salario);
            System.out.println();
            System.out.printf("O valor do novo salário é: R$ %.2f",novoSalario);
            System.out.println();
            double valorAumento = novoSalario - salario;
            System.out.printf("O valor do aumento foi de R$ %.2f",valorAumento);
            
        }
    }
 
}
