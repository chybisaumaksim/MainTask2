package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.util.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class An225 extends CargoPlane {

    private double cargoCapacity;

    public An225(double cargoCapacity) throws IOException, PersistException {
        this.cargoCapacity = cargoCapacity;
    }

    public An225() throws IOException, PersistException {
        super();
    }

    public An225(double flightRange, double cruisingSpeed, double fuelConsumption, double cargoCapacity) {
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
        if (!(o instanceof An225)) return false;

        An225 an225 = (An225) o;

        return Double.compare(an225.getCargoCapacity(), getCargoCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(getCargoCapacity());
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "An225{"
                + super.toString() + "cargoCapacity= " + cargoCapacity + '}';
    }
}
