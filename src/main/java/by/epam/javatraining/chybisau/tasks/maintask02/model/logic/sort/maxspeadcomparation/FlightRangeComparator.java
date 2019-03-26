package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparation;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FlightRangeComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        return (int) (o2.getFlightRange() - o1.getFlightRange());
    }

//    public void sortFlightRange(List<Plane> planes) {
//        Collections.sort(planes, new FlightRangeComparator());
//    }
}
