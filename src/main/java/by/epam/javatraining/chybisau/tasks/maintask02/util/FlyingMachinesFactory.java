package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;

import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class FlyingMachinesFactory {

    private Creator creator = Creator.getInstance();
    private Initializer initializer = Initializer.getInstance();

    public FlyingMachinesFactory() {
    }

    public FlyingMashines create(String datesOfFlyingMachine) throws IOException, PersistException {
        FlyingMashines flyingMashine = null;
        try {
            StringTokenizer st = new StringTokenizer(datesOfFlyingMachine, ",");
            switch (st.nextToken()) {
                case "passangerPlane":
                    flyingMashine = initializer.initializeFlyingMachine(creator.createPassengerPlane(), datesOfFlyingMachine);
                    break;
                case "cargoPlane":
                    flyingMashine = initializer.initializeFlyingMachine(creator.createCargoPlane(), datesOfFlyingMachine);
                    break;
                case "helicopter":
                    flyingMashine = initializer.initializeFlyingMachine(creator.createHelicopter(), datesOfFlyingMachine);
                    break;
                default:
                    System.err.println("Error in creation flying machines. Mismatch dates from file" +getClass().getName());
            }
        } catch (PersistException e) {
            throw new PersistException("Error in creation flying machines", e.getMessage());
        } return flyingMashine;
    }
}





