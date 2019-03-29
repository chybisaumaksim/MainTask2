package by.epam.javatraining.chybisau.tasks.maintask02.util;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
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
        StringTokenizer st = new StringTokenizer(datesOfFlyingMachine);
        String planes = st.nextToken();
//        String[] words = StringTokenizer.devide(stringFromFile);
        switch (planes) {
            case PASSANGERPLANE:
                flyingMashine = creator.createPassengerPlane();
                initializer.initializeFlyingMachine((PassangerPlane)flyingMashine, datesOfFlyingMachine);
                break;
            case CARGOPLANE:
                flyingMashine = creator.createCargoPlane();
                initializer.initializeFlyingMachine(flyingMashine, datesOfFlyingMachine);
                break;
            case HELICOPTER:
                flyingMashine = creator.createCargoPlane();
                initializer.initializeFlyingMachine(flyingMashine, datesOfFlyingMachine);
                break;


        }
        return flyingMashine;
    }
}





