public class App {
    public static void main(String[] args){

        Contas minhaConta = new Contas();

        minhaConta.numeroDoCartao = 123456789;
        minhaConta.saldo = 100.00;
        
        System.out.println(minhaConta.numeroDoCartao);
        System.out.println(minhaConta.saldo);

    }
}
