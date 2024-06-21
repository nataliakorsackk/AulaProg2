package Aula20.ExemploEncapsulamento;

import java.util.Scanner;
public class PessoaPrincipal {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = ler.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = ler.next();

        Pessoa p1 = new Pessoa(nome, sobrenome);
        System.out.println("Pessoa cadastrada com os dados: "+p1.getNome()+" "+p1.getSobrenome());

        System.out.println("Deseja fazer alguma alteração, para sim digite S para não digite N: ");
        String response = ler.next();
        while(response !="S" && response != "N"){
            System.out.println("Deseja fazer alguma alteração, para sim digite S para não digite N: ");
        }
        if(response == "S"){
            System.out.println("Digite seu nome: ");
            nome = ler.next();
            p1.setNome(nome);
            System.out.println("Digite seu sobrenome: ");
            sobrenome = ler.next();
            p1.setSobrenome();
        }
        else{
            System.out.println("Obrigado pelo cadastro! ");
        }
    }
}
