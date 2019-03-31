package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Maksim Chybisau on 26/03/19.
 *
 * @version 0.0.1
 * 26.03.2019
 */
public class CruisingSpeedComparatorTest {
    PassangerPlane boing737500 = new PassangerPlane("Boing737500", 8400, 850, 2800, 240);
    PassangerPlane boing737300 = new PassangerPlane("Boing737300", 4400, 910, 2600, 277);
    PassangerPlane airbus_A320neo = new PassangerPlane("Airbus_A320neo", 6850, 830, 2700, 330);
    CargoPlane an124 = new CargoPlane("An124", 5425, 853, 12_600, 120_000);
    Helicopter mi8 = new Helicopter("Mi8", 608, 225, 680, false);

    @Test
    public void testCompareOne() {
        List<FlyingMashines> flyingMashines = new ArrayList<>();
        flyingMashines.add(boing737500);
        flyingMashines.add(boing737300);
        flyingMashines.add(airbus_A320neo);
        flyingMashines.add(an124);
        flyingMashines.add(mi8);
        List<FlyingMashines> expected = new ArrayList<>();
        CruisingSpeedComparator cspc = new CruisingSpeedComparator();
        expected.add(mi8);
        expected.add(airbus_A320neo);
        expected.add(boing737500);
        expected.add(an124);
        expected.add(boing737300);
        assertEquals(expected, cspc.getAscendingOrderOfCruisingSpeed(flyingMashines));
    }

    @Test
    public void testCompareTwo() {
        List<FlyingMashines> flyingMashines = new ArrayList<>();
        flyingMashines.add(boing737500);
        flyingMashines.add(boing737300);
        flyingMashines.add(airbus_A320neo);
        flyingMashines.add(an124);
        flyingMashines.add(mi8);
        flyingMashines.sort(new CruisingSpeedComparator());
        List<FlyingMashines> expected = new ArrayList<>();
        expected.add(mi8);
        expected.add(airbus_A320neo);
        expected.add(boing737500);
        expected.add(an124);
        expected.add(boing737300);
        assertEquals(expected, flyingMashines);
    }

}