package Ex_10;

public class Main {
    public static void main(String[] args) {

        Funcionario mario = new Funcionario("Mário", 2000, "Mecânica");

        mario.aumentarSalario(0.10);
        mario.exibirDados();

    }
}
