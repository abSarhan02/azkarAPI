package com.absarhan.muslimbro.business;

import com.absarhan.muslimbro.dao.AzkarDao;
import com.absarhan.muslimbro.model.Azkar;

import java.util.List;

public class AzkarManager {

    private final AzkarDao azkarDao = new AzkarDao();

    public Azkar getAzkarById(Long id) {
        return azkarDao.getAzkarById(id);
    }

    public List<Azkar> getAllAzkar() {
        return azkarDao.getAllAzkar();
    }

    public void saveAzkar(Azkar azkar) {
        azkarDao.saveAzkar(azkar);
    }

    public void updateAzkar(Azkar azkar) {
        azkarDao.updateAzkar(azkar);
    }

    public void deleteAzkar(Long id) {
        azkarDao.deleteAzkar(id);
    }
}
