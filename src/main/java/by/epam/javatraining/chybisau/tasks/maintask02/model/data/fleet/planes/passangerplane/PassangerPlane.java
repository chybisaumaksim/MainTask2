package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.passangerplane;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.Plane;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class PassangerPlane extends Plane {

    private double passangerCapacity;

    public PassangerPlane() {
    }

    public PassangerPlane(String name, double flightRange, double cruisingSpeed, double fuelConsumption) {
        super(name, flightRange, cruisingSpeed, fuelConsumption);
    }

    public PassangerPlane(String name, double flightRange, double cruisingSpeed, double fuelConsumption, double passangerCapacity) {
        super(name, flightRange, cruisingSpeed, fuelConsumption);
        this.passangerCapacity=passangerCapacity;
    }

    public double getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(double passangerCapacity) {
        this.passangerCapacity = passangerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassangerPlane)) return false;
        if (!super.equals(o)) return false;

        PassangerPlane that = (PassangerPlane) o;

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
        return super.toString();
    }
}
