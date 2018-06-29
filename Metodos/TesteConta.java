/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author joan-
 */
public class TesteConta {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "56353-6";
        conta.agencia = "01589";
        conta.especial = true;
        conta.limiteEspecial = 500;
        conta.saldo = -10;
        
        System.out.println("A conta da agência "+conta.agencia+" número "+conta.numero+" tem saldo igual a R$ "+conta.saldo);
        boolean saqueEfetuado = conta.realizarSaque(10);
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            conta.consultarSaldo();
        }else{
            System.out.println("Saque não pode ser efeutado! Saldo insuficiente.");
        }
        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de 500 reias.");
        if(saqueEfetuado){
            System.out.println("Saque efetuado com sucesso!");
            conta.consultarSaldo();
        }else{
            System.out.println("Saque não pode ser efeutado! Saldo insuficiente.");
        }
        System.out.println("Depósito de 500");
        conta.depositar(500);
        conta.consultarSaldo();
    }
}
