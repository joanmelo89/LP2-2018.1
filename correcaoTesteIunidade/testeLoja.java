
package loja;

public class testeLoja {
    public static void main(String[] args) {
        
    Loja caixa=new Loja ();
    caixa.saldoInicial= 500;
    caixa.novoSaldo=0;
    caixa.novoSaldoAposTroco=0;
    caixa.dinheiroAReceber=100;
    caixa.troco=50;
    caixa.fechamentoDeCaixa=0;
   
        System.out.println("Saldo Inicial: R$"+caixa.saldoInicial);
        System.out.println();
        System.out.println("Dinheiro a receber: R$");
        caixa.novoSaldo=caixa.saldoInicial+caixa.dinheiroAReceber;
        System.out.println();
        System.out.println("Novo Saldo: R$"+caixa.novoSaldo);
        System.out.println();
        System.out.println("Troco: R$"+caixa.troco);
        System.out.println();
        caixa.novoSaldoAposTroco=caixa.novoSaldo-caixa.troco;
        System.out.println("Novo Saldo após troco  R$"+caixa.novoSaldoAposTroco);
        System.out.println("Fechamento de Caixa:  R$"+caixa.novoSaldoAposTroco);
        
    }
}
}
