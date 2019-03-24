package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.countmean;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;

import java.util.Arrays;


/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorMean {

    static double countArithmeticalMean(Vector vector) {
        double sum = 0;
        for (int i = 0; i < vector.length(); i++) {
            sum += vector.getElement(i);
        }
        return sum / vector.length();
    }

    static double countGeometricalMean(Vector vector) {
        double sum = 1;
        for (int i = 0; i < vector.length(); i++) {
            sum *= vector.getElement(i);
        }
        return Math.pow(sum, 1.0 / vector.length());
    }
}
