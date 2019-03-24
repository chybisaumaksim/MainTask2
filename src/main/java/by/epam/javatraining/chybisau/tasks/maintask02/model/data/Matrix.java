package by.epam.javatraining.chybisau.tasks.maintask01.model.data;

import by.epam.javatraining.chybisau.tasks.maintask01.util.MatrixCreator;
import by.epam.javatraining.chybisau.tasks.maintask01.util.MatrixInitializer;

import java.util.Arrays;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class Matrix {

    double[][] matrix;

    public Matrix(int boundMatrix, int matrixLength, int matrixWidth) {
        matrix = MatrixCreator.createMatrix(matrixLength, matrixWidth);
        matrix = MatrixInitializer.initializeMatrix(boundMatrix, matrixLength, matrixWidth);
    }

    //constructor for tests
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public double getElement(int indexOfRow, int indexOfColumn) {
        return matrix[ indexOfRow ][ indexOfColumn ];
    }

    public void setElement(int indexOfRow, int indexOfColumn, double value) {
        matrix[ indexOfRow ][ indexOfColumn ] = value;
    }

    public int length() {
        return matrix.length;
    }

    public int width() {
        return matrix[ 0 ].length;
    }

    @Override
    public boolean equals(Object o) {
        return o.equals(matrix);
    }

    @Override
    public String toString() {
        return "Matrix : " + Arrays.deepToString(matrix);
    }
}

