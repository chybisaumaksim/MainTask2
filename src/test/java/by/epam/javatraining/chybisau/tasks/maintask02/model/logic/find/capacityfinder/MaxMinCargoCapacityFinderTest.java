package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.capacityfinder;

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
public class MaxMinCargoCapacityFinderTest {
    PassangerPlane boing737500 = new PassangerPlane("Boing737500", 8400, 850, 2800, 240);
    PassangerPlane boing737300 = new PassangerPlane("Boing737300",4400, 910, 2600, 277);
    PassangerPlane airbus_A320neo = new PassangerPlane("Airbus_A320neo",6850, 830, 2700, 330);
    CargoPlane  an124 = new CargoPlane("An124", 5425, 853, 12_600, 120_000);
    CargoPlane an225 = new CargoPlane("An225", 15_400, 800, 15_900, 250_000);

    @Test
    public void testGetMaxCargoCapacityPlane() {
        List<CargoPlane> planes = new ArrayList<>();
        planes.add(an124);
        planes.add(an225);
        assertEquals(an225, new MaxMinCargoCapacityFinder().getMaxCargoCapacityPlane(planes));
    }

    @Test
    public void testGetMinCargoCapacityPlane() {
        List<CargoPlane> planes = new ArrayList<>();
        planes.add(an124);
        planes.add(an225);
        assertEquals(an124, new MaxMinCargoCapacityFinder().getMinCargoCapacityPlane(planes));
    }
}