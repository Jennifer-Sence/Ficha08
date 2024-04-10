package Ex_11;

public class Conta {
    private int numeroConta;
    private double saldo = 0;
    private String titular;

    public Conta(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void transferencia(double valoTransf, Conta contaDestino) {
        if (this.saldo < valoTransf) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valoTransf;
            contaDestino.saldo += valoTransf;
        }
    }

    public void levantar(double valorTransferir) {
        if (this.saldo < valorTransferir) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= valorTransferir;
        }

    }

    public void depositar(double valorTransferir) {
        this.saldo += valorTransferir;
    }

    public void mostrarSaldo() {
        System.out.println("Saldo da conta: " + this.saldo);
    }

}
