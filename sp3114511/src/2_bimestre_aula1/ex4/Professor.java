package ex4;

public class Professor {

    private String nome;
    private String especialidade;

    public Professor(String n, String e){
        this.nome = n;
        this.especialidade = e;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEspecialidade(String e){
        this.especialidade = e;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

}
