package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.cruisingspeedfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
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

    public FlyingMashines getMaxCruisingSpeedFlyingMashine(List<FlyingMashines> flyingMashines) {
        return Collections.max(flyingMashines, new CruisingSpeedComparator());
    }

    public FlyingMashines getMinCruisingSpeedFlyingMashine(List<FlyingMashines> flyingMashines) {
        return Collections.min(flyingMashines, new CruisingSpeedComparator());
    }
}