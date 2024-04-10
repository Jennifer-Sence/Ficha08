package Ex_09;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade = 0;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void vender(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("SEM STOCK APENAS " + this.quantidade + " unidades");
        }else{
            this.quantidade -= quantidade;
        }
    }

    public void comprar(int quantidade){
        this.quantidade += quantidade;
    }


}
