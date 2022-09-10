package com.luisjorge;

public class EjerciciosTema3 {
    public static void main(String[] args) {
        String[] nombres= {"Luis","Jorge", "Muñiz", "Villarreal"};

        concatenarBucle(nombres);

    }

    public static void concatenarBucle(String nombres[]){
        String concatenado= "";
        for (String nombre : nombres){
             concatenado += " "+ nombre;

        }
        System.out.println(concatenado);
    }
}
