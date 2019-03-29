package by.epam.javatraining.chybisau.tasks.maintask02.model.data.fleet;


/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public abstract class FlyingMashines {

    private double cargoCapacity;
    private double passangerCapacity;
    private double flightRange;
    private double cruisingSpeed;
    private double fuelConsumption;
    private boolean needOfRunway;


    public FlyingMashines(double cargoCapacity, double passangerCapacity, double flightRange, double cruisingSpeed, double fuelConsumption) {
        this.cargoCapacity = cargoCapacity;
        this.passangerCapacity = passangerCapacity;
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public FlyingMashines(double passangerCapacity, double flightRange, double cruisingSpeed, double fuelConsumption) {
        this.passangerCapacity = passangerCapacity;
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public FlyingMashines(double flightRange) {
        this.flightRange = flightRange;
    }

    public FlyingMashines(boolean needOfRunway) {
        this.needOfRunway = needOfRunway;
    }

    public FlyingMashines(double cargoCapacity, double passangerCapacity, double flightRange, double cruisingSpeed, double fuelConsumption, boolean needOfRunway) {
        this.cargoCapacity = cargoCapacity;
        this.passangerCapacity = passangerCapacity;
        this.flightRange = flightRange;
        this.cruisingSpeed = cruisingSpeed;
        this.fuelConsumption = fuelConsumption;
        this.needOfRunway = needOfRunway;
    }

    public FlyingMashines() {
    }


}
