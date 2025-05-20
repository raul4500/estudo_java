package ex1;

import java.time.LocalDate;

public class Reserva {
    
    private static Integer numero_reserva = 0;
    private LocalDate data_e;
    private LocalDate data_s;
    private Hospede h1;

    public Reserva(String n,String e,String c) {
        this.h1 = new Hospede(n, e, c);
        this.data_e = LocalDate.now();
        this.data_s = null;
        numero_reserva++;
    }

    public void setDatasaida(){
        this.data_s = LocalDate.now();
    }

    public void exibirResumo(){
        System.out.println("Nome:" + h1.getNome() + "\nEmail:" + h1.getEmail() + 
        "\nCPF:" + h1.getCpf() + "\nN_reserva:" + numero_reserva + "\nData_e:" + data_e + "\nData_s:" + data_s);
    }

    
    public static void main(String[] args) {
        Reserva r = new Reserva("raul", "raul@email", "12345678901");
        r.setDatasaida();
        Reserva r1 = new Reserva("matheus", "matheus@email", "09876543212");
        r.exibirResumo();
        System.out.println("---------------");
        r1.exibirResumo();
    }

}
