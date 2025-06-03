package Transporte;

public class Carro extends Transporte{
    private String combustivel;

    public Carro (Integer capacidade, Integer v, String c){
        super(capacidade, v);
        this.combustivel = c;
    }

    public void abastecer(){
        System.out.println("O combustível está cheio!");
    }

    public static void main(String[] args) {
        Carro c = new Carro(5, 120, "diesel");
        System.out.println(c.toString()+"\nTipo_de_Combustível: "+c.combustivel);
        c.abastecer();
    }
}
