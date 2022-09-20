package interfaces;

import java.util.List;

public interface CocheCRUD {
    void save();
   List<CocheCRUD> findAll();
    void delete();
}
