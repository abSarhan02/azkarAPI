package com.absarhan.muslimbro.dao;


import com.absarhan.muslimbro.model.Azkar;

import javax.persistence.EntityManager;
import java.util.List;

public class AzkarDao extends BaseDao {
    public Azkar getAzkarById(Long id) {
        return get(Azkar.class, id);
    }
    public List<Azkar> getAllAzkar() {
        return getAll(Azkar.class);
    }
    public void saveAzkar(Azkar azkar) {
        save(azkar);
    }

    public void updateAzkar(Azkar azkar) {
        update(azkar);
    }

    public void deleteAzkar(Long id) {
        Azkar azkar = getAzkarById(id);
        if (azkar != null) {
            delete(azkar);
        }
    }
}
