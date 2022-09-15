package classesObjetos;

public class Main {

    public static void main(String[] args) {
        SmartPhone samsungGalaxyS22 = new SmartPhone("Android 11","128 GB","Octa-Core 2.99GHz","6.1 inches", "S22",true,true,"black","167g","4G LTE TDD") ;
        SmartWatch applewatch = new SmartWatch("iOS","16GB","Chip S# SiP","312x390 OLED","Series 3 GPS",true,true,true);



           System.out.println("Smartphone\n"+"Modelo: "+ applewatch.model +"\n"+
                   "Sistema Operativo: "+ applewatch.operatingsystem +"\n"+
                   "Storage: "+ applewatch.storage +"\n"+
                   "Procesador: "+ applewatch.procesador +"\n"+
                   "Pantalla: "+ applewatch.screnSize +"\n"+
                   "Ritmo Cardiaco: "+ applewatch.heartRate +"\n"+
                   "Llamadas sin celular: "+ applewatch.callsWithoutCell +"\n"+
                   "Geo-Localisacion: "+ applewatch.geoLocalitation +"\n"
                   );

        System.out.println("SmartWatch\n"+"Modelo: "+ samsungGalaxyS22.model +"\n"+
                "Sistema Operativo: "+ samsungGalaxyS22.operatingsystem +"\n"+
                "Storage: "+ samsungGalaxyS22.storage +"\n"+
                "Procesador: "+ samsungGalaxyS22.procesador +"\n"+
                "Pantalla: "+ samsungGalaxyS22.screnSize +"\n"+
                "Resistente al agua: "+ samsungGalaxyS22.waterResist +"\n"+
                "Camara: "+ samsungGalaxyS22.camera +"\n"+
                "Color: "+ samsungGalaxyS22.color +"\n"+
                "Peso: "+ samsungGalaxyS22.weight +"\n"+
                "Tipo de red: "+ samsungGalaxyS22.networkType +"\n");

       }
    }

