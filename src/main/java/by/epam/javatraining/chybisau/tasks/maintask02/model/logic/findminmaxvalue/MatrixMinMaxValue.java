package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class MatrixMinMaxValue {

    static double findMinValue(Matrix matrix) {
        double min = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = 0; j < matrix.width(); j++) {
                if (matrix.getElement(i, j) < min) {
                    min = matrix.getElement(i, j);
                }
            }
        }
        return min;
    }

    public static double findMaxValue(Matrix matrix) {
        double max = matrix.getElement(0, 0);
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = 0; j < matrix.width(); j++) {
                if (matrix.getElement(i, j) > max) {
                    max = matrix.getElement(i, j);
                }
            }
        }
        return max;
    }
}
