package estrutuda_de_dados.listas.lista_encadeada;

public class Main {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");

        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.get(2));
        System.out.println(lista.get(3));

        System.out.println(lista);

        System.out.println(lista.remove(1));

        System.out.println(lista);

        System.out.println(lista.size());

    }
}
