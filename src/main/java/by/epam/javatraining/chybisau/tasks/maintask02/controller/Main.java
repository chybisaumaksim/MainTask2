package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.sort.cruisingspeedcomparator.CruisingSpeedComparator;
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
        View view=new ConsoleView();
        try {
            List<String> listOfFlyingMachines = DataReceiver.getData(pathToFlyingMachines);
            FlyingMachinesFactory flyingMachinesFactory = new FlyingMachinesFactory();
            for (String flyingMachinesFromFile : listOfFlyingMachines) {
                fleet.add(flyingMachinesFactory.create(flyingMachinesFromFile));
            }
            List<FlyingMashines> flyingMashines= fleet.getFlyingMashines();
            CruisingSpeedComparator ccc = new CruisingSpeedComparator();
            view.print(ccc.getAscendingOrderOfCruisingSpeed(flyingMashines));
        } catch (PersistException e) {
            throw new PersistException("Error in creating flying machines. Reason: " + e.getMessage());
        }
    }
}


