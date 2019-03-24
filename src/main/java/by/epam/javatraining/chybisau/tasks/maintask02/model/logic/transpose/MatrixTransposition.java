package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.transpose;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Matrix;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

class MatrixTransposition {

    static Matrix transposeMatrix(Matrix matrix) throws Exception {
        for (int i = 0; i < matrix.length(); i++) {
            for (int j = i + 1; j < matrix.width(); j++) {
                if (matrix.length() != matrix.width()) {
                    throw new Exception("Matrix is not square");
                }
                double temp = matrix.getElement(i, j);
                matrix.setElement(i, j, matrix.getElement(j, i));
                matrix.setElement(j, i, temp);
            }
        }
        return matrix;
    }
}
