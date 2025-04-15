package src.POO;

public class Aluno {
    
    //atributos privados (encapsulamento)!
    private String nome;
    private Integer idade;

    /*  método construtor
        -sempre publico
        -sempre com o mesmo nome da classe
        -se deve inicicar os atributos com o valor dos argumentos)!
    */
    public Aluno( String n, Integer i){
        nome = n;
        idade = i;
    }

}
