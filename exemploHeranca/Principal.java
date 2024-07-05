package Aula20.exemploHeranca;

public class Principal {
    public static void main(String[] args) {
        Motorista mot1 = new Motorista("Jonas", "silva", 123574);

       /** mot1.setNome("Jonas");
        mot1.setSobrenome("Silva");
        mot1.setMatricula(1258);**/

        Engenheiro eng1 = new Engenheiro("Leandro", "Moraes", 14235, "00008765-08");

       /**eng1.setNome("Leandro");
        eng1.setSobrenome("Moraes");
        eng1.setCrea("00008765-08");**/
    }
}
