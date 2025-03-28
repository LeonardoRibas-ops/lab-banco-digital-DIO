
public class ContaCorrente extends Conta {

    private double limiteCredito;

    // Modificação do construtor para incluir limite de crédito
    public ContaCorrente(Cliente cliente, double limiteCredito) {
        super(cliente);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public void sacar(double valor) {
        // Verifica se o saque não ultrapassa o saldo + o limite de crédito
        if (valor <= (this.getSaldo() + limiteCredito)) {
            super.sacar(valor);  // Realiza o saque, mesmo que ultrapasse o saldo
            System.out.println("Saque realizado: R$ " + valor);
        } else {
            System.out.println("Saque inválido: Excede limite de crédito.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Limite de Crédito: %.2f", this.limiteCredito));
    }
}

