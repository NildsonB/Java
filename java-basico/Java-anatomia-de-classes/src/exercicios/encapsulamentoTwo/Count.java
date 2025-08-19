package exercicios.encapsulamentoTwo;

public class Count {
    private String name = "";

    private final double balanceInCount;

    private double balanceTotal = 0;


    public Count(double balanceInCount) {
        this.name = name;
        this.balanceInCount = balanceInCount;
        this.balanceTotal = balanceTotal;
    }

    public double getBalance() {
        return balanceInCount;
    }

    public double getBalanceTotal() {
        return balanceTotal;
    }

    public void setBalanceTotal(double balanceTotal) {
        this.balanceTotal = balanceTotal;
    }
}
