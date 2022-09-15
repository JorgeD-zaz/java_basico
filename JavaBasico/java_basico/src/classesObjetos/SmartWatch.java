package classesObjetos;

public class SmartWatch extends SmartDevice {
    boolean heartRate;
    boolean callsWithoutCell;
    boolean  geoLocalitation;

    public SmartWatch(){

    }

    public SmartWatch(String operatingsystem, String storage, String procesador, String screnSize, String model, boolean heartRate, boolean callsWithoutCell, boolean geoLocalitation) {
        super(operatingsystem, storage, procesador, screnSize, model);
        this.heartRate = heartRate;
        this.callsWithoutCell = callsWithoutCell;
        this.geoLocalitation = geoLocalitation;
    }
}
