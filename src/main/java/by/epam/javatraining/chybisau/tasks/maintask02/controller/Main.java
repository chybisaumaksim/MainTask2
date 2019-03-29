package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cargocapacitycomparator.CargoCapacityComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.flightrangecomparator.FlightRangeComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator.FuelConsumptionComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.passangercapacitycomparator.PassangerCapacityComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.util.*;
import by.epam.javatraining.chybisau.tasks.maintask02.view.ConsoleView;
import by.epam.javatraining.chybisau.tasks.maintask02.view.View;
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
        List<FlyingMashines> flyingMashines = fleet.getFlyingMashines();
        List<Plane> planes = fleet.getPlanes();
        List<Helicopter> helicopters = fleet.getHelicopters();

        PassangerPlane passangerPlane = new PassangerPlane("Boeing737-800", 6900, 850, 2800, 295);
        flyingMashines.add(passangerPlane);
View view = new ConsoleView();

        FlightRangeComparator frc = new FlightRangeComparator();
        CargoCapacityComparator ccc = new CargoCapacityComparator();
        CruisingSpeedComparator csc = new CruisingSpeedComparator();
        FuelConsumptionComparator fcc = new FuelConsumptionComparator();
        PassangerCapacityComparator pcc = new PassangerCapacityComparator();
//        frc.sortFlightRangeOfFlyingMashines(flyingMashines);
        frc.sortFlightRangeOfFlyingMashines(flyingMashines);
        view.print(csc.getAscendingOrderOfCruisingSpeed(flyingMashines));
//
//        frc.sortFlightRange(flyingMashines);
//        logger.trace(fleet);
    }
}


