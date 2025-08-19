package dio.java.sintaxe_basica.sintaxe_java;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AbouteMe {
    public static void main(String[] args) {
        try{
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobernome");
        String sobrenome = scanner.next();

        System.out.println("Digite seu peso");
        int peso = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();


        System.out.println("Olá, meu nome é " + nome + " " + sobrenome);
        System.out.println("Tenho " + altura + "cm de altura");
        System.out.println("E meu peso é " + peso + "Kg");
        }
        catch(InputMismatchException e){
            System.out.println("Os campos, idade e altura precisam ser numéricos");
        }

    }
}
