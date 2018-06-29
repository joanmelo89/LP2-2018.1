
package agenda;
import java.util.Scanner;
public class Agenda {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int quantidadeDeNumero = 0; 
        int novaConsulta = 1;
        int querConsultar =1;
        
        String nomes[]; 
        String telefones[];
        
        String nome = "";
        String telefone = "";
        
        System.out.println("Preparando a Agenda:");
        System.out.println();
        System.out.println("Entre com a quantidade de números a serem registrados:");
        quantidadeDeNumero = scan.nextInt();
        System.out.println();
        
        nomes = new String[quantidadeDeNumero];
        telefones = new String[quantidadeDeNumero];
        
        for (int i = 0; i < quantidadeDeNumero; i++){
            System.out.println("Entre com o nome: ");
            nomes[i] = scan.next();
            System.out.println("Entre com o telefone : ");
            telefones[i] = scan.next();
            System.out.println();
        }
        
        System.out.println("AGENDA PRONTA!");
        System.out.println();
        System.out.println();
        
        System.out.println("Consultar na agenda...");
        while(querConsultar == 1){
            System.out.println("Quer consultar algum número? entre com o valor 1");
            querConsultar = scan.nextInt();
            while (novaConsulta == 1){
                telefone = "Contato não encontrado";
                System.out.println();
                System.out.println("Entre com o nome da pessoa a ser consultada: ");
                nome = new Scanner(System.in).next(); 
                    for (int x = 0; x < quantidadeDeNumero; x++){
                        if (nomes[x].equalsIgnoreCase(nome)){
                        telefone = telefones[x];
                        }
                    }
                System.out.println();
                System.out.println("Número encontrado na agenda: '" + telefone + "'");
               
                System.out.println();
                System.out.println("Quer fazer uma nova consulta? entre com o valor 1:");
                novaConsulta = scan.nextInt();
                System.out.println();
            } 
        }    
        System.out.println("");
        System.out.println("Programa Finalizado!");
    }
 
}
    
    

