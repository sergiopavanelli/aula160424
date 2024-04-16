import java.util.Date;



public class Transacao {

    int id;
    Date data;
    Double valor;

    public Transacao (int id, Date data, Double valor) {

        this.id = id; 
        this.data = data;
        this.valor = valor;
    }


    public int getId() {
        return id;
    }


    public Double contaDebito (Double valor) {
        return valor;        
    }

    public Double contaCredito (Double valor)  {
        return valor;}





}
