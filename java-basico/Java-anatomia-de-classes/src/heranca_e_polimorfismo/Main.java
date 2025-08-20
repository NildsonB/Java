package heranca_e_polimorfismo;

import heranca_e_polimorfismo.domain.Employee;
import heranca_e_polimorfismo.domain.Manager;
import heranca_e_polimorfismo.domain.Salesman;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee salesman= new Salesman();
        printEmployee(manager);
        printEmployee(salesman);

    }

    public static void printEmployee(Employee employee){

        System.out.printf("=======%s=======\n", employee.getClass());
        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("Joao");
                manager.setPassword("123456");
                manager.setCommision(1200);

                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getSalary());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getCommision());
            }
            case Salesman salesman -> {
                salesman.setCode("456");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercetPerSold(10);
                salesman.setSoldAmount(1000);


                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getPercetPerSold());
                System.out.println(salesman.getSoldAmount());
            }
        }
        System.out.println(employee.getFullSalary());
        System.out.println(employee.getFullSalary(500));
        System.out.println("==================");
    }
}
