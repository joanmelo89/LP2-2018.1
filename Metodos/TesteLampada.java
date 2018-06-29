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
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.ligar();
        //lampada = true;
        lampada.mostrarEstado();
        //ligada
        lampada.mudarEstado();
        //ligada = false;
        lampada.mostrarEstado();
        //desligada
    }
}
