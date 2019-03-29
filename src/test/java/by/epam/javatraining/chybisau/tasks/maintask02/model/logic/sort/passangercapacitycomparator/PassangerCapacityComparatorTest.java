package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.passangercapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
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
public class PassangerCapacityComparatorTest {
    PassangerPlane boing737500 = new PassangerPlane(8400, 850, 2800, 240);
    PassangerPlane boing737300 = new PassangerPlane(4400, 910, 2600, 277);
    PassangerPlane airbus_A320neo = new PassangerPlane(6850, 830, 2700, 330);
    CargoPlane  an124 = new CargoPlane(5425, 853, 12_600, 120_000);
    CargoPlane an225 = new CargoPlane(15_400, 800, 15_900, 250_000);

    @Test
    public void testCompareOne() {
        List<PassangerPlane> planes = new ArrayList<>();
        planes.add(boing737500);
        planes.add(boing737300);
        planes.add(airbus_A320neo);
        Collections.sort(planes, new PassangerCapacityComparator());
        List<Plane> expected = new ArrayList<>();
        expected.add(boing737500);
        expected.add(boing737300);
        expected.add(airbus_A320neo);
        assertEquals(expected, planes);
    }

    @Test
    public void testCompareTwo() {
        double exp = 90;
        assertEquals(exp, new PassangerCapacityComparator().compare(airbus_A320neo, boing737500), 0.000);
    }

}