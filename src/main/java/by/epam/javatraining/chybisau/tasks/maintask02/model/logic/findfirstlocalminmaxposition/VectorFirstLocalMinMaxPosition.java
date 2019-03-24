package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findfirstlocalminmaxposition;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorFirstLocalMinMaxPosition {

    static int findTheFirstLocalMinimumPosition(Vector vector) {
        int result = -1;
        int index = 0;
        if (vector.length() == 1) {
            result = index;
        } else if (vector.getElement(index) < vector.getElement(index + 1)) {
            result = index;
        } else {
            for (int i = 1; i < vector.length() - 1; i++) {
                if (vector.getElement(i) < vector.getElement(i + 1) && vector.getElement(i) < vector.getElement(i - 1)) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    static int findTheFirstLocalMaximumPosition(Vector vector) {
        int res = -1;
        int index = 0;
        if (vector.length() == 1) {
            res = index;
        } else if (vector.getElement(index) > vector.getElement(index + 1)) {
            res = index;
        } else {
            for (int i = 1; i < vector.length() - 1; i++) {
                if (vector.getElement(i) > vector.getElement(i + 1) && vector.getElement(i) > vector.getElement(i - 1)) {
                    res = i;
                    break;
                }
            }
        }
        return res;
    }
}
