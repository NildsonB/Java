public class Conta {

    private static int incremento = 1;

    private int agencia = 01;
    private int numero;
    private double saldo;
    Cliente cliente;

    public Conta(Cliente cliente) {
        this.numero = incremento++;
        this.cliente = cliente;
        this.agencia = agencia;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void extrato() {
        System.out.println("Titular: "+ this.cliente.getNome());
        System.out.println("Agencia: "+ this.agencia);
        System.out.println("Conta: "+ this.numero);
        System.out.println("Saldo: "+ this.saldo);
    }

    public void transferir(double valor, Conta destino) {
        this.saldo -= valor;
        destino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
