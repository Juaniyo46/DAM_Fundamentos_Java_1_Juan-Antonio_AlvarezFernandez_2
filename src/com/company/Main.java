package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Abrimos la variable escaner para la introducción de datos mediante teclado.
        Scanner sc = new Scanner(System.in);

        //Información para el usuario
        System.out.println("En la siguiente ecuación calcularemos el área de un circulo.");
        System.out.println("Introduzca un valor del radio del circulo");

        //iniciamos la variable r que corresponde al radio
        double r = sc.nextDouble();

        //Hacemos los calculos de la formula y seguidamente aproximamos los decimales a 3 digitos
        double resultado = Math.PI*(Math.pow(r,2));
        DecimalFormat aprox = new DecimalFormat("#.000");

        //Mostramos el resultado al usuario
        System.out.println("El área del circulo indicado es: " + aprox.format(resultado));

    }
}