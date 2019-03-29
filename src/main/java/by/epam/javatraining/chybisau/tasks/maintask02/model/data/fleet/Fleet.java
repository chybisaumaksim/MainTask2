package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopters.Helicopter;
import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Fleet {
    private static final Logger logger;

    static {
        logger = Logger.getRootLogger();
    }

    private List<Plane> planes;
    private List<FlyingMashines> flyingMashines;
    private List<Helicopter> helicopters;

    public List<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(List<Helicopter> helicopters) {
        this.helicopters = helicopters;
    }

    public Fleet() {
        flyingMashines = new ArrayList<>();
        helicopters = new ArrayList<>();
        planes = new ArrayList<>();
    }

    public void add(Plane plane) {
        planes.add(plane);
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public static Logger getLogger() {
        return logger;
    }

    public List<FlyingMashines> getFlyingMashines() {
        return flyingMashines;
    }

    public void setFlyingMashines(List<FlyingMashines> flyingMashines) {
        this.flyingMashines = flyingMashines;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Plane plane : planes) {
            sb.append(plane).append("\n");
        }
        return sb.toString();
    }

    public void add(FlyingMashines flyingMashines) {
        flyingMashines.add(flyingMashines);
    }
}
