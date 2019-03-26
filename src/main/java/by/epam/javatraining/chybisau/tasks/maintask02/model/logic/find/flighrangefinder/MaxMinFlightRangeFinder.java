package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.flighrangefinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparation.FuelConsumptionComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparation.FlightRangeComparator;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxMinFlightRangeFinder {

    public Plane getMaxFlightRangePlane(List<Plane> planes) {
        return Collections.max(planes, new FlightRangeComparator());
    }

    public Plane getMinFlightRangePlane(List<Plane> planes) {
        return Collections.min(planes, new FlightRangeComparator());
    }
}
