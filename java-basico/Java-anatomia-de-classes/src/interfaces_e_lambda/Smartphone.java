package interfaces_e_lambda;

public class Smartphone implements MusicPlayer, VideoPlayer {
    @Override
    public void playMusic() {
        System.out.println("O celular está tocando a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O celular está pausando a música");
    }

    @Override
    public void stopMusic() {
        System.out.println("O celular está parando a música");
    }

    @Override
    public void playVideo() {
        System.out.println("O celular está reproduzindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O celular está pausando o vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("O celular está parando o vídeo");
    }
}
