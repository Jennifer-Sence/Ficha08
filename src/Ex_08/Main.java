package Ex_08;

public class Main {
    public static void main(String[] args) {
        Aluno jenny = new Aluno("Jenny", 27, "Engenharia Biomédica", 15);
        Aluno johny = new Aluno("Johny", 28, "Engenharia Biomédica", 8);

        System.out.println();
        System.out.println("Situaçao da " + jenny.getNome() );
        jenny.situacao();
        System.out.println("Situção do " + johny.getNome());
        johny.situacao();

    }
}
