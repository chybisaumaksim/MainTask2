package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparation;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;

import java.util.Comparator;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FuelConsumptionComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return (int) (o2.getFuelConsumption()-o1.getFuelConsumption());
    }


}
