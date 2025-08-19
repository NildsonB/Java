package exercicios.encapsulamentoTwo;

public class Atm {
    private double  specialCheck = 0;

    private double valueEntered;

    private Count count;

    public double getCount() {
        return count.getBalance();
    }

    public void setCount(Count count) {
        this.count = count;
    }

    public double getSpecialCheck() {
        return specialCheck;
    }

    public void setSpecialCheck(double specialCheck) {
        this.specialCheck = specialCheck;
    }

    public double balanceTotal () {
        double balance = getCount();
        double sCheck = getSpecialCheck();
        return balance + sCheck;
    }

    public void setValueEntered(double valueEntered) {
        this.valueEntered = valueEntered;
    }




}
