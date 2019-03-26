package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.controller.Main;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Initializer {
    private static final Logger logger;
    private static List<String> planeList;
    private String PATH;
    static {
        logger =  Logger.getRootLogger();
    }

    public static List<String> getPlaneList() {
        return planeList;
    }

    public static void setPlaneList(List<String> planeList) {
        Initializer.planeList = planeList;
    }

    public Initializer(String path) throws IOException, PersistException {
        this.PATH = path;
    }

    public PassangerPlane initializePassangerPlane(PassangerPlane passangerPlane) throws IOException, PersistException {
        try {
            String pathOfClass = String.valueOf(passangerPlane.getClass().getSimpleName()) + ".txt";
            planeList = DataReceiver.getData(PATH + pathOfClass);
            passangerPlane.setFlightRange(getFlightRange());
            passangerPlane.setCruisingSpeed(getCruisingSpeed());
            passangerPlane.setFuelConsumption(getFuelConsumption());
            passangerPlane.setPassangerCapacity(getPassangerCapacity());
        } catch (PersistException e) {
            System.err.println("Ошибка доступа к файлу ");
        }
        return passangerPlane;
    }

    public CargoPlane initializeCargoPlane(CargoPlane cargoPlane) throws IOException, PersistException {
        cargoPlane.setFlightRange(getFlightRange());
        cargoPlane.setCruisingSpeed(getCruisingSpeed());
        cargoPlane.setFuelConsumption(getFuelConsumption());
        cargoPlane.setCargoCapacity(getCargoCapacity());
        return cargoPlane;
    }

    public double getFlightRange() {
        return Double.parseDouble(planeList.get(0));
    }

    public double getCruisingSpeed() {
        return Double.parseDouble(String.valueOf(planeList.get(1)));
    }

    public double getFuelConsumption() {
        return Double.parseDouble(String.valueOf(planeList.get(2)));
    }

    public double getPassangerCapacity() {
        return Double.parseDouble(String.valueOf(planeList.get(3)));
    }

    public double getCargoCapacity() {
        return Double.parseDouble(String.valueOf(planeList.get(3)));
    }
}
