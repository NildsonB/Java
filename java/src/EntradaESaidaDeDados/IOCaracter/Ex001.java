package EntradaESaidaDeDados.IOCaracter;

import java.io.*;

public class Ex001 {
    public static void receberTecladoImprimirConsole() throws IOException {
        //Maneira não usual:
        /*InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);*/
        //Usando o padrão Decorator:
        System.out.println("Recomente 3 animes: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        //Maneira não usual:
        /*OutputStream os = System.out;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);*/
        //Usando o padrão Decorator:
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(!(line.isEmpty()));

        bw.flush();
        br.close();
        bw.close();

    }

    public static void main(String[] args) throws IOException {
        receberTecladoImprimirConsole();
    }
}
