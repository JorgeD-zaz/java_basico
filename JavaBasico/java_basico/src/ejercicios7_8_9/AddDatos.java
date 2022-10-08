package ejercicios7_8_9;

import java.util.*;

class AddDatos {

        String descripcion;
        float cantidad;


    public AddDatos(String descripcion, float cantidad) {
        this.descripcion = descripcion;
        this.cantidad = cantidad;

    }

    public AddDatos() {

    }

    @Override
    public String toString() {
        return
                "----" + descripcion +
                "--------------------" + cantidad ;
    }

    public Object capturarGasto(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta seccion del programa  captura  ");
        AddDatos objEntradas = new AddDatos(descripcion, cantidad);

        try{
            System.out.println("Ingresa la descripcion del gasto");
           descripcion  = scanner.next();
            System.out.println("Introduce la cantidad gastada");
           cantidad = scanner.nextFloat();


        }catch(InputMismatchException e){
            System.out.println("Por favor elige una opcion  valida" );

        }
          objEntradas.descripcion =descripcion;
        objEntradas.cantidad = cantidad;


        return  objEntradas;
    }


}
