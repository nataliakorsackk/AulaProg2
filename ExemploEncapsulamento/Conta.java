package Aula20.ExemploEncapsulamento;

import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private float saldo;

    /**criando um atributo estatico
    um atributo estatico possui um valor permanente, todos os valores chamados com esse atributo serão o mesmo.
    Banco b1 = new Banco()
    b1.nomeBanco = "Banco cimol";
    System.out.println("O nome do banco é: "+b1.nomeBanco) - o nome será banco cimol e se declarar um novo banco
    ele também se chamará banco cimol.**/

    static String nomeBanco;

    public String getIdentificador(){
        return identificador;
    }
    private void geraIdentificador(){
        String identificador = "";
        Random aleatorio = new Random();
        for (int i = 0; i < 4; i++) {
            identificador += (char) aleatorio.nextInt(65, 90);
        }
        identificador += aleatorio.nextInt(1000,2000);
        this.identificador = identificador;
    }

    public Conta(String titular, float saldo){
        this.titular = titular;
        this.saldo = saldo;
        geraIdentificador();
    }

    boolean sacar(float valor){
        if(valor<= saldo){
            saldo-=valor;
            return true;
        }
        return false;
    }

    //utilizamos o get para ler um atributo definido como privado
    public String getTitular(){
        return titular;
    }

    //utilizamos o set para para alterar um atributo definido como privado
    public void setTitular(String titular){
        this.titular = titular;
    }

    void depositar (float valor){
        saldo+=valor;
    }

    String verificaSaldo(){
        return String.format("seu saldo é de R$%.2f", saldo);
    }
}
