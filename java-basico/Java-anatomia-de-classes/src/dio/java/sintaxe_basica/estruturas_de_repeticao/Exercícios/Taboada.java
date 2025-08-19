package dio.java.sintaxe_basica.estruturas_de_repeticao.Exercícios;

import java.util.Scanner;

public class Taboada {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Informe o número a ser multiplicado.");
        int number = scanner.nextInt();
        
        System.out.printf("A taboada do número %s é: \n", number);
        for(int i = 0; i <= 10; i++) {
           var multiplicacao = number * i;
           System.out.printf("%s x %s = %s \n", number, i, multiplicacao);
        }
    }
}