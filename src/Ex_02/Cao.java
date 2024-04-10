package Ex_02;

public class Cao {
    private String nome;
    private String raca;
    private String latido = "Au au au";

    /**
     * metodo construtor para um novo cao
     * @param nome do cao
     * @param raca do cao
     */
    public Cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    /**
     * Metodo get para o nome do cao
     * @return nome do cao
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo get para a raça do cao
     * @return raça do cão
     */
    public String getRaca() {
        return raca;
    }

    public String getLatido() {
        return latido;
    }

    public void setLatido(String latido) {
        this.latido = latido;
    }

    public void latir() {
        System.out.println(this.latido);
    }

}
