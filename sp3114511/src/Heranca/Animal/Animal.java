package Animal;

public class Animal {
    private String nome;
    private Integer idade;

    public Animal(){
        this.nome = "";
        this.idade = 0;
    }


    public Animal(String n, Integer i){
        this.nome = n;
        this.idade = i;
    }

    public void emitirSom(String animal){
        if(animal=="cachorro"){
            System.out.println("Latido");
        }else{
            System.out.println("Miau");
        }
    }
}
