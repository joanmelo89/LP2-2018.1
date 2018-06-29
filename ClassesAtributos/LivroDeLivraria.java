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
public class LivroDeLivraria {
    public static void main(String[] args) {
        Livro livro = new Livro();
        
        livro.anoLancamento = 2018;
        livro.autor = "Devinho Novaes";
        livro.isbn = "28368236";
        livro.nome = "Novinha";
        livro.qtdPaginas = 51;
        
        System.out.println("Livro a venda:");
        System.out.println();
        System.out.println("Nome: "+livro.nome);
       System.out.println("Autor: "+livro.autor); 
    }
}
