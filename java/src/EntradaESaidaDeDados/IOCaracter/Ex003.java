package EntradaESaidaDeDados.IOCaracter;

import java.io.*;

public class Ex003 {
    public static void main(String[] args) throws IOException {
        copiarArquivo();
        adicinarAoArquivo();
    }

    public static void copiarArquivo() throws IOException {
        File original = new File("recomendacoes.txt");
        String name = original.getName();
        BufferedReader br = new BufferedReader(new FileReader(name));
        String line = br.readLine();

        File copy = new File(name.substring(0, name.indexOf(".")).concat("-copy.txt"));
        String copyname = copy.getName();

        BufferedWriter bw = new BufferedWriter(new FileWriter(copyname));

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = br.readLine();
        }while(line != null);

        System.out.printf("O arquivo \"%s\" foi copiado com sucesso para o arquivo \"%s\".\n", name, copyname);

        bw.close();
        br.close();
    }

    public static void adicinarAoArquivo() throws IOException {
        System.out.println("Digite 3 linguagens de programação: ");
        File fl = new File("recomendacoes-copy.txt");
        BufferedReader brf = new BufferedReader(new InputStreamReader(System.in));
        String line = brf.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fl.getName(), true));
        bw.newLine();

        do {
            bw.write(line);
            bw.newLine();
            bw.flush();
            line = brf.readLine();
        }while(!(line.equalsIgnoreCase("fim")));

        brf.close();
        bw.close();
    }

}
