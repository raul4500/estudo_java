package atividadeRevisao;

public class Produto{
    
    private String nome;
    private Double preco;
    private Integer quantidade;
    
    public Produto(String n, Double p, Integer q){
        nome = n;
        preco = p;
        quantidade = q;
    }
    
    public Produto(String n, Double p){
        nome = n;
        preco = p;
        quantidade = 0;
    }
    
    public void exibirInfo(){
        System.out.println("Nome: "+this.nome+"\nPreço: "+this.preco+"\nQtd: "+this.quantidade);
    } 
    
    public void adicionarEstoque(Integer q){
        this.quantidade += q;
    }
    
    public void removerEstoque(Integer q){
        this.quantidade -= q;
    }
    

    
}