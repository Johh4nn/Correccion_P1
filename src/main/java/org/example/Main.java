package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cuadrado c1 = new Cuadrado();
        System.out.println("PRIMERO FIGURA");
        System.out.println("Ingrese la dimension del lado del cuadrado: ");
        c1.setLado(input.nextDouble());
        System.out.println("EL area del cuadrado es: "+c1.are());
        System.out.println("EL perimetro del cuadrado es: "+c1.perimetro());
        // La primera parte del ingreso del cuadrado esta completada

        // Llenamos todas las figuras
        Rectangulo r1 = new Rectangulo(10.22,5.30);
        Triangulo t1 = new Triangulo(15.30,5.25);
        Circulo cir1 = new Circulo(3.65);

        System.out.println("EL area del rectangulo es: "+r1.areaR()+" y su perimetro es: "+r1.perimetroR());
        System.out.println("EL area del triangulo es: "+t1.areat()+" y su perimetro es: "+t1.perimetrot());
        System.out.println("EL area del circulo es: "+cir1.areaC()+" y su perimetro es: "+cir1.perimetroC());

        double total = totalsum(c1.are() , r1.areaR(), t1.areat(), cir1.areaC());

        System.out.println("EL total de la suma de todas las areas es: "+total);

    }

    public static double totalsum(double n1,double n2,double n3,double n4){
        return n1+n2+n3+n4;
    }
}