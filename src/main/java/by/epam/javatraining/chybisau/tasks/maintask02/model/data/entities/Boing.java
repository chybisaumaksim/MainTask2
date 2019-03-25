package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class Boing extends Aircraft{
    String placementOfCorporation = "USA";

    public Boing() throws IOException, PersistException {
    }
}
