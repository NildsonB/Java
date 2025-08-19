package dio.java.sintaxe_basica.estruturas_de_repeticao.Exercícios;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("Informe um número: "); 
        int inicial = scanner.nextInt();

        while(true){
            System.out.println("Informe o número para verificação: ");
            var verificacao = scanner.nextInt();
            if(verificacao < inicial){
                System.out.printf("Informe um núemro maior que %s \n", inicial);
                continue;
            }
            var resultado = verificacao % inicial;
            System.out.printf("%s %% %s = %s \n", verificacao, inicial, resultado);;
            if(resultado != 0) break;
        }

    }
}
