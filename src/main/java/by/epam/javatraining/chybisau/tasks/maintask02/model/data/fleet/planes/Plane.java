package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class Plane extends FlyingMashines {
//    private static final Logger logger;
//
//    static {
//        logger =  Logger.getLogger(Main.class);
//    }

    private String name;
    private double flightRange;
    private double cruisingSpeed;
    private double fuelConsumption;
    private  List<Plane> planes;

    public Plane(String name, double flightRange, double cruisingSpeed, double fuelConsumption) {
        this.name = name;
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public Plane() {
        planes = new ArrayList<>();
    }

    public void add(FlyingMashines flyingMashines) {
        planes.add((Plane)flyingMashines);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public void setFlightRange(double flightRange) {
        this.flightRange = flightRange;
    }

    public double getCruisingSpeed() {
        return cruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        this.cruisingSpeed = cruisingSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;

        Plane plane = (Plane) o;

        if (Double.compare(plane.getFlightRange(), getFlightRange()) != 0) return false;
        if (Double.compare(plane.getCruisingSpeed(), getCruisingSpeed()) != 0) return false;
        if (Double.compare(plane.getFuelConsumption(), getFuelConsumption()) != 0) return false;
        return getName().equals(plane.getName());
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getName().hashCode();
        temp = Double.doubleToLongBits(getFlightRange());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCruisingSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFuelConsumption());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" + "name='" + name + '\'' + ", flightRange=" + flightRange + ", cruisingSpeed=" + cruisingSpeed + ", fuelConsumption=" + fuelConsumption + '}';
    }
}

