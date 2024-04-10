package Ex_06;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadoraXpto = new Calculadora(10, 5);
        System.out.println();
        System.out.println("Soma: " + calculadoraXpto.adicao());
        System.out.println("Subtração: " + calculadoraXpto.subtracao());
        System.out.println("Multiplicação: " + calculadoraXpto.multiplicacao());
        System.out.println("Divisão: " + calculadoraXpto.divisao());

    }
}
