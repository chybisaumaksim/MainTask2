package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
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
public class FuelConsumptionComparatorTest {
    PassangerPlane boing737500 = new PassangerPlane("Boing737500", 8400, 850, 2800, 240);
    PassangerPlane boing737300 = new PassangerPlane("Boing737300", 4400, 910, 2600, 277);
    PassangerPlane airbus_A320neo = new PassangerPlane("Airbus_A320neo", 6850, 830, 2700, 330);
    CargoPlane an124 = new CargoPlane("An124", 5425, 853, 12_600, 120_000);

    @Test
    public void testCompareOne() {
        List<FlyingMashines> planes = new ArrayList<>();
        planes.add(boing737500);
        planes.add(boing737300);
        planes.add(airbus_A320neo);
        planes.add(an124);
        Collections.sort(planes, new FuelConsumptionComparator());
        List<FlyingMashines> expected = new ArrayList<>();
        expected.add(boing737300);
        expected.add(airbus_A320neo);
        expected.add(boing737500);
        expected.add(an124);
        assertEquals(expected, planes);
    }

    @Test
    public void testCompareTwo() {
        List<FlyingMashines> planes = new ArrayList<>();
        planes.add(boing737500);
        planes.add(boing737300);
        planes.add(airbus_A320neo);
        List<FlyingMashines> expected = new ArrayList<>();
        FuelConsumptionComparator fcc=new FuelConsumptionComparator();
        expected.add(boing737300);
        expected.add(airbus_A320neo);
        expected.add(boing737500);
        assertEquals(expected, fcc.sortFuelConsumptionOfPlanes(planes));
    }
}