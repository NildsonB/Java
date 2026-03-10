package Collections.Set.Exercicios.Ex001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Crie um conjunto contendo as cores do arco-íris, e:
        Set<CoresArcoiris> arcoIris = new HashSet<>() {{
            add(new CoresArcoiris("vermelho"));
            add(new CoresArcoiris("laranja"));
            add(new CoresArcoiris("amarelo"));
            add(new CoresArcoiris("verde"));
            add(new CoresArcoiris("azul"));
            add(new CoresArcoiris("anil"));
            add(new CoresArcoiris("violeta"));
        }};

        System.out.println("A - Exiba todas as cores uma abaixo da outra:");
        for (CoresArcoiris cores : arcoIris) {
            System.out.println(cores.getCores());
        }

        System.out.println("B - A quantidade de cores que o arco-íris tem:");
        System.out.println("O arco-íris possui " + arcoIris.size() + " cores");

        System.out.println("C - Exiba as cores em ordem alfabética:");
        Set<CoresArcoiris> arcoIris2 = new TreeSet<>(arcoIris);
        for (CoresArcoiris cores : arcoIris2) {
            System.out.println(cores.getCores());
        }

        System.out.println("D - Exiba as cores na orde inversa da que foi informada:");
        Set<CoresArcoiris> arcoIris3 = new LinkedHashSet<>(){{
            add(new CoresArcoiris("vermelho"));
            add(new CoresArcoiris("laranja"));
            add(new CoresArcoiris("amarelo"));
            add(new CoresArcoiris("verde"));
            add(new CoresArcoiris("azul"));
            add(new CoresArcoiris("anil"));
            add(new CoresArcoiris("violeta"));
        }};
        List<CoresArcoiris> listArcoIris3 = new ArrayList<>(arcoIris3);
        System.out.println("====================");
        for (int i = listArcoIris3.size()-1; i >= 0; i--) {
            System.out.println(listArcoIris3.get(i));
        }

        System.out.println("E - Exibatodas as cores que não começam com a letra 'v':");
        for (CoresArcoiris cores : arcoIris) {
            if(cores.getCores().startsWith("v")){
                System.out.println(cores.getCores());
            }
        }

        System.out.println("F - Remova todas as cores que não começam com a letra 'v':");
        arcoIris.removeIf(cores -> !cores.getCores().startsWith("v"));
        System.out.println(arcoIris);

        System.out.println("G - Limpe o conjunto:");
        arcoIris.clear();

        System.out.println("H - Confira se o conjunto está vasio:");;
        System.out.println(arcoIris);

    }
}
