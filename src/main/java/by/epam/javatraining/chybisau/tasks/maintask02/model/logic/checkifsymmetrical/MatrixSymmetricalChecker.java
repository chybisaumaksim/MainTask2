package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkifsymmetrical;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
class MatrixSymmetricalChecker {

    static boolean isSymmetrical(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) {
        boolean isSymmetrical = true;
        if (aircraft.length() != aircraft.width()) {
            isSymmetrical = false;
        } else {
            for (int i = 0; i < aircraft.length(); i++) {
                for (int j = 0; j < aircraft.width(); j++) {
                    if (aircraft.getElement(i, j) != aircraft.getElement(j, i)) {
                        isSymmetrical = false;
                        break;
                    }
                }
            }
        }
        return isSymmetrical;
    }
}
