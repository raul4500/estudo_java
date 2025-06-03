package Veiculo;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(){
        this.marca = "";
        this.modelo = "";
    }

    public Veiculo(String ma, String mo){
        this.marca = ma;
        this.modelo = mo;
    }

    public void ligar(){
        System.out.println(this.modelo+" da "+this.marca+" foi ligado");
    }

    public void desligar(){
        System.out.println(this.modelo+" da "+this.marca+" foi desligado");
    }

}
