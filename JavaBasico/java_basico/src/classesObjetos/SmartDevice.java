package classesObjetos;

public class SmartDevice {
    String operatingsystem;

    String storage;
    String procesador;
    String screnSize;
    String model;
    public SmartDevice() {

    }


    public SmartDevice(String operatingsystem,  String storage, String procesador, String screnSize, String model) {
        this.operatingsystem = operatingsystem;

        this.storage = storage;
        this.procesador = procesador;
        this.screnSize = screnSize;
        this.model = model;
    }

}
