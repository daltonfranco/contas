import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Contas minhaConta = new Contas();

        //minhaConta.numeroDoCartao = 123456789;
        //minhaConta.saldo = 100.00;
        //minhaConta.titular = "Dalton";

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        minhaConta.titular = sc.nextLine();

        System.out.print("Digite o numero do cartao da sua conta: ");
        minhaConta.numeroDoCartao = sc.nextInt();

        System.out.print("Digite o saldo atual de sua conta: ");
        minhaConta.saldo = sc.nextDouble();

        System.out.println("");


        System.out.println("Nome do titular da conta: " + minhaConta.titular);
        System.out.println("Numero do cartao da conta do " + minhaConta.titular + " : " + minhaConta.numeroDoCartao);
        System.out.println("Saldo da conta: " + minhaConta.saldo + " reais");

    }
}
