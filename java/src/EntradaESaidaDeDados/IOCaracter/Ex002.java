package EntradaESaidaDeDados.IOCaracter;

import java.io.*;
import java.util.Scanner;

public class Ex002 {
    public static void lerTecladoEscreverDocumento() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de animes: ");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File fl = new File("recomendacoes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(fl.getName()));

        do{
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = sc.nextLine();
        }while(!(line.equalsIgnoreCase("fim")));

        pw.printf("O arquivo \"%s\" foi criado com sucesso!\n", fl.getName());

        pw.close();
        sc.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        lerTecladoEscreverDocumento();
    }
}
