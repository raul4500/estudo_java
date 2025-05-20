package ex4;

public class Disciplina {
    
    private String nome;
    private String carga_horaria;
    private Professor prof;
    private Sala sala;

    public Disciplina(String nomeprof , String especialidade, String nomedisciplina, String carga, Integer numerosala, Integer capacidade) {
        this.prof = new Professor(nomeprof, especialidade);
        this.sala = new Sala(numerosala, capacidade);
        this.nome = nomedisciplina;
        this.carga_horaria = carga;
    }

    public void resumoDisciplina(){
        System.out.println(nome+"\n"+carga_horaria+"\n"+prof.getEspecialidade()+"\n"+prof.getNome()+"\n"+sala.getCapacidade()+"\n"+sala.getNumero());
    
    }
    
    public static void main(String[] args) {
        Disciplina p2 = new Disciplina("raul", "matematica", "programacao", "10h-12h", 1, 34);   
        p2.resumoDisciplina();
    }
}
