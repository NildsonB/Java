/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio02;

/**
 *
 * @author Nildson
 */
public class Controller {
    private MaxSpeedException speedException = new MaxSpeedException();
    
    private Carro carro = new Carro();

    public int getVelocit() { return this.carro.getVelocit();}
    
    public int getMarch() {return this.carro.getMarch();}
    
    public boolean getValue() {return this.carro.isLigado();}
    
    
    
    public void acelerate() throws MaxSpeedException {
        var speed = getVelocit();
        var value = getValue();
        if (!value) {
            System.out.println("O carro não está ligado");
        }
        else if (getMarch() == 0) {
            System.out.println("A marcha está em ponto morto.");
        }else {
            try {
                if (getMarch() == 1 && speed < 20) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else if (getMarch() == 2 && speed < 40) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else if (getMarch() == 3 && speed < 60) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else if (getMarch() == 4 && speed < 80) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else if (getMarch() == 5 && speed < 100) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else if (getMarch() == 6 && speed < 120) {
                    speed += 1;
                    System.out.println("A velocidade do carro foi aumentada");
                } else {
                    throw speedException;
                }
                carro.setVelocit(speed);
            } catch (MaxSpeedException e) {
                if (getMarch() == 1 && speed == 20) {
                    System.out.println("A velocidade máxima para a marcha atual foi atingida");
                } else if (getMarch() == 2 && speed == 40) {
                    System.out.println("A velocidade máxima para a marcha atual foi atingida");
                } else if (getMarch() == 3 && speed == 60) {
                    System.out.println("A velocidade máxima para a marcha atual foi atingida");
                } else if (getMarch() == 4 && speed == 80) {
                    System.out.println("A velocidade máxima para a marcha atual foi atingida");
                } else if (getMarch() == 5 && speed == 100) {
                    System.out.println("A velocidade máxima para a marcha atual foi atingida");
                } else if (getMarch() == 6 && speed == 120) {
                    System.out.println("A velocidade máxima do carro foi atingida");
                } else {
                    System.out.println("Passe para a próxima marcha para poder aumentar a velocidade");
                }
            }
        }
    }
    
    public void slowDown() {
        var speed = getVelocit();
        if (speed > 0){
            speed -=1;
            carro.setVelocit(speed);
        }
    }
    
    public void turLeft() {
        var speed = getVelocit();
        if(!getValue()) {
            System.out.println("O carro está desligado");
            if(speed == 0){
                System.out.println("O carro está parado");
            }else if (speed > 40){
                System.out.println("O carro está muito rápido para mudar a direção");
            }
        }else {
            System.out.println("O carro virou para a esquerda");
        }
    }
    
    public void turRight() {
        var speed = getVelocit();
        if(!getValue()) {
            System.out.println("O carro está desligado");
            if(speed == 0){
                System.out.println("O carro está parado");
            }else if (speed > 40){
                System.out.println("O carro está muito rápido para mudar a direção");
            }
        }else {
            System.out.println("O carro virou para a direita");
        }
    }
    
    public void increaseMarch() {
        int march = carro.getMarch();
        if (getMarch() == 0 || getMarch() < 6) {
            march += 1;
            carro.setMarch(march);
            System.out.println("A marcha foi alterada");
        }
    }
    
    public void marchCheker() {
        int march = carro.getMarch();
        if (march == 0) {
            System.out.println("O carro está em ponto morto");
        }
        if (march == 6) {
            System.out.println("O carro já está na 6º marcha");
        }
    }
    
    public void decreaseMarch() {
        int march = carro.getMarch();
        if (getMarch() > 0 || getMarch() == 6) {
            march -= 1;
            carro.setMarch(march);
            System.out.println("A marcha foi alterada");
        }
    }


    public void startCar() {
        boolean value = this.carro.isLigado();
        if (!value) {
            carro.setLigado(true);
            System.out.println("O carro foi ligado");
        }else{
            System.out.println("O carro já está ligado");
        }
    }

    public void turnOffCar() {
        var march = carro.getMarch();
        if (!getValue()) {
            System.out.println("O carro já está desligado");
        }else if(march == 0 && getVelocit() == 0) {
                carro.setLigado(false);
                System.out.println("O carro foi desligado");
        }else {
        System.out.println("O carro está andando ou com a marcha engatada.");
        }
    }


}
