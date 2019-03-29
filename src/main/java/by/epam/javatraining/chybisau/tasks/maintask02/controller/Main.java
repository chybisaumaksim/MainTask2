package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopters.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.flightrangecomparator.FlightRangeComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.util.*;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class Main {
    private static final Logger logger;

    static {
        logger = Logger.getLogger(Main.class);
    }

    public static void main(String[] args) throws IOException, PersistException {

        String pathToFlyingMachines = "C:\\Program Files\\Java\\Aircompany\\src\\main\\resources\\FlyingMachines.txt";
        Fleet fleet = new Fleet();
        List<String> listOfFlyingMachines = DataReceiver.getData(pathToFlyingMachines);
        FlyingMachinesFactory flyingMachinesFactory = new FlyingMachinesFactory();

        for (String flyingMachinesFromFile : listOfFlyingMachines) {
            fleet.add(flyingMachinesFactory.create(flyingMachinesFromFile));
        }

        List<Helicopter> helicopters = fleet.getHelicopters();
        List<Plane> planes = fleet.getPlanes();
        List<FlyingMashines> flyingMashines = fleet.getFlyingMashines();
        PassangerPlane passangerPlane = new PassangerPlane("Boeing737-800", 6900, 850, 2800, 295);
        CargoPlane cargoPlane = new CargoPlane("An127", 5800, 820, 7200, 12000);

        flyingMashines.add(passangerPlane);
        System.out.println(11);
FlightRangeComparator frc= new FlightRangeComparator();
        frc.sortFlightRange(flyingMashines);
//        frc.sortFlightRange(flyingMashines);
        System.out.println(flyingMashines);

//        logger.trace(fleet);
//        CargoCapacityComparator frc = new CargoCapacityComparator();
//        frc.sortFlightRange(planes);
    }
}


