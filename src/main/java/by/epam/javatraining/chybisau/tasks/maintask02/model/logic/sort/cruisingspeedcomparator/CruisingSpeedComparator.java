package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;

import java.util.Comparator;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class CruisingSpeedComparator implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        int result = 0;
        if (o1 != null && o2 != null) {
            result = (int) (o1.getCruisingSpeed()-o2.getCruisingSpeed());
        } else {
            System.err.println("Found zero in incoming dates");
        }
        return result;
    }

    public List<Plane> getAscendingOrderOfCruisingSpeed(List<Plane> planes) {
        planes.sort(new CruisingSpeedComparator);
        return planes;
    }


}
