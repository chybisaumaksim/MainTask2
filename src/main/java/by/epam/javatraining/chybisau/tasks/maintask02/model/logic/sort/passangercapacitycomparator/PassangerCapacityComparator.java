package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.passangercapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;

import java.util.Comparator;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class PassangerCapacityComparator implements Comparator<PassangerPlane> {

    @Override
    public int compare(PassangerPlane o1, PassangerPlane o2) {
        return (int) (o1.getPassangerCapacity() - o2.getPassangerCapacity());
    }
}
