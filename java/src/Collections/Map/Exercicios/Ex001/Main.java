package Collections.Map.Exercicios.Ex001;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Crie um dicionário e relacione os estados e suas populações:
        Map<String, Integer> estados = new HashMap<>() {
            {
                put("PE", 9616621);
                put("AL", 3351543);
                put("CE", 9187103);
                put("RN", 3534265);
            }
        };
        System.out.println(estados);

        System.out.println("1 - Substitua a população do estado do RN por 3.534.165:");
        estados.put("RN", 3534165);
        System.out.println(estados);

        System.out.println("2 - Confira se o estado PB está no dicionário, caso não adicione PB - 4.039.277:");
        if(!estados.containsKey("PB")){
            estados.put("PB", 4039277);
        }
        System.out.println(estados);

        System.out.println("3 - Exiba a população de PE");
        System.out.println("População de PE: " + estados.get("PE"));

        System.out.println("4 - Exiba todos os estados e suas populações na ordem que foi informado:");
        Map<String, Integer> estados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(estados2);

        System.out.println("5 - Exiba os estados e suas populações em ordem alfabética:");
        Map<String, Integer> estados3 = new TreeMap<>(estados2);
        System.out.println(estados3);

        System.out.println("6 - Exiba o estado com a menos população e sua quantidade:");
        Integer menorPopulacao = Collections.min(estados3.values());
        String estadoMenorPopulacao = "";
        for(Map.Entry<String, Integer> entry : estados3.entrySet()){
            if(entry.getValue() == menorPopulacao){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado com menor população: " +  estadoMenorPopulacao + " - " + menorPopulacao);
            }
        }

        System.out.println("7 - Exiba o estado com a maior população e sua quantidade:");
        Integer maiorPopulacao = Collections.max(estados3.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String, Integer> entry : estados3.entrySet()){
            if(entry.getValue() == maiorPopulacao){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado com maior população: " +  estadoMaiorPopulacao + " - " + maiorPopulacao);
            }
        }

        System.out.println("8 - Exiba a soma da população desses estados:");
        Iterator<Integer> iterator = estados.values().iterator();
        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("A soma da população dos estados é: " + soma);

        System.out.println("9 - Exiba a média da população deste dicionário de estados:");
        int media = soma/estados.size();
        System.out.println("A média da população dos estados é: " + media);

        System.out.println("10 - Remova os estados com população menor que 4.000.000:");
        Iterator<Map.Entry<String, Integer>> iterator1 = estados3.entrySet().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().getValue() <4000000){
                iterator1.remove();
            }
        }
        System.out.println(estados3);

        System.out.println("11 - Apague o dicionário:");
        estados.clear();

        System.out.println("12 - Confira se o dicionário está vazio:");
        System.out.println(estados);


    }
}
