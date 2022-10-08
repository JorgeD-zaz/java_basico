package ejercicios7_8_9;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import static ejercicios7_8_9.MetodosEjercicios.*;
import static ejercicios7_8_9.AddToFile.*;


public class Menu {
    public static void menu(){
        System.out.println("Bienvenidos  a la  evaluacion ejecicios 7,8,9 java curso basico, Opend Bootcamp");
        int opcion;
        boolean controlMenu = false;
        do{
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            System.out.println("\n");

            System.out.println("Menu:");
            System.out.println("1--Revertir una cadena ");
            System.out.println("2--Array Simple ");
            System.out.println("3--Array Dos Dimensiones");
            System.out.println("4--Vectores");
            System.out.println("5--ArrayList, LinkedList");
            System.out.println("6--Throws Exceptions");
            System.out.println("7--InputStream, PrintStream");
            System.out.println("8--Registro de gastos Mensual");
            System.out.println("9--Salir");




            System.out.println("Introduce un numero del Menu: ");

            try{
                opcion = scanner.nextInt();
                if(opcion >=1  && opcion <= 9){

                    opcionMenu(opcion);
                    if(opcion ==9 ){
                        controlMenu = true;
                    }

                }else{
                    System.out.println("Introduce un numero valido");
                    controlMenu = false;
                    pausa(2);
                }
            }catch(InputMismatchException e){
                System.out.println("Por favor elige una opcion  valida" );
                pausa(2);
            }

        }while (!controlMenu);


    }

    public static void opcionMenu(int opcion){

        switch (opcion){
            case 1:
                cadenaReversa();
                break;
            case 2:
                recorrerArregloSimple();
                break;
            case 3:
                arregloBidimensional();
                break;
            case 4:
                vectores();
                break;
            case 5:
                listas();
                break;
            case 6:
                try{
                    divide(1,0);
                }catch (ArithmeticException e){
                    System.out.println("Esto no puede hacerse-- " + e);
                }finally {
                    System.out.println("Demo de Codigo");
                    pausa(1);

                }
                break;
            case 7:
                try {
                    copyFiles();
                }catch (FileNotFoundException e){
                    System.out.println("No se pudo copiar el fichero :-(" + e.getMessage());
                }
                break;
            case 8:
                numeroDeGastos();
                break;
            default:
                System.out.println("Elije una opcion valida");
                break;


        }
    }

    public static void  pausa(int n){
        try {
            Thread.sleep(n * 2000);
        }catch (InterruptedException e){
            System.out.println("Fallo  la pausa del programa"+ e.getMessage());

        }

    }
}
