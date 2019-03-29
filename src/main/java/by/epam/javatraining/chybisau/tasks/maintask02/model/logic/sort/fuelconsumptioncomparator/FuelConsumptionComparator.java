package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.flightrangecomparator.FlightRangeComparator;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FuelConsumptionComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        int result = 0;
        if (o1 != null && o2 != null) {
            result = (int) (o1.getFuelConsumption() - o2.getFuelConsumption());
        } else {
            System.err.println("Found zero in incoming dates");
        }
        return result;
    }

    public List<Plane> sortFuelConsumptionOfPlanes(List<Plane> planes) {
         planes.sort(new FlightRangeComparator());
         return planes;
    }
}
