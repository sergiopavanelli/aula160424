import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


    Conta conta1 = new Conta(1, 30.0);
    Conta conta3 = new Conta (3, 20.0);

    //teste mac

    Scanner teclado = new Scanner(System.in);

    System.out.println("Digite o valor a ser transferido: ");
    Double valor = teclado.nextDouble();
    
    
    conta1.debito(valor);
    conta3.credito(valor);

    System.out.println("O saldo da conta 3 é: " + conta3.saldo);
    System.out.println("O saldo da conta 1 é: " + conta1.saldo);

    teclado.close();





 
    

    
   
        



    }
}
