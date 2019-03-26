package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.capacityfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator.CargoCapacityComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;

import java.util.Collections;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxMinCargoCapacityFinder {

    public Plane getMaxCargoCapacityPlane(List<CargoPlane> cargoplanes) {
        return Collections.max(cargoplanes, new CargoCapacityComparator());
    }

    public Plane getMinCargoCapacityPlane(List<CargoPlane> cargoplanes) {
        return Collections.min(cargoplanes, new CargoCapacityComparator());
    }
}