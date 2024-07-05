package Aula20.ExemploFinal;

public class Exemplo1 {
    //Declarando uma variavel do tipo final
    final double numero;
    // Criando uma constante
    //ela deve receber um valor no momento da declaração
    //acesso universal (public)
    //existe independente da criacao de instancia (static)
    //não pode ser modificada (final)
    public static final double PI = 3.1415926535899793;

    //como não foi definido um valor no momento da declaração, este valor devera ser atribuido ate o final do construtor.
    public Exemplo1(){
        numero = 10;
    }
}
