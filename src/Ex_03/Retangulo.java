package Ex_03;

public class Retangulo {

    private double altura;
    private double largura;

    /**
     * Metodo construtor para um retangulo
     * @param altura
     * @param largura
     */
    public Retangulo(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    /**
     * Metodo para calcular a area da de um retangulo
     * @return area do retangulo
     */
    public double area(){
        double area = this.altura * this.largura;
        return area;
    }

    /**
     * Metodo para calcular o perimetro de um retangulo
     * @return perimetro
     */
    public double perimetro () {
        double perimetro = (2 * altura) + (2 * largura);
        return perimetro;
    }

}
