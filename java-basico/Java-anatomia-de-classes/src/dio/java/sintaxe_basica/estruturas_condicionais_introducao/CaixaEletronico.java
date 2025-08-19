package dio.java.sintaxe_basica.estruturas_condicionais_introducao;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        double saldo = 25.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor que deseja sacar: ");
        double valorDeSaque = scanner.nextDouble();

        if(valorDeSaque < saldo)
            saldo = saldo - valorDeSaque;

        System.out.println("Seu saldo agora é de " + saldo);
    }
}