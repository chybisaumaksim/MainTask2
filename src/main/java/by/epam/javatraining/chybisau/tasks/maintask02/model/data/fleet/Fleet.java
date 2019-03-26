package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet;

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
        logger =  Logger.getRootLogger();
    }
    private List<Plane> planes;

    public Fleet() {
        planes = new ArrayList<>();
    }

    public void add(Plane plane) {
        planes.add(plane);
    }

    public List<Plane> getPlanes() {
        return planes;
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
}
