package Ex_09;

public class Main {
    public static void main(String[] args) {

        Produto cafe = new Produto("cafe", 2.99);

        System.out.println("Quantidade atual: "+cafe.getQuantidade());

        cafe.comprar(5);
        System.out.println("Quantidade atual: "+cafe.getQuantidade());

        cafe.vender(2);
        System.out.println("Quantidade atual: "+cafe.getQuantidade());

        cafe.comprar(10);
        System.out.println("Quantidade atual: "+cafe.getQuantidade());

        cafe.vender(35);
        System.out.println("Quantidade atual: "+cafe.getQuantidade());
        System.out.println();
    }
}
