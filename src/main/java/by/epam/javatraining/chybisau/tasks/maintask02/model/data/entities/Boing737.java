package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;

import java.io.IOException;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Boing737 extends Boing implements Comparable<Boing737> {
    double MaximumTakeOffWeight;
    double FlightRange;
    double CruisingSpeed;
    double MaximumFlightHeight;
    double HourlyFuelConsumption;
    double SpecificFuelConsumption;
    double numberOfSeatsEconomy;
    double numberOfSeatsBusinessAndEconomy;

    private List<Boeing737_300> boeing737_300;
    private List<Boeing737_500> boeing737_500;
    private List<Boeing737_800> boeing737_800;


    public Boing737() throws IOException, PersistException {
    }

    public Boing737(double maximumTakeOffWeight, double flightRange, double cruisingSpeed, double maximumFlightHeight, double hourlyFuelConsumption, double specificFuelConsumption, double numberOfSeatsEconomy, double numberOfSeatsBusinessAndEconomy) throws IOException, PersistException {
        MaximumTakeOffWeight = maximumTakeOffWeight;
        FlightRange = flightRange;
        CruisingSpeed = cruisingSpeed;
        MaximumFlightHeight = maximumFlightHeight;
        HourlyFuelConsumption = hourlyFuelConsumption;
        SpecificFuelConsumption = specificFuelConsumption;
        this.numberOfSeatsEconomy = numberOfSeatsEconomy;
        this.numberOfSeatsBusinessAndEconomy = numberOfSeatsBusinessAndEconomy;
    }

    public double getMaximumTakeOffWeight() {
        return MaximumTakeOffWeight;
    }

    public void setMaximumTakeOffWeight(double maximumTakeOffWeight) {
        MaximumTakeOffWeight = maximumTakeOffWeight;
    }


}


