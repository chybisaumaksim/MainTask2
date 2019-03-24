package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkifsymmetrical;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
class MatrixSymmetricalChecker {

    static boolean isSymmetrical(Matrix matrix) {
        boolean isSymmetrical = true;
        if (matrix.length() != matrix.width()) {
            isSymmetrical = false;
        } else {
            for (int i = 0; i < matrix.length(); i++) {
                for (int j = 0; j < matrix.width(); j++) {
                    if (matrix.getElement(i, j) != matrix.getElement(j, i)) {
                        isSymmetrical = false;
                        break;
                    }
                }
            }
        }
        return isSymmetrical;
    }
}
