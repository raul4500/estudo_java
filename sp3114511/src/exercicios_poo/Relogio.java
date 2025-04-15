package src.exercicios_poo;

public class Relogio {
    
    private Integer hora;
    private Integer minuto;
    private Integer segundo;

    public Relogio(){
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Relogio( Integer h, Integer m, Integer s ){
        hora = h;
        minuto = m;
        segundo = s;
    }

    public void setHora(Integer hora){
        this.hora = hora;
    }
    public Integer getHora(){
        return this.hora;
    }

    public void setMinuto(Integer minuto){
        this.minuto = minuto;
    }
    public Integer getMinuto(){
        return this.minuto;
    }

    public void setSegundo(Integer segundo){
        this.segundo = segundo;
    }
    public Integer getSegundo(){
        return segundo;
    }

    public static void main(String[] args) {

        Relogio r = new Relogio(12, 32, 8);

        Relogio r2 = new Relogio();
        
        r2.setHora(10);
        r2.setMinuto(15);
        r2.setSegundo(20);


        System.out.println( r.getHora() + ":" + r.getMinuto() + ":" + r.getSegundo() );

        System.out.println( r2.getHora() + ":" + r2.getMinuto() + ":" + r2.getSegundo() );
    }

}






