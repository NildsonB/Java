package heranca_e_polimorfismo.domain;

public non-sealed class Manager extends Employee {

    public Manager(String code, String name, String address, int age, double salary, String login, String password, double commision) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.commision = commision;
    }

    @Override
    public String getCode(){
        return "MN" + super.getCode();
    }

    @Override
    public double getFullSalary() {
        return this.salary + this.commision;
    }

    public Manager() {
    }

    private String login;

    private String password;

    private double commision;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommision() {
        return commision;
    }

    public void setCommision(double commision) {
        this.commision = commision;
    }
}
