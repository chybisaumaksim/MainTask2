package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findfirstlocalminmaxposition;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class MatrixFirstLocalMinMaxPosition {

    static double findTheFirstLocalMinimumPosition(Matrix matrix) {
        double min = -1;
        if (matrix.length() == 1 && matrix.width() == 1) {
            min = matrix.getElement(0, 0);
        } else {
            for (int i = 1; i < matrix.length() - 1; i++) {
                for (int j = 1; j < matrix.width() - 1; j++) {
                    if (matrix.getElement(i, j) < matrix.getElement(i, j + 1) && matrix.getElement(i, j) < matrix.getElement(i + 1, j)) {
                        min = matrix.getElement(i, j);
                        break;
                    } else if (matrix.getElement(i, j) < matrix.getElement(i, j) && matrix.getElement(i, j) < matrix.getElement(i, j - 1) && matrix.getElement(i, j) < matrix.getElement(i + 1, j)) {
                        min = matrix.getElement(i, j);
                        break;
                    }
                }
            }
        }
        return min;
    }

    static double findTheFirstLocalMaximumPosition(Matrix matrix) {
        double min = -1;
        if (matrix.length() == 1 && matrix.width() == 1) {
            min = matrix.getElement(0, 0);
        } else {
            for (int i = 1; i < matrix.length(); i++) {
                for (int j = 1; j < matrix.width(); j++) {
                    if (matrix.getElement(i, j) > matrix.getElement(i - 1, j) && matrix.getElement(i, j) > matrix.getElement(i, j) && matrix.getElement(i, j) > matrix.getElement(i, j - 1) && matrix.getElement(i, j) > matrix.getElement(i, j + 1)) {
                        min = matrix.getElement(i - 1, j - 1);
                        break;
                    }
                }
            }
        }
        return min;
    }
}
