package TratamentoDeExcecoes.CheckedExceptions;

import java.io.*;
import javax.swing.*;

public class CheckedExceptions {
    public static void main(String[] args) {
        String nomeDoArquivo = "READM.md";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado!\n" + e.getMessage());
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Erro inesperado!" +  e.getCause());
        }

        System.out.println("Pós try-catch");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
