package classesObjetos;

public class SmartPhone extends SmartDevice {
    boolean camera;
    boolean waterResist;
    String color;
    String weight;
    String networkType;

    public SmartPhone() {
    }

    public SmartPhone(String operatingsystem, String storage, String procesador, String screnSize, String model, boolean camera, boolean waterResist, String color, String weight, String networkType) {
        super(operatingsystem, storage, procesador, screnSize, model);
        this.camera = camera;
        this.waterResist = waterResist;
        this.color = color;
        this.weight = weight;
        this.networkType = networkType;
    }
}
    

