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
public class LivroDeBiblioteca {
    public static void main(String[] args) {
     Livro livro = new Livro();
     
     livro.categoria = "Informática";
     livro.nome = "Java, como programar.";
     livro.tempoLocacao = 7;
     livro.sinipse = "Livro trata tudo sobre java!";
     
     System.out.println("Joan locou o livro "+livro.nome+" da categoria "+livro.categoria+", que tem como sinopse: "+livro.sinipse+" e vai ficar como o mesmo durente "+livro.tempoLocacao+" dias.");
    
    }
    
    
}
