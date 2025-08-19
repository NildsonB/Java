package dio.java.sintaxe_basica.DesafioControleFruxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Insira o segundo parâmetro");
        int parametroDois = scanner.nextInt();

        try{

            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois)
            throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
            for(int numero = 1; numero <= contagem; numero++){
                System.out.println("Imprimindo o número " + numero);
            }
    }
}