package atividadeRevisao;

public class ProgramaPrincipal {
    public static void main(String[] args){
        Produto p2 = new Produto("pen", 1.3);
        Produto p1 = new Produto("pencil", 10.3, 12);
		p1.adicionarEstoque(32);
		p1.removerEstoque(3);
		p1.exibirInfo();
        p2.exibirInfo();
    }
}
