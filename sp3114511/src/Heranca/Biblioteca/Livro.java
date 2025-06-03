package Biblioteca;

public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro (String titulo, Integer ano, String a){
        super(titulo, ano);
        this.autor = a;
    }

    public static void main(String[] args) {
        Livro l = new Livro("O-cortiço", 1950, "Machado-de-Assis");
        System.out.println(l.exibirInformacoes()+"| autor: "+l.autor);
    }
}
