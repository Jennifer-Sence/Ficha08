package Ex_04;

public class Main {
    public static void main(String[] args) {
        //instanciar um circulo "bola"
        Circulo bola = new Circulo(10.30);

        System.out.println("A area do circulo é: " + bola.area());
        System.out.println("a circunferencia do circulo é: " + bola.circunferencia());

    }
}
