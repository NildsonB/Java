package heranca_e_polimorfismo;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();

        manager.setName("João");
        //manager.setLogin("Joao");
        //manager.setPassword("123456");

        System.out.println(manager.getName());
        //System.out.println(manager.getLogin());
        //System.out.println(manager.getPassword());
    }
}
