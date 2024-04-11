package Ex_06;

public class Main {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;
        Calculadora calculadoraXpto = new Calculadora();
        System.out.println();
        System.out.println("Soma: " + calculadoraXpto.adicao(num1, num2));
        System.out.println("Subtração: " + calculadoraXpto.subtracao(num1, num2));
        System.out.println("Multiplicação: " + calculadoraXpto.multiplicacao(num1, num2));
        System.out.println("Divisão: " + calculadoraXpto.divisao(num1, num2));

    }
}
