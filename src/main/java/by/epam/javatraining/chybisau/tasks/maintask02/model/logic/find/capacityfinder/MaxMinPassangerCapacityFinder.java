package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.capacityfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.passangercapacitycomparator.PassangerCapacityComparator;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxMinPassangerCapacityFinder {
    public Plane getMaxPassangerCapacityPlane(List<PassangerPlane> passangerPlanes) {
        return Collections.max(passangerPlanes, new PassangerCapacityComparator());
    }

    public Plane getMinPassangerCapacityPlane(List<PassangerPlane> passangerPlanes) {
        return Collections.min(passangerPlanes, new PassangerCapacityComparator());
    }
}
