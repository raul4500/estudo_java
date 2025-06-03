package Biblioteca;

public class ItemBiblioteca {
    private String titulo;
    private Integer anoPublicacao;

    public ItemBiblioteca(){
        this.titulo = "";
        this.anoPublicacao = 0;
    }

    public ItemBiblioteca(String titulo, Integer ano){
        this.titulo = titulo;
        this.anoPublicacao = ano;
    }

    public String exibirInformacoes(){
        return (this.titulo+" de "+this.anoPublicacao+" ");
    }

}
