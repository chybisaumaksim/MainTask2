package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter.Helicopter;
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
    private List<FlyingMashines> flyingMashine;
    private List<Helicopter> helicopters;

    public Fleet() {
        flyingMashine = new ArrayList<>();
        helicopters = new ArrayList<>();
        planes = new ArrayList<>();
    }

    public List<FlyingMashines> getFlyingMashine() {
        return flyingMashine;
    }

    public void setFlyingMashine(List<FlyingMashines> flyingMashine) {
        this.flyingMashine = flyingMashine;
    }

    public List<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void setHelicopters(List<Helicopter> helicopters) {
        this.helicopters = helicopters;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public List<FlyingMashines> getFlyingMashines() {
        return flyingMashine;
    }

    public void setPlanes(List<Plane> planes) {
        this.planes = planes;
    }

    public void add(FlyingMashines flyingMashines) {
        flyingMashine.add(flyingMashines);
        if (flyingMashines instanceof Plane) {
            planes.add((Plane) flyingMashines);
        }
        if (flyingMashines instanceof Helicopter) {
            helicopters.add((Helicopter) flyingMashines);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (FlyingMashines fm : flyingMashine) {
            sb.append(fm).append("\n");
        }
        return sb.toString();
    }
}
