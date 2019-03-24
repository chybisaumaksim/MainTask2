package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkorder;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;

import java.util.Arrays;


/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorOrderChecker {

    public static boolean checkAscendingOrder(Vector vector) {
        int count;
        for (count = 0; count < vector.length() - 1; count++) {
            if (vector.getElement(count) > vector.getElement(count + 1)) {
                break;
            }
        }
        return count == vector.length() - 1;
    }

    public static boolean checkDescendingOrder(Vector vector) {
        int count;
        for (count = 0; count < vector.length() - 1; count++) {
            if (vector.getElement(count) < vector.getElement(count + 1)) {
                break;
            }
        }
        return count == vector.length() - 1;
    }
}
