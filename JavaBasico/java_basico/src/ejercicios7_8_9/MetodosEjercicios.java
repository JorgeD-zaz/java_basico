package ejercicios7_8_9;

import java.io.*;
import java.util.*;

import static ejercicios7_8_9.Menu.pausa;


public class MetodosEjercicios {

    // este metodo invierte  una cadena  de caracteres y la muetra por consola
    public static void cadenaReversa() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce  una cadena de caracteres:");
        scanner.useDelimiter("\n");
        String cadena = scanner.next();
        System.out.println("El resultado de la cadena invertida es: ");
        String cadenaInvertida="";

        for (int i = cadena.length()-1 ; i >= 0; i--) {
            cadenaInvertida +=cadena.charAt(i);


        }
        System.out.println(cadenaInvertida+"\n");
        pausa(1);
    }

    // Este metodo recorre un arreglo  de una dimencion y lo muestra por consola
    public static void recorrerArregloSimple(){
        String[] arraySimple =  new String[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 5 Strings para rellenar el arreglo:");
        arraySimple[0]= scanner.next();
        arraySimple[1]= scanner.next();
        arraySimple[2]= scanner.next();
        arraySimple[3]= scanner.next();
        arraySimple[4]= scanner.next();

        System.out.println("El arreglo es: ");
        for (Object o : arraySimple) {
            System.out.print(o+" ");
        }
        System.out.println("\n");
        pausa(1);
    }

    // Este metodo recorre un arreglo  de dos dimenciones   muestra por  consola  el valor y la pocision de cada elemento
    public static void arregloBidimensional(){

        int [][] arrayBidimensional ={{10,20,30,40},{500,600,700,800}};
        System.out.println("El contenido del arreglo bidimensional es: {{10,20,30,40},{500,600,700,800}};");
        for (int i = 0; i<arrayBidimensional.length; i++){

            for (int j = 0; j < arrayBidimensional[i].length; j++){

                System.out.println("Valor: " +arrayBidimensional[i][j] + " Poicion I = "+ i +" Pocision J = "+j ) ;


            }

        }
        pausa(1);

    }
    // Este metodo  crea un vector  lo muestra por consola, despues elimina   elementos  y muestra el vector final

    public static  void vectores(){
        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);

        System.out.println("Vector completo"+vector);

        vector.remove(2);
        vector.remove(3);

        System.out.println("Vector removiendo  elemnetos 2 y 3 del mismo"+vector);
        System.out.println("El problema de   crear un vector  con  su capacidad por defecto, con la intencion de agregarle 1000 elementos\n" +
                "es, que cada vez  que este llena su capacidad,  crea   un arreglo  con el doble de capacidad  y  copia  los elementos\n" +
                "del primer arreglo  subyacente,  generando asi un consumo de memoria  que  creece  entre mas  grande   sea la cantidad \n" +
                "elemntos que se desean agregar, en vectores  al ser  arreglos dinamicos  se recomienda   definir la capacidad   del mismo \n" +
                "si se conoce el dato  o  un estimado  de capacidad  dejando una holgura  considerable  para soportar  el agregarle mas elementos\n" +
                "sin la necesidad de sobrepasar  su capacidad  y evitar  generar  una copia del mismo, para una correcta  gestion de consumo de memoria");

                 pausa(5);
    }


    public static void listas(){

        ArrayList<String> listInstrumentos = new ArrayList<String>();
           listInstrumentos.add("Guitarra");
           listInstrumentos.add("Bajo");
           listInstrumentos.add("Bateria");
           listInstrumentos.add("Teclado");


        System.out.println("Elementos del ArrayList \n");
        for (String i : listInstrumentos){
            System.out.println(i);
        }
        System.out.println("Copiando  a LinkedList....\n");
        pausa(1);
        LinkedList<String> linkedInstrumentos  = new LinkedList<>(listInstrumentos);
        System.out.println("Elementos LinkedList");
        for (String i : linkedInstrumentos){
            System.out.println(i);
        }
        pausa(1);
}

     public static void rellenoArrayList(){
        ArrayList<Integer> numeros = new ArrayList<>();
         System.out.println("");
        for (int i = 0 ; i < 10 ; i++){
           numeros.add(i+1);
        }

      for(int i = numeros.size() -1; i >= 0 ; i--){

          if(numeros.get(i) %2 ==0){
              numeros.remove(i);
          }else{
              System.out.println(numeros.get(i));


          }

      }
         System.out.println("Este  es el arreglo sin pares");
     }


     public static  int divide(int num1, int num2) throws ArithmeticException{

        return num1/num2;

     }



    public static void copyFiles() throws FileNotFoundException {
        try {
            InputStream file1 = new FileInputStream("/Users/Desarrollo/Desktop/filein.txt");
            BufferedInputStream fileBuffer = new BufferedInputStream(file1);
            try{
                byte readFile [] = file1.readAllBytes();
                PrintStream copia = new PrintStream("/Users/Desarrollo/Desktop/fileout.txt");
                copia.write(readFile);
                System.out.println("El fichero se copio correctamente");
                pausa(1);
                /* int readFile = fileBuffer.read();
                while (readFile != -1){
                    System.out.print((char)readFile);
                    readFile = fileBuffer.read();

                /* Leer  caracter por caracter
                int readFile = file1.read();
                while (readFile != -1){
                    System.out.print((char)readFile);
                    readFile = file1.read();
                }


                 Leer   byte a byte
                 byte readFile [] = file1.readAllBytes();

                for(byte read: readFile){
                    System.out.print((char)read);
                }
              }*/

            }catch (IOException e){
                System.out.println("No se pudo leer el fichero :( ---"+ e.getMessage());

            }


        }catch (IOException e){
            System.out.println("No se encontro el fichero :( ---"+ e.getMessage());

        }
    }





}
