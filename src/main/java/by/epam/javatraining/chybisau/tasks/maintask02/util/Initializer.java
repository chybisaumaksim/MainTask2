package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import org.apache.log4j.Logger;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Initializer {

    private static Initializer instance;
    private static final Logger logger;

    static {
        logger = Logger.getRootLogger();
    }

    public static Initializer getInstance() {
        if (instance == null) {
            instance = new Initializer();
        }
        return instance;
    }

    public Initializer() {
    }

    public void initializeFlyingMachine(PassangerPlane passangerPlane, String datesOfFlyingMachine) throws PersistException {
        StringTokenizer st = new StringTokenizer(datesOfFlyingMachine, ",");
        try {
            while (st.hasMoreTokens()) {
                st.nextToken();
                passangerPlane.setName(st.nextToken());
                passangerPlane.setFlightRange(Double.parseDouble(st.nextToken()));
                passangerPlane.setCruisingSpeed(Double.parseDouble(st.nextToken()));
                passangerPlane.setFuelConsumption(Double.parseDouble(st.nextToken()));
                passangerPlane.setPassangerCapacity(Double.parseDouble(st.nextToken()));
            }
        } catch (NoSuchElementException e) {
            throw new PersistException("No such element ", e.getMessage());
        }
    }

    public void initializeFlyingMachine(CargoPlane cargoPlane, String datesOfFlyingMachine) throws PersistException {
        StringTokenizer st = new StringTokenizer(datesOfFlyingMachine, ",");
        try {
            while (st.hasMoreTokens()) {
                st.nextToken();
                cargoPlane.setName(st.nextToken());
                cargoPlane.setFlightRange(Double.parseDouble(st.nextToken()));
                cargoPlane.setCruisingSpeed(Double.parseDouble(st.nextToken()));
                cargoPlane.setFuelConsumption(Double.parseDouble(st.nextToken()));
                cargoPlane.setCargoCapacity(Double.parseDouble(st.nextToken()));
            }
        } catch (NoSuchElementException e) {
            throw new PersistException("No such element ", e.getMessage());
        }
    }

    public void initializeFlyingMachine(Helicopter helicopter, String datesOfFlyingMachine) throws PersistException {
        StringTokenizer st = new StringTokenizer(datesOfFlyingMachine, ",");
        try {
            while (st.hasMoreTokens()) {
                st.nextToken();
                helicopter.setName(st.nextToken());
                helicopter.setFlightRange(Double.parseDouble(st.nextToken()));
                helicopter.setCruisingSpeed(Double.parseDouble(st.nextToken()));
                helicopter.setFuelConsumption(Double.parseDouble(st.nextToken()));
                helicopter.setNeedOfRunway(Boolean.getBoolean(st.nextToken()));
            }
        } catch (NoSuchElementException e) {
            throw new PersistException("No such element ", e.getMessage());
        }
    }
}

