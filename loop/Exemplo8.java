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
//importação da scanner para ler que o usuário vai digitar.
import java.util.Scanner;
public class Exemplo8 {
    //método principal para execução
    public static void main(String[] args) {
        //criação do objeto scanner
        Scanner input = new Scanner(System.in);
        boolean infoValidas = false;
        String nomeUser;
        String senha;
        do{
            System.out.println("Nome:");
            nomeUser = input.next();
            System.out.println("Senha:");
            senha = input.next();
            if(nomeUser.equalsIgnoreCase(senha)){
                //infoValidas = false;
                System.out.println("Nome de usuário igual a senha! Favor digitar novamente.");
            }else{
                infoValidas = true;
                System.out.println("Usuário e senha válidos!");
            }
        }while(!infoValidas);
    }
    
}
