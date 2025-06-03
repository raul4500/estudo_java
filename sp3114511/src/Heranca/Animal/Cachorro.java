package Animal;

public class Cachorro extends Animal{
    private String animal;

    public Cachorro(String n, Integer i, String a){
        super(n, i);
        this.animal = a;
    }

    public static void main(String[] args) {
        Cachorro c = new Cachorro("Thor", 12, "cachorro");
        c.emitirSom(c.animal);
    }
}
