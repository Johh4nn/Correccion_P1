package org.example;

public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double are(){
        return lado*lado;
    }
    public double perimetro(){
        return lado+lado+lado+lado;
    }
}
