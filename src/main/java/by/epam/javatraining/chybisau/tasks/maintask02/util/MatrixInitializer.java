package by.epam.javatraining.chybisau.tasks.maintask01.util;

import java.util.Random;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class MatrixInitializer {

    public static double[][] initializeMatrix(int boundMatrix, int matrixLength, int matrixWidth) {
        if (matrixLength >= 0 && matrixWidth >= 0) {
            Random random = new Random();
            double[][] matrix = new double[ matrixLength ][ matrixWidth ];
            for (int i = 0; i < matrixLength; i++) {
                for (int j = 0; j < matrixWidth; j++) {
                    matrix[ i ][ j ] = random.nextInt(boundMatrix) + 1;
                }
            }
            return matrix;
        } else {
            return null;
        }
    }
}
