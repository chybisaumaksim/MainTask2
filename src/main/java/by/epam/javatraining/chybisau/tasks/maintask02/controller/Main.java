package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.Fleet;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.logic.find.cruisingspeedfinder.MaxMinCruisingSpeedFinder;
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

        String pathToFlyingMachines = "C:\\Program Files\\Java\\Aircompany\\resources\\FlyingMachines.txt";
        Fleet fleet = new Fleet();
        View view = new ConsoleView();
        try {
            FlyingMachinesFactory flyingMachinesFactory = new FlyingMachinesFactory();
            for (String flyingMachinesFromFile : DataReceiver.getData(pathToFlyingMachines)) {
                fleet.add(flyingMachinesFactory.create(flyingMachinesFromFile));
            }
            List<FlyingMashines> flyingMashines = fleet.getFlyingMashines();
            logger.debug("Logic part");
            MaxMinCruisingSpeedFinder csf = new MaxMinCruisingSpeedFinder();
            view.print(csf.getMaxCruisingSpeedFlyingMashine(flyingMashines));
        } catch (PersistException e) {
            throw new PersistException("Error in creating flying machines. Reason: " + e.getMessage());
        }
    }
}


