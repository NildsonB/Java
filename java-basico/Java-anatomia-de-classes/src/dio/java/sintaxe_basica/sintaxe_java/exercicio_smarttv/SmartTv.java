package dio.java.sintaxe_basica.sintaxe_java.exercicio_smarttv;

public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume alterado para: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume alterado para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal alterado para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal alterado para: " + canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Canal alterado para: " + canal);
    }
}
