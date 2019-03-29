package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator.FuelConsumptionComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparator.FlightRangeComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.util.DataReceiver;
import by.epam.javatraining.chybisau.tasks.maintask02.util.FlyingMachinesFactory;
import by.epam.javatraining.chybisau.tasks.maintask02.util.PersistException;
import by.epam.javatraining.chybisau.tasks.maintask02.util.Initializer;
import by.epam.javatraining.chybisau.tasks.maintask02.view.ConsoleView;
import by.epam.javatraining.chybisau.tasks.maintask02.view.View;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Collections;
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

        String path = "C:\\Program Files\\Java\\Aircompany\\src\\main\\resources\\";

        String pathToFlyingMachines = "C:\\Program Files\\Java\\Aircompany\\src\\main\\resources\\FlyingMachines.txt";
        View view = new ConsoleView();
        Initializer initializer = new Initializer(path);
        Fleet fleet = new Fleet();
        List<String> listOfFlyingMachines = DataReceiver.getData(pathToFlyingMachines);
        FlyingMachinesFactory flyingMachinesFactory = new FlyingMachinesFactory();

        for (String flyingMachines : listOfFlyingMachines) {
            fleet.add(flyingMachinesFactory.create(flyingMachines));
        }


//creating objects
        PassangerPlane boeing737500 = new PassangerPlane("Boeing737500", 8400.0, 850.0, 2800.0, 240.0);
        PassangerPlane boeing737300 = new PassangerPlane();
        PassangerPlane airbus_A320neo = new PassangerPlane();
        PassangerPlane airbus_A320neo2 = new PassangerPlane("Airbus_A320neo", 26860.0, 840.0, 2750.0, 300.0);
        CargoPlane an124 = new CargoPlane();
        CargoPlane an225 = new CargoPlane(15_400.0, 800.0, 15_900.0, 250_000.0);
//initializing objects
        boeing737300 = initializer.initializePassangerPlane(boeing737300);
        boeing737500 = initializer.initializePassangerPlane(boeing737500);
        airbus_A320neo = initializer.initializePassangerPlane(airbus_A320neo);
        an124 = initializer.initializeCargoPlane(an124);
//adding objects
        fleet.add(boeing737500);
        fleet.add(boeing737300);
        fleet.add(airbus_A320neo);
        fleet.add(an124);
        fleet.add(airbus_A320neo2);
//list of objects
        List<Plane> planes = fleet.getPlanes();
//sorting of objects
        Collections.sort(planes, new FlightRangeComparator());
        Collections.sort(planes, new CruisingSpeedComparator());
        Collections.sort(planes, new FuelConsumptionComparator());
        logger.trace(fleet);
//        CargoCapacityComparator frc = new CargoCapacityComparator();
//        frc.sortFlightRange(planes);
    }
}


