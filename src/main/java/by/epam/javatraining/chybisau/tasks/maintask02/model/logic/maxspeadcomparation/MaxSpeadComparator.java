package by.epam.javatraining.chybisau.tasks.maintask02.model.logic.maxspeadcomparation;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities.Boing737;

import java.util.Comparator;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class MaxSpeadComparator implements Comparator<Boing737> {

    public int compare(Boing737 e1, Boing737 e2) {
        if (e1.getMaximumTakeOffWeight() < e2.getMaximumTakeOffWeight()) {
            return 1;
        } else {
            return -1;
        }
    }
}
