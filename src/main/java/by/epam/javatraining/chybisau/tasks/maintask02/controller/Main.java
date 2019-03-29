package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopters.Helicopter;
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

        String pathToFlyingMachines = "C:\\Program Files\\Java\\Aircompany\\src\\main\\resources\\FlyingMachines.txt";
        Fleet fleet = new Fleet();
        List<String> listOfFlyingMachines = DataReceiver.getData(pathToFlyingMachines);
        FlyingMachinesFactory flyingMachinesFactory = new FlyingMachinesFactory();
        for (String flyingMachines : listOfFlyingMachines) {
            fleet.add(flyingMachinesFactory.create(flyingMachines));
        }
        System.out.println(111);
        List<Plane> planes = fleet.getPlanes();
        List<Helicopter> helicopters = fleet.getHelicopters();
//sorting of objects
        Collections.sort(planes, new FlightRangeComparator());
//        Collections.sort(planes, new CruisingSpeedComparator());
//        Collections.sort(planes, new FuelConsumptionComparator());
//        logger.trace(fleet);
//        CargoCapacityComparator frc = new CargoCapacityComparator();
//        frc.sortFlightRange(planes);
    }
}


