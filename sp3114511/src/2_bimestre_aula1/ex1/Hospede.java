package ex1;
public class Hospede {
    
    private String nome;
    private String email;
    private String cpf;

    public Hospede(String n, String e, String c){
        this.nome = n;
        this.email = e;
        this.cpf = c;
    }

    public void setNome(String n){
        this.nome = n;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmail(String n){
        this.email = n;
    }

    public String getEmail(){
        return this.email;
    }

    public String getCpf(){
        return this.cpf;
    }

}
