package src.exercicios_poo;

public class Caneta {

    private String cor;
    private Double preco;
    private String marca;

    public Caneta(){
        cor = null;
        preco = null;
        marca = null;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Double getPreco() {
        return preco;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public static void main(String[] args) {

        Caneta c = new Caneta();

        c.setCor("Azul");
        c.setPreco(1.99);
        c.setMarca("bic");

        System.out.println("Cor:" + c.getCor() + "\nPreço: " + c.getPreco() + "\nMarca: " + c.getMarca());
    }
}
