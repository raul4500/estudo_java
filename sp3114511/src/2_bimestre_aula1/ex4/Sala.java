package ex4;

public class Sala {
    
    private Integer numero;
    private Integer capacidade;

    public Sala(Integer n, Integer c){
        this.capacidade = c;
        this.numero = n;
    }

    public Integer getNumero(){
        return this.numero;
    }

    public Integer getCapacidade(){
        return this.capacidade;
    }

}
