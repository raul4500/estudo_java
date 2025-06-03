package Veiculo;

public class Carro extends Veiculo{
    private Integer quantidadePortas;

    public Carro (String ma, String mo, Integer q){
        super(ma, mo);
        this.quantidadePortas = q;
    }

    public static void main(String[] args) {
        Carro c = new Carro("chevrolet", "camaro", 2);
        c.ligar();
        c.desligar();
    }
}
