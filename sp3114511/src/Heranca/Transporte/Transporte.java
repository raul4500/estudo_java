package Transporte;

public class Transporte {
    private Integer capacidade;
    private Integer velocidadeMaxima;

    public Transporte(){
        this.capacidade = 0;
        this.velocidadeMaxima = 0;
    }

    public Transporte(Integer capacidade, Integer v){
        this.capacidade = capacidade;
        this.velocidadeMaxima = v;
    }

    public String toString(){
        return ("Capacidade: "+this.capacidade+"\nVelocidade_Máxima: "+this.velocidadeMaxima+" km/h");
    }

}
