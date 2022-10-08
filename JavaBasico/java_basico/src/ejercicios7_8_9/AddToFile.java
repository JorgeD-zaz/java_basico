package ejercicios7_8_9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.*;

public class AddToFile {

public static void numeroDeGastos(){
   int contador;
   Scanner scanner = new Scanner(System.in);

   System.out.println("Esta seccion del programa  captura  ");


   try{
      System.out.println("Indica cuantos gastos deseas capturar");
      contador  = scanner.nextInt();
     entradaGastos(contador);


   }catch(InputMismatchException e){
      System.out.println("Por favor elige una opcion  valida" );

   }

}








   public static void  entradaGastos(int contador ){
      LocalDateTime fecha = LocalDateTime.now();
      String date =  String.valueOf(LocalDate.now());
      LocalDate currentDate = LocalDate.parse(date);
      Month month = currentDate.getMonth();
      Map<LocalDateTime, Object>  mapa = new HashMap<>();
      String ruta = "/Users/Desarrollo/Desktop/Gastos"+month+".txt";
      AddDatos entradas = new AddDatos();
      String  contenido;

      for (int i = 0; i <contador ; i++){

         entradas = (AddDatos) entradas.capturarGasto();
         System.out.println(entradas.descripcion);
         mapa.put(fecha,entradas.toString());
         for (Map.Entry<LocalDateTime, Object > e : mapa.entrySet()){
            System.out.println(e.getKey()+""+ e.getValue());
            contenido = e.getKey() + " " +e.getValue();
            addToFile(contenido,ruta);

         }
      }




   }


   public static void addToFile(String contenido, String ruta){

      try {

         File file = new File(ruta);
         // Si el archivo no existe es creado
         if (!file.exists()) {
            file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("-------Fecha y Hora------------Descripcion del gasto---------------Gasto \n");
            bw.write(contenido +"\n");
            bw.close();
         }else {
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(contenido +"\n");
            bw.close();
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }


   }


