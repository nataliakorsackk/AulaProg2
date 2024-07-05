package Aula20.ExemploFinal;

public class Teste {
    public static void main(String[] args) {
        Exemplo1 ex = new Exemplo1();
        //não é possivel trocar o valor de um atributo final
        // numero = 13;

        //lendo o valor de uma constante (final)
        System.out.println(Exemplo1.PI);
    }
}
