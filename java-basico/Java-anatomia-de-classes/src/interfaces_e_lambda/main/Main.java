package interfaces_e_lambda.main;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Computer musicPlayer = new Computer();
        //runMusic(musicPlayer);
        //runVideo(musicPlayer);
        var option = -1;
        do{
            System.out.println("===Escolha uma opção===");
            System.out.println("1 - Rodar vídeo");
            System.out.println("2- Tocar música");
            option = scanner.nextInt();

            switch (option){
                case 1 -> runVideo(musicPlayer);
                case 2 -> runMusic(musicPlayer);
            }
        }while(true);
    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}
