package Ex_05;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public String ligar(){
        String ligado =("O carro está ligado.");
        return ligado;
    }
}
