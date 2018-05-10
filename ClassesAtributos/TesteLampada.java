/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAtributos;

/**
 *
 * @author joan-
 */
public class TesteLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.potencia = 60;
        lampada.cor = "Amarela";
        lampada.tipoLuz = "Incandescente";
        
        System.out.println("Minha lâmpada é de cor "+lampada.cor);
     
    }
}
