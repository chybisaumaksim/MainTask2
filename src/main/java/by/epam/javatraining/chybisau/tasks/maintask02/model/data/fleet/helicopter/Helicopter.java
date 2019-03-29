package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.helicopter;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.FlyingMashines;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Helicopter extends FlyingMashines {

    private String name;
    private double flightRange;
    private double cruisingSpeed;
    private double fuelConsumption;
    private boolean needOfRunway;
    private List<FlyingMashines> helicopters;

    public Helicopter(String name, double flightRange, double cruisingSpeed, double fuelConsumption, boolean needOfRunway) {
        this.name = name;
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
        this.needOfRunway = needOfRunway;
        helicopters = new ArrayList<>();
    }

    public Helicopter() {
        helicopters = new ArrayList<>();
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

    public boolean isNeedOfRunway() {
        return needOfRunway;
    }

    public void setNeedOfRunway(boolean needOfRunway) {
        this.needOfRunway = needOfRunway;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Helicopter)) return false;

        Helicopter that = (Helicopter) o;

        if (Double.compare(that.getFlightRange(), getFlightRange()) != 0) return false;
        if (Double.compare(that.getCruisingSpeed(), getCruisingSpeed()) != 0) return false;
        if (Double.compare(that.getFuelConsumption(), getFuelConsumption()) != 0) return false;
        if (isNeedOfRunway() != that.isNeedOfRunway()) return false;
        return getName().equals(that.getName());
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
        result = 31 * result + (isNeedOfRunway() ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Helicopter{" + "name='" + name + '\'' + ", flightRange=" + flightRange + ", cruisingSpeed=" + cruisingSpeed + ", fuelConsumption=" + fuelConsumption + ", needOfRunway=" + needOfRunway + '}';
    }

    public void add(FlyingMashines helicopter) {
        helicopters.add(helicopter);
    }
}
