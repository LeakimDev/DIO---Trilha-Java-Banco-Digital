public class Main {
    public static void main(String[] args){
        Cliente mikael = new Cliente();
        mikael.setName("Mikael");

        Conta cc = new ContaCorrente(mikael);
        Conta pp = new ContaPoupanca(mikael);

        cc.depositar(100.00);
        cc.transferir(25.00, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}