package Animal;

public class Gato extends Animal {
    private String animal;

    public Gato(String n, Integer i, String a){
        super(n, i);
        this.animal = a;
    }

    public static void main(String[] args) {
        Gato g = new Gato("Thor", 12, "gato");
        g.emitirSom(g.animal);
    }
}
