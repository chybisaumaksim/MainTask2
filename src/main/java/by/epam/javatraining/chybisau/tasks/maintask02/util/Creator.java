package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Creator {
    private static Creator instance;

    public Creator()  {
    }

    public static Creator getInstance()  {
        if (instance == null) {
            instance = new Creator();
        }
        return instance;
    }

    public PassangerPlane createPassengerPlane()  {
        return new PassangerPlane();
    }

    public CargoPlane createCargoPlane() throws IOException, PersistException {
        return new CargoPlane();
    }

    public Plane createPlane() {
        return new Plane();
    }

    public Helicopter createHelicopter() {
        return new Helicopter();
    }
}
