package heranca_e_polimorfismo.exercicios.ex002;

public sealed class Employee permits Seller, Attendant {

    protected String name;

    protected String email;

    protected String password;

    protected boolean isManager;
}
