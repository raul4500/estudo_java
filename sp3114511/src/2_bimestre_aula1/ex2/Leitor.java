package ex2;

public class Leitor {
    
    private String nome;
    private Integer matricula;

    public Leitor(String n, Integer m){
        this.nome = n;
        this.matricula = m;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setMatricula(Integer m){
        this.matricula = m;
    }

    public Integer getMatricula(){
        return this.matricula;
    }


}
