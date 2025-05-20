package ex3;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;

    public Cliente(String n, String t, String e){
        this.nome = n;
        this.telefone = t;
        this.email = e;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setTelefone(String n){
        this.telefone = n;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public String getEmail(){
        return this.email;
    }

}
