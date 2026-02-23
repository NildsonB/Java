package estrutuda_de_dados.listas.lista_duplamente_encadeada;

public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada<String> listaDuplamenteEncadeada = new ListaDuplamenteEncadeada<>();

        listaDuplamenteEncadeada.add("Elemento 0");
        listaDuplamenteEncadeada.add("Elemento 1");
        listaDuplamenteEncadeada.add("Elemento 2");
        listaDuplamenteEncadeada.add("Elemento 3");
        listaDuplamenteEncadeada.add("Elemento 4");

        System.out.println(listaDuplamenteEncadeada);
        System.out.println(listaDuplamenteEncadeada.size());

        System.out.println(listaDuplamenteEncadeada.getConteudo(4));

        listaDuplamenteEncadeada.add("Elemento adicionado", 2);
        listaDuplamenteEncadeada.add("Elemento inicial", 0);
        listaDuplamenteEncadeada.add("Elemento final", 7);

        System.out.println(listaDuplamenteEncadeada.size());
        System.out.println(listaDuplamenteEncadeada.getConteudo(7));
        System.out.println(listaDuplamenteEncadeada);

        System.out.println(listaDuplamenteEncadeada.remove(3));
        System.out.println(listaDuplamenteEncadeada.size());
        System.out.println(listaDuplamenteEncadeada);
    }
}
