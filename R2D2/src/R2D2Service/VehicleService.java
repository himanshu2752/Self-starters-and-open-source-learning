package R2D2Service;
import java.util.List;

public interface VehicleService {
	
	List<Vehicle> Get();
	Vehicle get(int id);
	void Create(Vehicle vehicle);
	void Update(Vehicle vehicle);
	void Delete(Vehicle vehicle);
}