package Ex_11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta(2563, "Jessica");
        Conta conta2 = new Conta(2563, "Jennifer");

        System.out.println("Conta da " + conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println("Conta da " + conta2.getTitular() + ": " + conta2.getSaldo());
        System.out.println();

        conta1.depositar(500000);

        System.out.println("Conta da " + conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println("Conta da " + conta2.getTitular() + ": " + conta2.getSaldo());
        System.out.println();

        conta2.levantar(2000);

        System.out.println("Conta da " + conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println("Conta da " + conta2.getTitular() + ": " + conta2.getSaldo());
        System.out.println();

        conta1.transferencia(200000, conta2);

        System.out.println("Conta da " + conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println("Conta da " + conta2.getTitular() + ": " + conta2.getSaldo());
        System.out.println();

        conta2.transferencia(100, conta1);

        System.out.println("Conta da " + conta1.getTitular() + ": " + conta1.getSaldo());
        System.out.println("Conta da " + conta2.getTitular() + ": " + conta2.getSaldo());
        System.out.println();

    }
}
