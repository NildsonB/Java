package heranca_e_polimorfismo.exercicios.ex001;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    static Ticket halfPrice = new HalfPrice();
    static TicketFamily family = new TicketFamily();

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        halfPrice.setValue(25);

        var option = -1;
        do {

            System.out.println("=======Selecione uma das opções abaixo=======");
            System.out.println("1 - Selecionar filme");
            System.out.println("2 - Selecionar se é Dub ou Leg");
            System.out.println("3 - Selecionar tipo de ingresso");
            System.out.println("4 - Imprimir entrada para o filme");
            System.out.println("5 - Sair");
            option = scanner.nextInt();

            switch (option) {
                case 1 -> selectMovie();
                case 2 -> selectDubOrLeg();
                case 3 -> selectTypeOfTicket();
                case 4 -> printTicket();
                case 5 -> System.exit(0);

            }

        }while (true);
    }

    public static void selectMovie() {
        var option = -1;
        do {
            System.out.println("1 - Jogos Vorazes");
            System.out.println("2 - Harry Potter");
            System.out.println("3 - Família do Futuro");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> halfPrice.setNameofMovie("Jogos Vorazes");
                case 2 -> halfPrice.setNameofMovie("Harry Potter");
                case 3 -> halfPrice.setNameofMovie("Família do Futuro");
                default -> System.out.println("Opção inválida");
            }
        }while (option != 1 && option != 2 && option != 3);
    }

    public static void selectDubOrLeg() {
        var option = -1;
        do {
            System.out.println("1 - Dublado");
            System.out.println("2 - Legendado");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> halfPrice.setLegOrDub("Dublado");
                case 2 -> halfPrice.setLegOrDub("Legendado");
                //case 3 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }
        }while (option != 1 && option != 2);
    }

    public static void selectTypeOfTicket() {
        var option = -1;
        do {
            System.out.println("1 - Ingresso Normal");
            System.out.println("2 - Meia Entrada");
            System.out.println("3 - Ingresso Família");
            option = scanner.nextInt();
            switch (option) {
                case 1 -> halfPrice.setValue(halfPrice.value);
                case 2 -> ticketHalfPrice();
                case 3 -> ticketFamily();
                default -> System.out.println("Opção inválida");
            }
        }while (option != 1 && option != 2 && option != 3);
    }

    public static void ticketHalfPrice(){
        var value = new HalfPrice().selection(halfPrice).getValue();
        halfPrice.setValue(value);
    }

    public static void ticketFamily() {
        System.out.println("Informe quantas pessoas vão usar o ingresso");
        var numberOfPeople = scanner.next();
        family.setNumberOfPeople(Integer.parseInt(numberOfPeople));
        var value = new TicketFamily().selection(halfPrice).getValue();
        halfPrice.setValue(value);
    }

    public static void printTicket() {
        System.out.println(halfPrice.getNameofMovie());
        System.out.println(halfPrice.getLegOrDub());
        System.out.println(halfPrice.getValue());
    }

}
