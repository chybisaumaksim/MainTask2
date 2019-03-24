package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class MatrixMinMaxValue {

    static double findMinValue(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) {
        double min = aircraft.getElement(0, 0);
        for (int i = 0; i < aircraft.length(); i++) {
            for (int j = 0; j < aircraft.width(); j++) {
                if (aircraft.getElement(i, j) < min) {
                    min = aircraft.getElement(i, j);
                }
            }
        }
        return min;
    }

    public static double findMaxValue(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) {
        double max = aircraft.getElement(0, 0);
        for (int i = 0; i < aircraft.length(); i++) {
            for (int j = 0; j < aircraft.width(); j++) {
                if (aircraft.getElement(i, j) > max) {
                    max = aircraft.getElement(i, j);
                }
            }
        }
        return max;
    }
}
