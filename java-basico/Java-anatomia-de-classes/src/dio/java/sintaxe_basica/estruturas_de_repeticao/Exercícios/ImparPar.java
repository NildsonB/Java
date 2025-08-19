package dio.java.sintaxe_basica.estruturas_de_repeticao.Exercícios;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número:");
        int number1 = scanner.nextInt();

        System.out.println("Informe o segundo número:");
        int number2 = scanner.nextInt();

        while (number2 < number1){
            System.out.println("O segundo número dever ser maior que o primeiro, informe um novo número: ");
            number2 = scanner.nextInt();
        }

        System.out.println("Digite 1 para Impar e 2 para Par. ");
        int lado = scanner.nextInt();
        
        while ( lado != 1 && lado != 2){
            System.out.println("Você não informou um valor válido, digite 1 para Impar e 2 para Par. ");
            lado = scanner.nextInt();
        }

        if( lado == 1) {
            for(int i = number2; i >= number1; i--){
                if(i % 2 != 0){
                    System.out.println(i);
                }else;
            }
        }else{
            for(int i = number2; i >= number1; i--){
                if(i % 2 == 0){
                    System.out.println(i);
                }else;
            }
        }
    }
}
