
public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        // Criação da Conta Corrente com limite de crédito de R$ 500,00
        Conta cc = new ContaCorrente(venilton, 500);
        
        // Criação da Conta Poupança
        Conta poupanca = new ContaPoupanca(venilton);

        // Operações de conta corrente
        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        // Operações de saque e transferência
        cc.sacar(1200); // Saque permitido dentro do limite de crédito (Saldo + Limite de Crédito)
        cc.sacar(1800); // Saque inválido (Excede limite de crédito)

        // Exibindo extratos
        cc.imprimirExtrato();

