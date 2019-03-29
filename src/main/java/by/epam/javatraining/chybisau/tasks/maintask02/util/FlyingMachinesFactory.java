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

    private static final String PASSANGERPLANE = "passangerPlane";
    private static final String CARGOPLANE = "cargoPlane";
    private static final String HELICOPTER = "helicopter";

    private Creator creator = Creator.getInstance();
    private Initializer initializer = Initializer.getInstance();

    public FlyingMachinesFactory() throws IOException, PersistException {
    }

    public FlyingMashines create(String datesOfFlyingMachine) throws IOException, PersistException {
        FlyingMashines flyingMashine = null;
        try {
            StringTokenizer st = new StringTokenizer(datesOfFlyingMachine, ",");
            String datasOfFlyingMashine = st.nextToken();
            switch (datasOfFlyingMashine) {
                case PASSANGERPLANE:
                    flyingMashine = creator.createPassengerPlane();
                    initializer.initializeFlyingMachine((PassangerPlane) flyingMashine, datesOfFlyingMachine);
                    break;
                case CARGOPLANE:
                    flyingMashine = creator.createCargoPlane();
                    initializer.initializeFlyingMachine((CargoPlane) flyingMashine, datesOfFlyingMachine);
                    break;
                case HELICOPTER:
                    flyingMashine = creator.createHelicopter();
                    initializer.initializeFlyingMachine((Helicopter) flyingMashine, datesOfFlyingMachine);
                    break;
                default :
                    System.err.println("Error in creation flying machines. Mismatch dates from file");
            }
        } catch (PersistException e) {
            throw new PersistException("Error in creation flying machines", e.getMessage());
        }
        return flyingMashine;
    }
}





