package estrutuda_de_dados.filas;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

//        No noUm = new No("primeiro");
//        No noDois = new No("segundo");
//        No noTres = new No("terceiro");
//        No noQuatro = new No("quarto");

        fila.enqueue("noUm");
        fila.enqueue("noDois");
        fila.enqueue("noTres");


        System.out.println("Fila: " + fila);

        System.out.println(fila.first());

        System.out.println(fila.dequeue());

        System.out.println(fila.first());

        fila.enqueue("noQuatro");

        System.out.println("Fila: " + fila);
    }
}
