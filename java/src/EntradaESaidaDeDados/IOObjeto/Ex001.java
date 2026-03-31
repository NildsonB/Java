package EntradaESaidaDeDados.IOObjeto;

import java.io.*;

public class Ex001 {

    /*
    Crie a classe Gato com os atributos nome, idade e cor;
    Instancie um objeto e serialize;
    Desserialize este objeto e mostre no console.
    */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serealizarObjeto();
        deserealizarObjeto("gato");
    }

    public static void serealizarObjeto() throws IOException {
        Gato gato = new Gato("Mofeus", "branco", 2, true);

        File arquivo = new File("gato");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo.getName()));

        oos.writeObject(gato);

        PrintStream ps = new PrintStream(System.out);
        ps.printf("Os dados foram gravados no arquivo \"%s\" com sucesso, que está no diretório \"%s\".",arquivo.getName(), arquivo.getAbsolutePath());
        oos.close();
        ps.close();
    }

    public static void deserealizarObjeto(String arquivo) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(arquivo));
        Gato objetoGato =(Gato) ois.readObject();

        PrintStream ps = new PrintStream(System.out);
        ps.println("Nome: " + objetoGato.getNome());
        ps.println("Idade: " + objetoGato.getIdade());
        ps.println("Cor: " + objetoGato.getCor());
        ps.println("Castrado: " + objetoGato.isCastrado());

        ps.close();
        ois.close();
    }
}
