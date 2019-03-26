package by.epam.javatraining.chybisau.tasks.maintask02.util;

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

    public Creator() throws IOException, PersistException {
    }

    public PassangerPlane createPassengerPlane() throws IOException, PersistException {
        return new PassangerPlane();
    }

    public CargoPlane createCargoPlane() throws IOException, PersistException {
        return new CargoPlane();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
