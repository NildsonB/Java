package interfaces_e_lambda.exercicios.exe01;

public record SMS(String messageReceived) implements Message{

    @Override
    public String sendMessage() {
        return messageReceived + "foi enviada por SMS";
    }

//    @Override
//    public void Sendmessage() {
//        System.out.println("A mensagem '" + messageReceived + "' foi enviada por SMS");
//    }
}
