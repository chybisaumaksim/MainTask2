package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import org.testng.annotations.Test;

import java.util.ArrayList;
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
    CargoPlane an124 = new CargoPlane("An124", 5425, 853, 12_600, 120_000);
    CargoPlane an225 = new CargoPlane("An225", 15_400, 800, 15_900, 250_000);

    @Test
    public void testCompareOne() {
        List<CargoPlane> planes = new ArrayList<>();
        planes.add(an225);
        planes.add(an124);
        planes.sort(new CargoCapacityComparator());
        List<CargoPlane> expected = new ArrayList<>();
        expected.add(an124);
        expected.add(an225);
        assertEquals(expected, planes);
    }

    @Test
    public void testCompareTwo() {
        List<CargoPlane> planes = new ArrayList<>();
        planes.add(an225);
        planes.add(an124);
        CargoCapacityComparator ccc = new CargoCapacityComparator();
        List<CargoPlane> expected = new ArrayList<>();
        expected.add(an124);
        expected.add(an225);
        assertEquals(expected, ccc.getAscendingOrderOfCargoCapacity(planes));
    }
}