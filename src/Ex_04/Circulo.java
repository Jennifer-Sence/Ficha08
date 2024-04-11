package Ex_04;

public class Circulo {
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }
    public double getRaio() {
        return raio;
    }

    public double area(){
        double area = 3.14 * this.raio * this.raio;
        return area;
    }

    public double circunferencia(){
        double circunf = 2 * 3.14 * this.raio;
        return circunf;
    }

}
