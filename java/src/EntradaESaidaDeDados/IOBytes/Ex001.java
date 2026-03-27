package EntradaESaidaDeDados.IOBytes;

import java.io.*;

public class Ex001 {

    public static void main(String[] args) throws IOException {
        copiarArquivo("recomendacoes-copy.txt");
    }

    public static void copiarArquivo(String arquivo) throws IOException {
        File file = new File(arquivo);
        String filename = file.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filename));

        String copyName = filename.substring(0, filename.indexOf("-")).concat("copy2.txt");

        File fileCopy = new File(copyName);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileCopy));

        int line = 0;
        while((line = bis.read()) != -1){
            bos.write((char)line);
            bos.flush();
        }

        bos.close();
        bis.close();

        System.out.printf("O arquivo \"%s\" foi copiado com sucesso e está no diretório \"%s\" com %d bytes", filename, file.getAbsolutePath(), fileCopy.length());
    }
}
