package interfaces_e_lambda.exercicios.exe01;

import org.w3c.dom.Text;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\\n");
        System.out.println("Insira a mensagem:\n");
        String mensagem = scanner.next();
        Message message = null;
        int option = -1;
        do {
            System.out.println("===Escolha como enviar a mensagem===");
            System.out.println("1 - SMS");
            System.out.println("2 - E-mail");
            System.out.println("3 - Redes Sociais");
            System.out.println("4 - WhatsApp");
            System.out.println("5 - Sair");
            option = scanner.nextInt();

            System.out.println(message.sendMessage());

            switch (option) {
                case 1 ->  message =  new SMS(mensagem);
                case 2 ->  new Email(mensagem);
                case 3 ->  new RedesSociais(mensagem);
                case 4 ->  new WhatsApp(mensagem);
                case 5 -> System.exit(0);
            }
        }while(true);
    }

//    private static Message textMessage() {
//        String mensagem = scanner.next();
//    }
//
//
//    private static Message sendForSms() {
//        String mensagem =
//   }

//    public static Message sendForEmail() {
//        return new Email();
//    }
//
//    public static Message sendForRedesSociais() {
//        return new RedesSociais();
//    }
//
//    public static Message sendForWhatsApp() {
//        return new WhatsApp();
//    }
}
