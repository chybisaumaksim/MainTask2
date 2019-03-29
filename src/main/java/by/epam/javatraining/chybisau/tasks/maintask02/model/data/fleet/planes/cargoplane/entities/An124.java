//package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.entities;
//
//import by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet.planes.cargoplane.CargoPlane;
//import by.epam.javatraining.chybisau.tasks.maintask02.util.PersistException;
//
//import java.io.IOException;
//
///**
// * Created by Maksim Chybisau on 22/03/19.
// *
// * @version 0.0.1
// */
//public class An124 extends CargoPlane {
//
//    private double cargoCapacity;
//
//    public An124(double cargoCapacity) throws IOException, PersistException {
//        this.cargoCapacity = cargoCapacity;
//    }
//
//    public An124(double flightRange, double cruisingSpeed, double fuelConsumption, double cargoCapacity) {
//        super(flightRange, cruisingSpeed, fuelConsumption);
//        this.cargoCapacity = cargoCapacity;
//    }
//
//    public An124() throws IOException, PersistException {
//        super();
//    }
//
//    @Override
//    public double getCargoCapacity() {
//        return cargoCapacity;
//    }
//
//    @Override
//    public void setCargoCapacity(double cargoCapacity) {
//        this.cargoCapacity = cargoCapacity;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof An124)) return false;
//        if (!super.equals(o)) return false;
//
//        An124 that = (An124) o;
//
//        return Double.compare(that.getCargoCapacity(), getCargoCapacity()) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = super.hashCode();
//        long temp;
//        temp = Double.doubleToLongBits(getCargoCapacity());
//        result = 31 * result + (int) (temp ^ (temp >>> 32));
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "An124{" + super.toString() + "cargoCapacity= " + cargoCapacity + '}';
//    }
//}
