package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.search;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;
import by.epam.javatraining.chybisau.tasks.maintask01.model.logic.checkorder.VectorOrderChecker;

import java.util.Arrays;

/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 23/03/19.
 *
 * @version 0.0.4
 */
public class VectorElementSearcher {

    static int linearSearch(double number, Vector vector) {
        int i;
        for (i = 0; i < vector.length(); i++) {
            if (vector.getElement(i) == number) {
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(double number, Vector vector) {
        int i = -1;
        if (VectorOrderChecker.checkAscendingOrder(vector)) {
            double[] sortedVector = Arrays.copyOf(vector.toArray(), vector.length());
            int low = 0;
            int high = sortedVector.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (number == sortedVector[ mid ]) {
                    i = mid;
                    break;
                } else {
                    if (number < sortedVector[ mid ]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        } else if (VectorOrderChecker.checkDescendingOrder(vector)) {
            double[] sortedVector = Arrays.copyOf(vector.toArray(), vector.length());
//            Arrays.sort(sortedVector);
            int low = 0;
            int high = sortedVector.length;
            int mid;
            while (low < high) {
                mid = (low + high) / 2;
                if (number == sortedVector[ mid ]) {
                    i = mid;
                    break;
                } else {
                    if (number > sortedVector[ mid ]) {
                        high = mid;
                    } else {
                        low = mid + 1;
                    }
                }
            }
        }
//        else {
//            if(checkAscendingOrder(vector)) {
//                double[] sortedVector = Arrays.copyOf(vector, vector.matrixLength);
//            Arrays.sort(sortedVector);
//                int low = 0;
//                int high = sortedVector.matrixLength;
//                int mid;
//                while (low < high) {
//                    mid = (low + high) / 2;
//                    if (number == sortedVector[ mid ]) {
//                        i = mid;
//                        break;
//                    } else {
//                        if (number < sortedVector[ mid ]) {
//                            high = mid;
//                        } else {
//                            low = mid + 1;
//                        }
//                    }
//                }
//        }
        return i;
    }

}
