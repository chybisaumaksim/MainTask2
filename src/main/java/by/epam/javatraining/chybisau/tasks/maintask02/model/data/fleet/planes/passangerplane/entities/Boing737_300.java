package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane.PassangerPlane;
import by.epam.javatraining.chybisau.tasks.maintask02.util.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class Boing737_300 extends PassangerPlane {

    private double passangerCapacity;

    public Boing737_300() throws IOException, PersistException {
        super();
    }

    public Boing737_300(double flightRange, double cruisingSpeed, double fuelConsumption, double passangerCapacity) {
        super(flightRange, cruisingSpeed, fuelConsumption);
        this.passangerCapacity=passangerCapacity;
    }



    @Override
    public double getPassangerCapacity() {
        return passangerCapacity;
    }

    @Override
    public void setPassangerCapacity(double passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Boing737_300)) return false;
        if (!super.equals(o)) return false;

        Boing737_300 that = (Boing737_300) o;

        return Double.compare(that.getPassangerCapacity(), getPassangerCapacity()) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getPassangerCapacity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Boing737_300{" +super.toString()+ " passangerCapacity=" + passangerCapacity + '}';
    }
}


