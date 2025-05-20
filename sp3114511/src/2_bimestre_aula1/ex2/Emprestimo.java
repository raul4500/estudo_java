package ex2;

import java.time.LocalDate;

public class Emprestimo {
    
    private String livro;
    private LocalDate data_e;
    private Leitor leitor;

    public Emprestimo(String l, String n, Integer m) {
        this.leitor = new Leitor(n, m);
        this.livro = l;
        this.data_e = LocalDate.now();
    }

    public void detalharEmprestimo(){
        System.out.println("Livro: " + livro + "\nData: " + data_e + "\nNome Leitor: " 
        + leitor.getNome() + "\nMatrícula: "+ leitor.getMatricula());
    }
    
    public static void main(String[] args) {
        Emprestimo e = new Emprestimo("O cortiço", "Raul", 12345);
        e.detalharEmprestimo();
        System.out.println("-------------------------------------------");
        Emprestimo e1 = new Emprestimo("O cortiço2 2 ", "Matheus", 12345);
        e1.detalharEmprestimo();
    }

}
