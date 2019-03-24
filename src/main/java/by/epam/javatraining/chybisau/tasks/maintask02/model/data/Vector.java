package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import by.epam.javatraining.chybisau.tasks.maintask01.util.VectorCreator;
import by.epam.javatraining.chybisau.tasks.maintask01.util.VectorInitializer;

import java.util.Arrays;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class Vector {
    double[] vector;

    public Vector(int numberOfElements, int bound) {
        vector = VectorCreator.createVector(numberOfElements);
        vector = VectorInitializer.initializeVector(numberOfElements, bound);
    }

    public Vector(double[] vector, int numberOfElements) {
        this.vector = new double[ numberOfElements ];
    }

    public Vector() {
    }

    public Vector(double[] vector) {
        this.vector = vector;
    }

    public int length() {
        return vector.length;
    }

    public double getElement(int index) {
        return vector[ index ];
    }

    public void setElement(int index, double value) {
        vector[ index ] = value;
    }

    public double[] toArray() {
        return vector;
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(vector);
    }

    @Override
    public String toString() {
        return "Vector : " + Arrays.toString(vector);
    }
}