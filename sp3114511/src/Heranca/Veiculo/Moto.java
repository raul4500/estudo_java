package Veiculo;

public class Moto extends Veiculo{
    private Integer cilindradas;

    public Moto (String ma, String mo, Integer q){
        super(ma, mo);
        this.cilindradas = q;
    }

    public static void main(String[] args) {
        Moto m = new Moto("Royal-Enfiel", "meteor-350", 2);
        //m.ligar();
        //m.desligar();

        for(Integer i=0; i<=9; i++){
            for(Integer j=0; j<=i; j++){
                System.out.println(" ");
            }
            System.out.println("0");
        
        
        }
    }
}
