package src.exercicios_poo;

public class Tenis {
    private String cor;
    private Double preco;
    private String marca;

    public Tenis(){
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

        Tenis t = new Tenis();

        t.setCor("Preto");
        t.setMarca("Nike");
        t.setPreco(1000);

        System.out.println("Cor:" + t.getCor() + "\nPreço: " + t.getPreco() + "\nMarca: " + t.getMarca());
    }
}
