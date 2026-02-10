public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void extradoContaCorrente() {
        System.out.println("Extrado ContaCorrente");
        super.extrato();
    }
}
