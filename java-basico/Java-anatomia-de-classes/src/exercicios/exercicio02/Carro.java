/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios.exercicio02;

/**
 *
 * @author Nildson
 */
public class Carro {
    
    private boolean ligado = false;
    
    private int march;
    
    private int velocit;

    public Carro() {
        this.march = 0;
        this.velocit = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getMarch() {
        return march;
    }
    
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setMarch(int march) {
        this.march = march;
    }

    public int getVelocit() {
        return velocit;
    }

    public void setVelocit(int velocit) {
        this.velocit = velocit;
    }
           
}
