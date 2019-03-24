package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.reverse;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkorder.VectorOrderChecker;

import java.util.Arrays;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class VectorShifter {

    static Vector reverseVector(Vector vector) {
        for (int i = 0; i < vector.length() / 2; i++) {
            double tmp = vector.getElement(i);
            vector.setElement(i, vector.getElement(vector.length() - i - 1));
            vector.setElement(vector.length() - i - 1, tmp);
        }
        return vector;
    }


}
