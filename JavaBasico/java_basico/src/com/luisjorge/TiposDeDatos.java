package com.luisjorge;

/**
 * Esta clase   crea variables  con los diferentes tipos de datos   y los imprime por consola
 */
public class TiposDeDatos {
    public static void main(String[] args) {


        // Tipo datos numericos
        byte num1 = 1;
        short num2 = 10;
        int num3 = 100;
        long num4 = 200;
        float num5 = 12.0f;
        double num6 = 10.99d;
        System.out.println("Este  numero  de tipo byte: " + num1);
        System.out.println("Este  numero  de tipo short: " + num2);
        System.out.println("Este  numero  de tipo int: " + num3);
        System.out.println("Este  numero  de tipo long: " + num4);
        System.out.println("Este  numero  de tipo float: " + num5);
        System.out.println("Este  numero  de tipo double: " + num6);

        // Tipo de  dato caracter o cadena de caracteres

        char letra = 'L';
        String palabra = "Esto es un string";
        System.out.println("Este  es un carcter: " + letra);
        System.out.println(palabra);


        // Tipo de dato booleano
        boolean verdadero = true;
        boolean falso  = false;
        System.out.println("El valor Booleano es : " + verdadero);
        System.out.println("El valor booleano es : " + falso);



    }
}
