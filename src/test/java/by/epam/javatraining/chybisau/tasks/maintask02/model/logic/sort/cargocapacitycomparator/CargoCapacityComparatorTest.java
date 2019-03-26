package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An124;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An225;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Airbus_A320neo;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_300;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_500;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.capacityfinder.MaxMinCargoCapacityFinder;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparator.FlightRangeComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 * 26.03.2019
 */
public class CargoCapacityComparatorTest {
    Boing737_500 boing737500 = new Boing737_500(8400, 850, 2800, 240);
    Boing737_300 boing737300 = new Boing737_300(4400, 910, 2600, 277);
    Airbus_A320neo airbus_A320neo = new Airbus_A320neo(6850, 830, 2700, 330);
    An124 an124 = new An124(5425, 853, 12_600, 120_000);
    An225 an225 = new An225(15_400, 800, 15_900, 250_000);

    @Test
    public void testCompareOne() {
        List<CargoPlane> planes = new ArrayList<>();
        planes.add(an225);
        planes.add(an124);
        Collections.sort(planes, new CargoCapacityComparator());
        List<CargoPlane> expected = new ArrayList<>();
        expected.add(an124);
        expected.add(an225);
        assertEquals(expected, planes);
    }

    @Test
    public void testCompareTwo() {
        double exp=-130000;
        assertEquals(exp, new CargoCapacityComparator().compare(an124, an225), 0.000);
    }
}