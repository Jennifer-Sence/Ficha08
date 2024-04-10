package Ex_02;

public class Main {
    public static void main(String[] args) {

        Cao bob = new Cao("bob", "pitbull");
        Cao lupi = new Cao ("lupi", "snoop");
        Cao jolie = new Cao("jolie", "pastor alemao");

        System.out.println("Informações do bob");
        System.out.println(bob.getRaca());
        System.out.println(bob.getNome());
        System.out.println();
        System.out.println("Informações do lupi");
        System.out.println(lupi.getRaca());
        System.out.println( lupi.getNome());
        System.out.println();
        System.out.println("Informações do jolie");
        System.out.println(jolie.getRaca());
        System.out.println(jolie.getNome());

        System.out.println();
        System.out.println("Latido de fabrica");
        lupi.latir();
        bob.latir();
        jolie.latir();

        lupi.setLatido("KKkkkkkk");
        bob.setLatido("Ai ai ai");
        jolie.setLatido("hahahaha");

        System.out.println();
        System.out.println("Novo latido");
        lupi.latir();
        bob.latir();
        jolie.latir();

    }
}
