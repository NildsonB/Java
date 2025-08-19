/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package exercicios.exercicio02;

import java.util.Scanner;


/**
 *
 * @author Nildson
 */
public class Main  {
    private final static Scanner scanner = new Scanner(System.in);
    
    private final static Controller controller = new Controller();
    
    public static void main(String[] args) throws MaxSpeedException {
        var option = -1;
        do{
            System.out.println("===Escolha uma das opções abaixo===");
            System.out.println("1 - Ligar carro");
            System.out.println("2 - Desligar carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Virar para a direita");
            System.out.println("6 - Virar para a esquerda");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Aumentar marcha");
            System.out.println("9 - Diminuir marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();
            
           switch(option){
               case 1 -> startTheCar();
               case 2-> turnOffTheCar();
               case 3 -> encreaseTheVelocit();
               case 4 -> decraseVelocit();
               case 5 -> turnToTheRight();
               case 6 -> turnToTheLeft();
               case 7 -> chekVelocit();
               case 8 -> incriseTheMarch();
               case 9 -> decreaseTheMarch();
               case 0 -> System.exit(0);
               default -> System.out.println("Opção inválida");
            }
            
        }while (true);
    }
    
    public static void decraseVelocit() {
        System.out.println("Diminuido a velocidade do carro");
        controller.slowDown();
    }
    
    public static void startTheCar() {
        System.out.println("Tentando ligar o carro");
        controller.startCar();
    }
    
    public static void turnOffTheCar() {
        System.out.println("Tentando desligar o carro");
        controller.turnOffCar();
    }
    
    public static void encreaseTheVelocit() throws MaxSpeedException {
        System.out.println("Acelerando o carro");
        controller.acelerate();
    }
    
    public static void turnToTheRight() {
        System.out.println("Tentando virar para a direita");
        controller.turRight();
    }
    
    public static void turnToTheLeft() {
        System.out.println("Tentando virar para a esquerda");
        controller.turLeft();
    }
    
    public static void incriseTheMarch() {
        System.out.println("Tentando mudar a marcha");
        controller.increaseMarch();
    }
    
    public static void decreaseTheMarch() {
        System.out.println("Tentando mudar a marcha");
        controller.decreaseMarch();
    }

    public static void chekVelocit() {
        var velocit = controller.getVelocit();
        System.out.println("A velocidade atual do carro é de " + velocit + "Km/h");
    }
    
}
