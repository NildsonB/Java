package dio.java.sintaxe_basica.sintaxe_java.exercicio_smarttv;

public class Usuario {
    
    public static void main (String[] args) throws Exception {

        SmartTv smartTV = new SmartTv();

        smartTV.ligar();
        System.out.println("TV está ligada? " + smartTV.ligada);

        //System.out.println("TV está ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume atual: " + smartTV.volume);

        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(35);

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuirCanal();
    }
}
