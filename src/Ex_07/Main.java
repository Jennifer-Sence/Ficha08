package Ex_07;

public class Main {
    public static void main(String[] args) {

        Livro asoiaf = new Livro("A Song", "GRRM", "Fantasia", 200, 1564);
        asoiaf.exibirDetalhes();
        System.out.println();
        Livro mmb = new Livro("Marry my husband", "Yang", "Drama", 500, 1464);
        mmb.exibirDetalhes();

    }
}
