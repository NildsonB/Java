import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente marcos = new Cliente("Marcos", 32165563);
        Cliente nicole = new Cliente("Nicole", 32343463);
        Cliente antonio = new Cliente("Antonio", 32343434);

        Conta poupanca = new ContaPoupanca(nicole);
        Conta corrente = new ContaCorrente(marcos);
        Conta poupanca2 = new ContaPoupanca(antonio);
        corrente.depositar(500);
        poupanca.depositar(500);
        poupanca2.depositar(500);
        corrente.sacar(200);

        corrente.transferir(300, poupanca);
//        corrente.extrato();
//        poupanca.extrato();
//        poupanca2.extrato();
        List<Conta> contas = new ArrayList<>();
        contas.add(poupanca);
        contas.add(poupanca2);
        contas.add(corrente);
        Banco banco = new Banco();
        banco.setContas(contas);
        banco.listarContas();

    }
}
