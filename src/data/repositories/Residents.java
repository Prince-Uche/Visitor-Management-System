package data.repositories;
import data.models.Resident;

import java.util.ArrayList;
import java.util.List;
public class Residents implements ResidentRepo {
    private List<Resident> residents;
    private int userId = 1;

    @Override
    public List<Resident> findAll() {
        return new ArrayList<Resident>();
    }

    @Override
    public Resident findById(int id) {
        for (Resident resident : residents) {
            if (resident.getId() == id) {
                return resident;
            }
        }
        return null;
    }

    @Override
    public Resident save(Resident resident) {

        return null;
    }

    @Override
    public void delete(Resident resident) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByObject(Resident resident) {

    }

    @Override
    public void deleteAll() {

    }
}