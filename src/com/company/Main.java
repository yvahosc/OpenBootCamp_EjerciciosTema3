package com.company;

public class Main {

    public static void main(String[] args) {
        suma(1, 2, 3);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("El número de puertas del objeto miCoche es: " +
                miCoche.numeroPuertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println("La suma de los números " + a + ", " + b + " y "
                + c + " es: " + (a + b + c));
    }
}

class Coche {
    public int numeroPuertas = 0;

    public void incrementarPuertas(){
        numeroPuertas++;
    }
}
