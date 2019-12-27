package Custom;

import DTO.Car;
import DTO.MotorBike;
import DTO.Van;

public interface CarParkManager {
    public void addCar(Car dto)throws Exception;
    public void deleteCar(String id)throws Exception;
    public void addVan(Van dto)throws Exception;
    public void deleteVan(String id)throws Exception;
    public void addBike(MotorBike dto)throws Exception;
    public void deleteBike(String id)throws Exception;
}
