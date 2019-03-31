package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import org.apache.log4j.Logger;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Creator {
    private static final Logger logger;
    private static Creator instance;

    static {
        logger = Logger.getLogger(Creator.class);
    }

    private Creator() {
    }

    static Creator getInstance() {
        if (instance == null) {
            instance = new Creator();
        }
        return instance;
    }

    PassangerPlane createPassengerPlane() {
        logger.debug("Creating passanger plane");
        return new PassangerPlane();
    }

    CargoPlane createCargoPlane() throws IOException, PersistException {
        logger.debug("Creating cargo plane");
        return new CargoPlane();
    }

    Helicopter createHelicopter() {
        logger.debug("Creating helicopter");
        return new Helicopter();
    }

    Plane createPlane() {
        logger.debug("Creating plane");
        return new Plane();
    }
}
