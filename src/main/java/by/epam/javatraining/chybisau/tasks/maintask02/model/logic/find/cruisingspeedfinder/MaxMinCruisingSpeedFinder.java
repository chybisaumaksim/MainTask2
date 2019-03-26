package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.cruisingspeedfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxMinCruisingSpeedFinder {

    public Plane getMaxCruisingSpeedPlane(List<Plane> planes) {
        return Collections.max(planes, new CruisingSpeedComparator());
    }

    public Plane getMinCruisingSpeedPlane(List<Plane> planes) {
        return Collections.min(planes, new CruisingSpeedComparator());
    }
}