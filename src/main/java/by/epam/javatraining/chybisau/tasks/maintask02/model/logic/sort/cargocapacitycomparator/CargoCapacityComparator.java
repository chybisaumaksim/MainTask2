package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class CargoCapacityComparator implements Comparator<CargoPlane> {

    @Override
    public int compare(CargoPlane o1, CargoPlane o2) {
        int result = 0;
        if (o1 != null && o2 != null) {
            result = (int) (o1.getCargoCapacity() - o2.getCargoCapacity());
        } else {
            System.err.println("Found zero in incoming dates");
        }
        return result;
    }

    public List<CargoPlane> getAscendingOrderOfCargoCapacity(List<CargoPlane> cargoPlanes) {
        cargoPlanes.sort(new CargoCapacityComparator());
        return cargoPlanes;
    }
}



