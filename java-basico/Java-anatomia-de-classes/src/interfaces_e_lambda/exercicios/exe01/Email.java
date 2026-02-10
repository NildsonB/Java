package interfaces_e_lambda.exercicios.exe01;

public record Email(String messageReceived) implements Message{

    @Override
    public String sendMessage() {
        return  "Email";
    }

//    @Override
//    public void Sendmessage() {
//        System.out.println("A mensagem foi enviada pro Email");
//    }
}
