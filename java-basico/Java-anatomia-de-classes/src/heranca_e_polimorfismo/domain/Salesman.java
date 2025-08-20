package heranca_e_polimorfismo.domain;

public non-sealed class Salesman extends Employee {

    public Salesman(String code, String name, String address, int age, double salary, double percetPerSold, double soldAmount) {
        super(code, name, address, age, salary);
        this.percetPerSold = percetPerSold;
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode(){
        return "SL" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((percetPerSold * soldAmount) / 100);
    }

    public Salesman() {
    }

    private double percetPerSold;

    private double soldAmount;

    public double getPercetPerSold() {
        return percetPerSold;
    }

    public void setPercetPerSold(double percetPerSold) {
        this.percetPerSold = percetPerSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }
}
