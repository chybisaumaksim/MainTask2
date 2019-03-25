package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Boeing737_300 extends Boing737 {

    private double MaximumTakeOffWeight;
    private double CruisingSpeed;
    private double HourlyFuelConsumption;
    private double numberOfSeatsEconomy;
    private double numberOfSeatsBusinessAndEconomy;

    public Boeing737_300(double maximumTakeOffWeight, double cruisingSpeed, double hourlyFuelConsumption, double numberOfSeatsEconomy, double numberOfSeatsBusinessAndEconomy) throws IOException, PersistException {
        MaximumTakeOffWeight = maximumTakeOffWeight;
        CruisingSpeed = cruisingSpeed;
        HourlyFuelConsumption = hourlyFuelConsumption;
        this.numberOfSeatsEconomy = numberOfSeatsEconomy;
        this.numberOfSeatsBusinessAndEconomy = numberOfSeatsBusinessAndEconomy;
    }

    public Boeing737_300() throws IOException, PersistException {

    }

    public double getMaximumTakeOffWeight() {
        return MaximumTakeOffWeight;
    }

    public void setMaximumTakeOffWeight(double maximumTakeOffWeight) {
        MaximumTakeOffWeight = maximumTakeOffWeight;
    }

    public double getCruisingSpeed() {
        return CruisingSpeed;
    }

    public void setCruisingSpeed(double cruisingSpeed) {
        CruisingSpeed = cruisingSpeed;
    }

    public double getHourlyFuelConsumption() {
        return HourlyFuelConsumption;
    }

    public void setHourlyFuelConsumption(double hourlyFuelConsumption) {
        HourlyFuelConsumption = hourlyFuelConsumption;
    }

    public double getNumberOfSeatsEconomy() {
        return numberOfSeatsEconomy;
    }

    public void setNumberOfSeatsEconomy(double numberOfSeatsEconomy) {
        this.numberOfSeatsEconomy = numberOfSeatsEconomy;
    }

    public double getNumberOfSeatsBusinessAndEconomy() {
        return numberOfSeatsBusinessAndEconomy;
    }

    public void setNumberOfSeatsBusinessAndEconomy(double numberOfSeatsBusinessAndEconomy) {
        this.numberOfSeatsBusinessAndEconomy = numberOfSeatsBusinessAndEconomy;
    }

    @Override
    public String toString() {
        return "Boeing737_300{" + "MaximumTakeOffWeight=" + MaximumTakeOffWeight + ", CruisingSpeed=" + CruisingSpeed + ", HourlyFuelConsumption=" + HourlyFuelConsumption + ", numberOfSeatsEconomy=" + numberOfSeatsEconomy + ", numberOfSeatsBusinessAndEconomy=" + numberOfSeatsBusinessAndEconomy + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Boeing737_300 that = (Boeing737_300) o;
        return Double.compare(that.MaximumTakeOffWeight, MaximumTakeOffWeight) == 0 && Double.compare(that.CruisingSpeed, CruisingSpeed) == 0 && Double.compare(that.HourlyFuelConsumption, HourlyFuelConsumption) == 0 && Double.compare(that.numberOfSeatsEconomy, numberOfSeatsEconomy) == 0 && Double.compare(that.numberOfSeatsBusinessAndEconomy, numberOfSeatsBusinessAndEconomy) == 0;
    }
}
