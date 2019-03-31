package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.cruisingspeedfinder;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
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

public class MaxMinCruisingSpeedFinderTest {
    PassangerPlane boing737500 = new PassangerPlane("Boing737500", 8400, 850, 2800, 240);
    PassangerPlane boing737300 = new PassangerPlane("Boing737300",4400, 910, 2600, 277);
    PassangerPlane airbus_A320neo = new PassangerPlane("Airbus_A320neo",6850, 830, 2700, 330);
    CargoPlane  an124 = new CargoPlane("An124", 5425, 853, 12_600, 120_000);
    CargoPlane an225 = new CargoPlane("An225", 15_400, 800, 15_900, 250_000);

    @Test
    public void testGetMaxCruisingSpeedFlyingMashine() {
        List<FlyingMashines> flyingMashines = new ArrayList<>();
        flyingMashines.add(boing737500);
        flyingMashines.add(boing737300);
        flyingMashines.add(airbus_A320neo);
        flyingMashines.add(an124);
        flyingMashines.add(an225);
        assertEquals(boing737300, new MaxMinCruisingSpeedFinder().getMaxCruisingSpeedFlyingMashine(flyingMashines));
    }

    @Test
    public void testMinCruisingSpeedFlyingMashine() {
        List<FlyingMashines> flyingMashines = new ArrayList<>();
        flyingMashines.add(boing737500);
        flyingMashines.add(boing737300);
        flyingMashines.add(airbus_A320neo);
        flyingMashines.add(an124);
        flyingMashines.add(an225);
        assertEquals(an225, new MaxMinCruisingSpeedFinder().getMinCruisingSpeedFlyingMashine(flyingMashines));
    }
}