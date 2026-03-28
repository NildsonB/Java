package EntradaESaidaDeDados.IOData;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.out;

/*
Crie um arquivo "roupas.bin" e armazene:
1. Nome do produto, tamanho (P/M/G/U), quantidade e preço.
2. Leia este arquivo e impreima no console.
*/

public class Ex001 {
    public static void main(String[] args) throws IOException {
        incluirProduto();
    }

    public static void incluirProduto() throws IOException {

        File arquivo = new File("D:/nilds_x2j71yx/Documentos/Cursos/roupas.bin");
        PrintStream out = new PrintStream(System.out, true);

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(arquivo.getPath()));

        Scanner scanner = new Scanner(System.in);

        out.print("Nome do produto: ");
        String nome = scanner.next();
        dos.writeUTF(nome);

        out.print("Quantidade: ");
        int quantidade = scanner.nextInt();
        dos.writeInt(quantidade);

        out.print("Tamanho: ");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        out.print("Preco: ");
        double preco = scanner.nextDouble();
        dos.writeDouble(preco);

        out.printf("O arquivo %s foi criado com %d bytes no diretório \"%s\".", arquivo.getName(), arquivo.length(), arquivo.getAbsolutePath());

        lerArquivo(arquivo.getPath());

        out.close();
        dos.close();
        scanner.close();
    }

    public static void lerArquivo(String arquivo) throws IOException {
        File file = new File(arquivo);
        PrintStream out = new PrintStream(System.out);

        DataInputStream dis = new DataInputStream(new FileInputStream(file.getPath()));

        String nome;
        int quantidade;
        char tamanho;
        double preco;

        nome = dis.readUTF();
        quantidade = dis.readInt();
        tamanho = dis.readChar();
        preco = dis.readDouble();
        System.out.printf("\nNome-------: %s\n", nome);
        System.out.printf("Quantidade-------: %s\n", quantidade);
        System.out.printf("Tamano-------: %s\n", tamanho);
        System.out.printf("Preco-------: %.2f\n", preco);

        out.close();
        dis.close();
    }
}
