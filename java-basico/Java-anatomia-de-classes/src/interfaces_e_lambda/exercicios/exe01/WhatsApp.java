package interfaces_e_lambda.exercicios.exe01;

public record WhatsApp(String messageReceived) implements Message{

    @Override
    public String sendMessage() {
        return "WhatssApp";
    }
}
