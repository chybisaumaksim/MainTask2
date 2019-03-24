package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.transpose;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */

class MatrixTransposition {

    static by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft transposeMatrix(by.epam.javatraining.chybisau.tasks.maintask01.model.data.Aircraft aircraft) throws Exception {
        for (int i = 0; i < aircraft.length(); i++) {
            for (int j = i + 1; j < aircraft.width(); j++) {
                if (aircraft.length() != aircraft.width()) {
                    throw new Exception("Aircraft is not square");
                }
                double temp = aircraft.getElement(i, j);
                aircraft.setElement(i, j, aircraft.getElement(j, i));
                aircraft.setElement(j, i, temp);
            }
        }
        return aircraft;
    }
}
