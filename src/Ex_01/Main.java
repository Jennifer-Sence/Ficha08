package Ex_01;

public class Main {
    public static void main(String[] args) {

        Pessoa jenny = new Pessoa("Jenny", 1.6, 27);
        Pessoa joana = new Pessoa("Joana", 1.55, 38);

        System.out.println("Informações da Jenny");
        System.out.println(jenny.getNome());
        System.out.println(jenny.getAltura());
        System.out.println(jenny.getIdade());
        System.out.println();
        System.out.println("Informações da Joana");
        System.out.println(joana.getNome());
        System.out.println(joana.getAltura());
        System.out.println(joana.getIdade());

    }
}
