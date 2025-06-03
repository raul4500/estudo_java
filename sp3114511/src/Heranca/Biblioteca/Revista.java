package Biblioteca;

public class Revista extends ItemBiblioteca {
    private Integer edicao;

    public Revista (String titulo, Integer ano, Integer a){
        super(titulo, ano);
        this.edicao = a;
    }

    public static void main(String[] args) {
        Revista l = new Revista("Turma-da-Mônica", 1950, 23);
        System.out.println(l.exibirInformacoes()+"| edição: "+l.edicao);
    }
}