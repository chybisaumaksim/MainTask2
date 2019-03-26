package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.fuelconsumptiondinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparation.FuelConsumptionComparator;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxMinFuelConsumptionFinder {

    public Plane getMaxFuelConsumptionPlane(List<Plane> planes) {
        return Collections.max(planes, new FuelConsumptionComparator());
    }

    public Plane getMinFuelConsumptionPlane(List<Plane> planes) {
        return Collections.min(planes, new FuelConsumptionComparator());
    }
}