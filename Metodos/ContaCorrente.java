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
public class ContaCorrente {
    String numero;
    String agencia;
    boolean especial;
    double saldo;
    double limiteEspecial;
    
    boolean realizarSaque(double quantiaSaque){
        if(saldo >= quantiaSaque){
            saldo -= quantiaSaque;
            return true;
        }else{
            if(especial){
                //verficar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
                if(limite >= quantiaSaque){
                    saldo -= quantiaSaque;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;//não é especial e não tem saldo suficiente
            }
        }
    }
    void depositar(double valorDepositado){
        saldo += valorDepositado;
    }
    void consultarSaldo(){
        System.out.println("Saldo atual da conta: R$"+saldo);
    }
}
