package by.epam.javatraining.chybisau.tasks.maintask01.util;

import java.util.Random;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorInitializer {

    public static double[] initializeVector(int numberOfElements, int bound) {
        if (numberOfElements >= 0) {
            Random random = new Random();
            double[] vector = new double[ numberOfElements ];
            for (int i = 0; i < vector.length; i++) {
                vector[ i ] = random.nextInt(bound) + 1;
            }
            return vector;
        } else{
            return null;
        }
    }
}
