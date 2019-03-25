package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Boeing737_800 extends Boing737 {
    private double MaximumTakeOffWeight;
    private double CruisingSpeed;
    private double HourlyFuelConsumption;
    private double numberOfSeatsEconomy;
    private double numberOfSeatsBusinessAndEconomy;

    public Boeing737_800() throws IOException, PersistException {
    }
}
