package Aula20.exercicioBanco;

import java.util.Scanner;

public class Banco {

    public static String leString(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.next();
    }

    public static int leFloat(String mensagem) {
        Scanner ler = new Scanner(System.in);
        System.out.println(mensagem + ": ");
        return ler.nextInt();
    }

    public static ContaCorrente cadastraCC() {
        Scanner ler = new Scanner(System.in);

        String titular = leString("Para cadastrar uma conta entre com o nome do titular:");

        String senha = leString("Defina uma senha de acesso:");

        float limite = leFloat("Entre com o deposito inicial: ");

        ContaCorrente c1 = new ContaCorrente(titular,senha,limite);
        System.out.println("Conta cadastrada com o identificador"+c1.getIdentificador());
        return c1;
    }

    public static ContaPoupanca cadastraCP() {
        Scanner ler = new Scanner(System.in);

        String titular = leString("Para cadastrar uma conta entre com o nome do titular:");

        String senha = leString("Defina uma senha de acesso:");

        float limite = leFloat("Entre com o deposito inicial: ");

        ContaPoupanca c1 = new ContaPoupanca(titular,senha,limite);

        System.out.println("Conta cadastrada com o identificador"+c1.getIdentificador());

        return c1;
    }

    public static ContaCorrente acessaCC(ContaCorrente c1) {
        Scanner ler = new Scanner(System.in);
        String opc;
        System.out.println("Bem vindo" + c1.getTitular());
        System.out.println("Acessando a conta" + c1.getIdentificador());
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("d - realizar um depósito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar saldo");
            System.out.println("a - alterar senha");
            System.out.println("Para sair digite e");
            opc = leString("").toLowerCase();

            switch (opc) {
                case "d" -> {
                    float valor = leFloat("Qual valor deseja depositar: ");
                    c1.depositar(valor);
                    System.out.println("Deposito realizado com sucesso");
                }
                case "s" -> {
                    float valor = leFloat("Digite o valor do saque: ");
                    if (c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo insuficiente");
                }
                case "v" -> {
                    System.out.println(c1.verificaSaldo());
                }
                case "a" -> {
                    String senha = leString("Digite a nova senha: ");
                    c1.setSenha(senha);
                }
            }
        } while (!opc.equals("e"));
        return c1;
    }

    public static ContaPoupanca acessaCP(ContaPoupanca c1) {
        Scanner ler = new Scanner(System.in);
        String opc;
        System.out.println("Bem vindo"+c1.getTitular());
        System.out.println("Acessando a conta"+c1.getIdentificador());
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("d - realizar um depósito");
            System.out.println("s - realizar um saque");
            System.out.println("v - verificar saldo");
            System.out.println("a - alterar senha");
            System.out.println("Para sair digite e");
            opc = leString("").toLowerCase();

            switch(opc){
                case "d" ->{
                    float valor = leFloat("Qual valor deseja depositar: ");
                    c1.depositar(valor);
                    System.out.println("Deposito realizado com sucesso");
                }
                case "s" ->{
                    float valor = leFloat("Digite o valor do saque: ");
                    if(c1.sacar(valor))
                        System.out.println("Saque realizado");
                    else
                        System.out.println("Saldo insuficiente");
                }
                case "v" ->{
                    System.out.println(c1.verificaSaldo());
                }
                case "a" ->{
                    String senha = leString("Digite a nova senha: ");
                    c1.setSenha(senha);
                }
            }
        } while (!opc.equals("e"));
        return c1;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ContaCorrente[] listaCC = new ContaCorrente[20];
        ContaPoupanca[] listaCP = new ContaPoupanca[20];
        int contCC = 0;
        int contCP = 0;
        String opc;
        do {
            System.out.println("Selecione uma opção: ");
            System.out.println("Para cadastrar uma conta corrente: a");
            System.out.println("Para cadastrar uma conta poupança: b");
            System.out.println("Para acessar uma conta corrente: c");
            System.out.println("Para acessar uma conta poupança: d");
            System.out.println("Para sair: 'e' ");
            opc = leString("").toLowerCase();

            switch(opc){
                case "a" ->{
                    listaCC[contCC] = cadastraCC();
                    contCC++;
                }
                case "b" ->{
                    listaCP[contCP] = cadastraCP();
                    contCP++;
                }
                case "c" ->{
                String identificador = leString("Qual o identificador: ");
                String senha = leString("Qual a sua senha: ");
                int posicao = -1;
                    for (int i = 0; i < contCC; i++) {
                        if (listaCC[i].validaAcesso(identificador,senha)){
                            posicao = i;
                        }
                        if(posicao>=0){
                            listaCC[posicao] = acessaCC(listaCC[posicao]);
                        }
                        else{
                            System.out.println("Conta inexistente ou senha incorreta! ");
                        }
                    }
                }
                case "d" ->{
                    String identificador = leString("Qual o identificador: ");
                    String senha = leString("Qual a sua senha: ");
                    int posicao = -1;
                    for (int i = 0; i < contCP; i++) {
                        if (listaCP[i].validaAcesso(identificador,senha)){
                            posicao = i;
                        }
                        if(posicao>=0){
                            listaCP[posicao] = acessaCP(listaCP[posicao]);
                        }
                        else{
                            System.out.println("Conta inexistente ou senha incorreta! ");
                        }
                    }
                }
            }
        } while (!opc.equals("e"));
    }
}
