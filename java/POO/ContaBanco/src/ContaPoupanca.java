public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void extradoContaPoupanca() {
        System.out.println("Extrado ContaPoupança");
        super.extrato();
    }
}
