package Transporte;

public class Bicicleta extends Transporte{
    private String tipoBicicleta;

    public Bicicleta (Integer capacidade, Integer v, String t){
        super(capacidade, v);
        this.tipoBicicleta = t;
    }

    public void pedalar(Integer km){
        System.out.println("Você pedalou por "+km+" kilômetros!");
    }
    public static void main(String[] args) {
        Bicicleta b = new Bicicleta(5, 120, "passeio");
        System.out.println(b.toString()+"\nTipo_de_bike: "+b.tipoBicicleta);
        b.pedalar(50);
    }
}

    