package interfaces;

import java.util.List;

public class CocheCRUDImp implements CocheCRUD {
    @Override
    public void save() {
        System.out.println("Este es el metodo save");
    }

    @Override
    public List<CocheCRUD>findAll() {
    System.out.println("Este es el metodo findAll");
    return null;
    }

    @Override
    public void delete() {
        System.out.println("Este es el metodo delete");
    }
}
