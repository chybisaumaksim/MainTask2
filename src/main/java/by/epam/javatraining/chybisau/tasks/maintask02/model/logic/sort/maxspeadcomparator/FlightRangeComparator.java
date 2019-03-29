package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator.CargoCapacityComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FlightRangeComparator implements Comparator<FlyingMashines> {

    @Override
    public int compare((Plane)FlyingMashines o1, (Plane)FlyingMashines o2) {
        return (int) (o1.getFlightRange() - o2.getFlightRange());
    }

    public void sortFlightRange(List<Plane> planes) {
        Collections.sort(planes, new FlightRangeComparator());
    }
}
