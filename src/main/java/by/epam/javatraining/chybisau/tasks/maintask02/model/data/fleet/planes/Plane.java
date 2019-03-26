package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes;
import by.epam.javatraining.chybisau.tasks.maintask02.controller.Main;
import org.apache.log4j.Logger;
/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class Plane {
    private static final Logger logger;

    static {
        logger =  Logger.getLogger(Main.class);
    }


    private double flightRange;
    private double cruisingSpeed;
    private double fuelConsumption;

    public Plane() {
    }

    public Plane(double flightRange, double cruisingSpeed, double fuelConsumption) {
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
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
        return Double.compare(plane.getFlightRange(), getFlightRange()) == 0 && Double.compare(plane.getCruisingSpeed(), getCruisingSpeed()) == 0 && Double.compare(plane.getFuelConsumption(), getFuelConsumption()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getFlightRange());
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCruisingSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getFuelConsumption());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "flightRange=" + flightRange + ", cruisingSpeed=" + cruisingSpeed + ", fuelConsumption=" + fuelConsumption;
    }
}

