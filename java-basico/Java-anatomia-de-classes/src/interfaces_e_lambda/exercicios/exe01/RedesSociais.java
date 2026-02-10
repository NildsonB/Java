package interfaces_e_lambda.exercicios.exe01;

public record RedesSociais(String messageReceived) implements Message{

    @Override
    public String sendMessage() {
        return "Redes Sociais";
    }

//    @Override
//    public void Sendmessage() {
//        System.out.println("A mensagem foi enviada por Redes Sociais");
//    }
}
