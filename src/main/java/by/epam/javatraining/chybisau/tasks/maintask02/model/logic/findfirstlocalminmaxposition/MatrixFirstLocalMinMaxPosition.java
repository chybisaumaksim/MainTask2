package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.findfirstlocalminmaxposition;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

public class MatrixFirstLocalMinMaxPosition {

    static double findTheFirstLocalMinimumPosition(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) {
        double min = -1;
        if (aircraft.length() == 1 && aircraft.width() == 1) {
            min = aircraft.getElement(0, 0);
        } else {
            for (int i = 1; i < aircraft.length() - 1; i++) {
                for (int j = 1; j < aircraft.width() - 1; j++) {
                    if (aircraft.getElement(i, j) < aircraft.getElement(i, j + 1) && aircraft.getElement(i, j) < aircraft.getElement(i + 1, j)) {
                        min = aircraft.getElement(i, j);
                        break;
                    } else if (aircraft.getElement(i, j) < aircraft.getElement(i, j) && aircraft.getElement(i, j) < aircraft.getElement(i, j - 1) && aircraft.getElement(i, j) < aircraft.getElement(i + 1, j)) {
                        min = aircraft.getElement(i, j);
                        break;
                    }
                }
            }
        }
        return min;
    }

    static double findTheFirstLocalMaximumPosition(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) {
        double min = -1;
        if (aircraft.length() == 1 && aircraft.width() == 1) {
            min = aircraft.getElement(0, 0);
        } else {
            for (int i = 1; i < aircraft.length(); i++) {
                for (int j = 1; j < aircraft.width(); j++) {
                    if (aircraft.getElement(i, j) > aircraft.getElement(i - 1, j) && aircraft.getElement(i, j) > aircraft.getElement(i, j) && aircraft.getElement(i, j) > aircraft.getElement(i, j - 1) && aircraft.getElement(i, j) > aircraft.getElement(i, j + 1)) {
                        min = aircraft.getElement(i - 1, j - 1);
                        break;
                    }
                }
            }
        }
        return min;
    }
}
