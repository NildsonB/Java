package Collections.List.Exercicios.Ex001;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        System.out.println("Insira a seguir as temperaturas por mês.");
        for (int i = 0; i<6;i++) {
            System.out.print(meses.get(i) + ": ");
            temperaturas.add(sc.nextDouble());
        }

        double soma = temperaturas.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println(soma);

        Double media = soma/temperaturas.size();
        System.out.printf("%.2f\n", media);

        System.out.println();

        for (int i = 0; i<temperaturas.size();i++) {
            double temperatura = temperaturas.get(i);
            if(temperatura > media) {
                System.out.println(meses.get(i) + " - " + temperatura);
            }
        }
    }

}


