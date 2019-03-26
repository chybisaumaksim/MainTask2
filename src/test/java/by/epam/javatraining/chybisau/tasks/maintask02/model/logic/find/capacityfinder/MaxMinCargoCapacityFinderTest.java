package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.capacityfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An124;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An225;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Airbus_A320neo;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_300;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_500;
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
    Boing737_500 boing737500 = new Boing737_500(8400, 850, 2800, 240);
    Boing737_300 boing737300 = new Boing737_300(4400, 910, 2600, 277);
    Airbus_A320neo airbus_A320neo = new Airbus_A320neo(6850, 830, 2700, 330);
    An124 an124 = new An124(5425, 853, 12_600, 120_000);
    An225 an225 = new An225(15_400, 800, 15_900, 250_000);

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