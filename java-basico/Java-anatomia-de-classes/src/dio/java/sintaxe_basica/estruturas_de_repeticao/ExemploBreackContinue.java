package dio.java.sintaxe_basica.estruturas_de_repeticao;

public class ExemploBreackContinue {
    public static void main(String[] args) {
        
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                break;                  //break imterrompe completamente
                                        //a execução do código
                System.out.println(numero);
        }

        /*
        for(int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
                continue;                  //continue retorna o comando para o for
                                        //antes de continuar as linhas a baixo dele
                System.out.println(numero);
        */
    }
}
