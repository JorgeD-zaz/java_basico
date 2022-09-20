package interfaces;

public class Main {

   static CocheCRUDImp coche = new CocheCRUDImp();

    public static void main(String[] args) {
        coche.save();
        coche.findAll();
        coche.delete();
    }
}
