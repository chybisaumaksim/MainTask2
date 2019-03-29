package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.flightrangecomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FlightRangeComparator implements Comparator<FlyingMashines> {

    @Override
    public int compare(FlyingMashines o1, FlyingMashines o2) {
        return (int) (o1.getFlightRange() - o2.getFlightRange());
    }

    public void sortFlightRangeOfFlyingMashines(List<FlyingMashines> flyingMashines) {
        flyingMashines.sort(new FlightRangeComparator());
    }

//    public void sortFlightRangeOfPlanes(List<Plane> planes) {
//        planes.sort(new FlightRangeComparator());
//    }
//
//    public void sortFlightRangeOfHelicopters(List<Helicopter> helicopter) {
//        helicopter.sort(new FlightRangeComparator());
//    }
//
//    public void sortFlightRangeOfPassangerPlanes(List<PassangerPlane> passangerPlanes) {
//        passangerPlanes.sort(new FlightRangeComparator());
//    }
//
//    public void sortFlightRangeOfCargoPlames(List<PassangerPlane> cargoPlanes) {
//        cargoPlanes.sort(new FlightRangeComparator());
//    }

//    public void sortFlightRangeOfFlyingMashines(List<FlyingMashines> planes) {
//        planes.sort(new FlightRangeComparator());
//    }

//    public void sortFlightRangeOfFlyingMashines(List<Plane> planes) {
//    }
}
