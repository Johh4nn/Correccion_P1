package org.example;

public class Circulo {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double areaC(){
        return 3.15*(radio*radio);
    }

    public double perimetroC(){
        return (3.15*2)*radio;
    }

}
