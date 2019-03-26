package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An124;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities.An225;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Airbus_A320neo;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_300;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities.Boing737_500;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.fuelconsumptioncomparator.FuelConsumptionComparator;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.maxspeadcomparator.FlightRangeComparator;
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
        logger =  Logger.getLogger(Main.class);
    }

    public static void main(String[] args) throws IOException, PersistException {

        String path = "C:\\Program Files\\Java\\Aircompany\\src\\main\\resources\\";

        View view = new ConsoleView();
        Initializer initializer = new Initializer(path);
        Fleet fleet = new Fleet();
//creating objects
        Boing737_500 boing737500 = new Boing737_500();
        Boing737_300 boing737300 = new Boing737_300();
        Airbus_A320neo airbus_A320neo = new Airbus_A320neo();
        Airbus_A320neo airbus_A320neo2 = new Airbus_A320neo(6860.0, 840.0, 2750.0, 300.0);
        An124 an124 = new An124();
        An225 an225 = new An225(15_400, 800, 15_900, 250_000);
//initializing objects
        boing737300 = (Boing737_300) initializer.initializePassangerPlane(boing737300);
        boing737500 = (Boing737_500) initializer.initializePassangerPlane(boing737500);
        airbus_A320neo = (Airbus_A320neo) initializer.initializePassangerPlane(airbus_A320neo);
        an124 = (An124) initializer.initializeCargoPlane(an124);
//adding objects
        fleet.add(boing737500);
        fleet.add(boing737300);
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


