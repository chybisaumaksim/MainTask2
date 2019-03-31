package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.passangercapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.flightrangecomparator.FlightRangeComparator;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class PassangerCapacityComparator implements Comparator<PassangerPlane> {


    @Override
    public int compare(PassangerPlane o1, PassangerPlane o2) {
        int result = 0;
        if (o1 != null && o2 != null) {
            result = (int) (o1.getPassangerCapacity() - o2.getPassangerCapacity());
        } else {
            System.err.println("Found zero in incoming dates in " + getClass().getName());
        }
        return result;
    }

    public List<PassangerPlane> sortPassangerCapacityOfPlanes(List<PassangerPlane> planes) {
        planes.sort(new PassangerCapacityComparator());
        return planes;
    }



}
