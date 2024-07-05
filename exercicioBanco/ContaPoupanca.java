package Aula20.exercicioBanco;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(String titular, String senha, float deposito){
        super(titular, senha);
        saldo = deposito;

    }
    public boolean sacar(float valor){
        if(valor<= saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }
    public String verificaSaldo(){
        return String.format("seu saldo é de R$%.2f", saldo);
    }
}
