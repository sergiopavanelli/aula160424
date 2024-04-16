import java.util.Scanner;

public class Conta {

    int id;
    Double saldo = 0.0;   


    public Conta (int id, Double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    
    public boolean debito (Double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        } 
    }

    public void credito (Double valor) {
        if (this.saldo <= valor) {
        } else {
                this.saldo += valor;
            }
        
        }
    
    Scanner teclado =  new Scanner(System.in);



}

