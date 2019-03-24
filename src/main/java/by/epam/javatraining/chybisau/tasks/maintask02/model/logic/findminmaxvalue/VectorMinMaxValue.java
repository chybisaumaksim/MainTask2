package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findminmaxvalue;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorMinMaxValue {

        static double findMinValue(Vector vector) {
            double min = vector.getElement(0);
            for (int i = 1; i < vector.length(); i++) {
                if (vector.getElement(i) < min) {
                    min = vector.getElement(i);
                }
            }
            return min;
        }

        public static double findMaxValue(Vector vector) {
            double max = vector.getElement(0);
            for (int i = 1; i < vector.length(); i++) {
                if (vector.getElement(i) > max) {
                    max = vector.getElement(i);
                }
            }
            return max;
        }
}
