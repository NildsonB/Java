package estrutuda_de_dados.listas.lista_circular;

import estrutuda_de_dados.listas.lista_encadeada.Lista;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaCircular = new ListaCircular<>();

        listaCircular.add("E01");
        listaCircular.add("E02");
        listaCircular.add("E03");
        listaCircular.add("E04");
        listaCircular.add("E05");

        System.out.println(listaCircular);


        System.out.println(listaCircular.size());

        listaCircular.remove(1);
        System.out.println(listaCircular);
        System.out.println(listaCircular.size());


    }
}
