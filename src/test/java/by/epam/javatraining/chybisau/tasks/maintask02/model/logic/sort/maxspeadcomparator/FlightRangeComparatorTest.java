package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An124;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Airbus_A320neo;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_300;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_500;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator.FuelConsumptionComparator;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Maksim Chybisau on 26/03/19.
 *
 * @version 0.0.1
 * 26.03.2019
 */
public class FlightRangeComparatorTest {
    Boing737_500 boing737500 = new Boing737_500(8400, 850, 2800, 240);
    Boing737_300 boing737300 = new Boing737_300(4400, 910, 2600, 277);
    Airbus_A320neo airbus_A320neo = new Airbus_A320neo(6850, 830, 2700, 330);
    An124 an124 = new An124(5425, 853, 12_600, 120_000);

    @Test
    public void testCompareOne() {
        List<Plane> planes = new ArrayList<>();
        planes.add(boing737500);
        planes.add(boing737300);
        planes.add(airbus_A320neo);
        planes.add(an124);
        Collections.sort(planes, new FlightRangeComparator());
        List<Plane> expected = new ArrayList<>();
        expected.add(boing737300);
        expected.add(an124);
        expected.add(airbus_A320neo);
        expected.add(boing737500);
        assertEquals(expected, planes);
    }

    @Test
    public void testCompareTwo() {
        double exp = 4000;
        assertEquals(exp, new FlightRangeComparator().compare(boing737500, boing737300), 0.000);
    }

}