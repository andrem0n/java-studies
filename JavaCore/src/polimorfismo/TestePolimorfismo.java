package polimorfismo;

public class TestePolimorfismo {

  public static void main(String[] args) {
    Conta conta = new Conta();
    conta.setSaldo(1000);
    imprimirSaldo(conta);
    //=========================================================================

    ContaCorrente contaCorrente = new ContaCorrente();
    contaCorrente.setSaldo(3500);
    imprimirSaldo(contaCorrente);
    //=========================================================================

    ContaPoupanca contaPoupanca = new ContaPoupanca();
    contaPoupanca.setSaldo(2100);
    imprimirSaldo(contaPoupanca);
  }

  public static void imprimirSaldo(Conta conta) {
    System.out.println("Saldo da conta: " + conta.getSaldo());

    if (conta instanceof ContaCorrente) {
      System.out.println("Limite da conta corrente: " + ((ContaCorrente) conta).getLimite());
    }

    if (conta instanceof ContaPoupanca) {
      System.out
          .println("O rendimento da conta poupança é: " + ((ContaPoupanca) conta).getRendimento());
    }
  }
}
