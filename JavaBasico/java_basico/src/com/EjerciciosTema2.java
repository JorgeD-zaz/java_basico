package com.luisjorge;

public class EjerciciosTema2 {

    public static void main(String[] args) {
       double precio = 97;
       String mensaje = precioIva(precio) ;
           System.out.println(mensaje);

    }

    public static String precioIva(double precio){
        double iva = precio *0.16;
        double precioIva = precio +iva;

        return  "El precio  del producto incluyendo IVA es :" + precioIva;
    }
}
