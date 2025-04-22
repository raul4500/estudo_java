public class Produto{
    
    private String nome;
    private Double preco;
    private Integer estoque;
    
    public Produto(){
        nome = "";
        preco = 0.0;
        estoque = 0;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setPreco(Double preco){
        this.preco = preco;
    }
    public Double getPreco(){
        return this.preco;
    }
    
    public void setNome(Integer estoque){
        this.estoque = estoque;
    }
    public Integer getEstoque(){
        return this.estoque;
    }
    
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("garrafa");
		System.out.println(produto.nome);
	}
}

public class ContaBancaria{
    
    private String titular;
    private Integer numero;
    private Double saldo;
    
    public ContaBancaria(String titular, Integer numero, Double saldo){
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldo;
    }
    
        public ContaBancaria(String titular, Integer numero){
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }

    public Double getSaldo(){
        return this.saldo;
    }
    
    public void Depositar(Double v){
        this.saldo = v;
    }
    
    public void Sacar(Double v){
        if (v<this.saldo)
            this.saldo -= v;
        else
            System.out.println("Não tem crédito o suficiente");
    }
    
    
	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria("raul", 1);
		c.Depositar(10.32);
		c.Sacar(300.32);
		System.out.println("saldo: "+c.saldo);
		
	}
}
