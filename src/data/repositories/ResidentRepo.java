package data.repositories;
import java.util.List;
import data.models.Resident;
public interface ResidentRepo {
    public List<Resident> getAllResidents();
    public Resident getResidentById(int id);


}
