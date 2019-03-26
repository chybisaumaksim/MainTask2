package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;
import by.epam.javatraining.chybisau.tasks.maintask02.util.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class CargoPlane extends Plane {

    private double cargoCapacity;

    public CargoPlane() throws IOException, PersistException {
    }

    public CargoPlane(double flightRange, double cruisingSpeed, double fuelConsumption) {
        super(flightRange, cruisingSpeed, fuelConsumption);
        this.cargoCapacity = cargoCapacity;

    }

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane)) return false;
        if (!super.equals(o)) return false;

        CargoPlane that = (CargoPlane) o;

        return Double.compare(that.getCargoCapacity(), getCargoCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getCargoCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

