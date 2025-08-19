package dio.java.sintaxe_basica.estruturas_de_repeticao;

import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        //excutando repetidas vezes até alguem atender
        System.out.println("Discando...");

        do{
            System.out.println("Telefone tocando");
        }while(tocando());

        System.out.println("Alô !!!");
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        //negando o ato de continuar tocando
        return ! atendeu;
    }
}