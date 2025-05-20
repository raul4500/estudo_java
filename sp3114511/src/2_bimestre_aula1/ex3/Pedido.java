package ex3;

import java.time.*;

public class Pedido {

    private static Integer n_pedido = 0;
    private LocalDate data;
    private Double valor;
    private Cliente cliente;

    public Pedido(String n,String t,String e, Double valor) {
        this.cliente = new Cliente(n, t, e);
        this.data = LocalDate.now();
        this.valor = valor;
        n_pedido++;
    }

    public void emitirNotaFiscal(){
        System.out.println("Numero do pedido: " + n_pedido + "\nData: " + data + "\nNome cliente: " + "\nValor: " + valor 
        + cliente.getNome() + "\ntelefone: "+ cliente.getTelefone() + "\nemail: " + cliente.getEmail());
    
    }
    
    public static void main(String[] args) {
        Pedido p2 = new Pedido("Raul", "1234567890", "raul@email", 123.43);
        Pedido p1 = new Pedido("Matheus", "1234567890", "matheus@email", 12.3);    
        p1.emitirNotaFiscal();
        p2.emitirNotaFiscal();
    }

}
