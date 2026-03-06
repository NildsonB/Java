package Collections.List.Exercicios.Ex002;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Perguntas> perguntas = new ArrayList<>();
        List<Respostas> respostas = new ArrayList<>();

        perguntas.add(new Perguntas("Telefonou para a vítima?"));
        perguntas.add(new Perguntas("Esteve no local do crime?"));
        perguntas.add(new Perguntas("Mora perto da vítima?"));
        perguntas.add(new Perguntas("Devia para a vítima?"));
        perguntas.add(new Perguntas("Já trabalhou com a vítima?"));


        for (Perguntas pergunta : perguntas) {
            System.out.println("Selecione 0 para não e 1 para sim.");
            System.out.println(pergunta);
            int option = -1;
            while (option != 0 && option != 1) {
                option = sc.nextInt();
                switch (option) {
                    case 0:
                        respostas.add(new Respostas("Não"));
                        break;
                    case 1:
                        respostas.add(new Respostas("Sim"));
                        break;
                    default:
                        System.out.println("Selecione uma opção válida");
                }
            }
        }

        int quantidade = 0;
        for (Respostas resposta : respostas){
            if (resposta.getRespostas().equals("Sim")){
                quantidade++;
            }
        }

        if(quantidade > 4){
            System.out.println("Assassina");
        }else if(quantidade > 2){
            System.out.println("Cúmplice");
        } else if (quantidade > 1) {
            System.out.println("Suspeita");
        }  else {
            System.out.println("Inocente");
        }
    }
}
