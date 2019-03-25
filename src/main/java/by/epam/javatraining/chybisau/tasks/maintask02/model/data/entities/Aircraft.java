package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;

import java.io.IOException;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */


public class Aircraft {
    Boeing737_300 boeing737_300 = new Boeing737_300();
    Aircraft aircraft = new Aircraft();


    public Aircraft() throws IOException, PersistException {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
//    StringBuilder sb=new StringBuilder();
    public String toString() {
        return "Aircraft{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void add(Boeing737_300 boeing737_300) {

    }
}

