package dio.java.sintaxe_basica.estruturas_de_repeticao.Exercícios;

import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        var scanner = new Scanner (System.in);
        
        System.out.println("Informe sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println("Informe seu peso: ");
        double peso = scanner.nextDouble();

        var imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.printf("Seu IMC é %s, você está abaixo do peso. \n", imc);
        }else if(imc > 18.5 && imc <= 24.9){
            System.out.printf("Seu IMC é %s, você está no peso idel. \n", imc);
        }else if(imc > 24.9 && imc <= 29.9){
            System.out.printf("Seu IMC é %s, você está levemente acima do peso. \n", imc);
        }else if(imc > 29.9 && imc <= 34.9){
            System.out.printf("Seu IMC é %s, você está com Obesidade Grau I. \n", imc);
        }else if(imc > 34.9 && imc <= 39.9){
            System.out.printf("Seu IMC é %s, você está com Obesidade Grau II (Severa). \n", imc);
        }else {
            System.out.printf("Seu IMC é %s, você está Obesidade Grau III (Mórbida). \n", imc);
        }
    }
}
