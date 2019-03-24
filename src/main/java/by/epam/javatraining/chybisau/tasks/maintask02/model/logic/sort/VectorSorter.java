package by.epam.javatraining.chybisau.tasks.maintask01.model.logic.sort;

import by.epam.javatraining.chybisau.tasks.maintask01.model.data.Vector;


/**
 * Created by Maksim Chybisau on 09/03/19.
 * Changed by Maksim Chybisau on 18/03/19.
 *
 * @version 0.0.3
 */

public class VectorSorter {

    static Vector bubbleSortOfVector(Vector vector) {
        int n = vector.length();
        double temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (vector.getElement(j - 1)> vector.getElement(j)) {
                    temp = vector.getElement(j - 1);
                    vector.setElement(j - 1, vector.getElement(j));
                    vector.setElement(j,temp);
                }
            }
        }
        return vector;
    }

    static Vector mergeSortOfVector(Vector vector) {
        return mergeSortOfVector(vector, 0, vector.length() - 1);
    }

    private static Vector mergeSortOfVector(Vector vector, int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            mergeSortOfVector(vector, begin, middle);
            mergeSortOfVector(vector, middle + 1, end);
            merge(vector, begin, middle, end);
        }
        return vector;
    }

    private static void merge(Vector vector, int begin, int middle, int end) {
        double[] newVector = new double[ vector.length() ];
        int mid = middle + 1;
        int beg = begin;
        for (int i = beg; i <= end; i++) {
            if (begin <= middle && mid <= end) {
                if (vector.getElement(begin) <= vector.getElement(mid)) {
                    newVector[ i ] = vector.getElement(begin);
                    begin++;
                } else if (vector.getElement(mid) <= vector.getElement(begin)) {
                    newVector[ i ] = vector.getElement(mid);
                    mid++;
                }
            } else if (begin > middle) {
                newVector[ i ] = vector.getElement(mid);
                mid++;
            } else if (mid >= end) {
                newVector[ i ] = vector.getElement(begin);
                begin++;
            }
        }
        for (int i = beg; i <= end; i++) {
            vector.setElement(i, newVector[ i ]);
        }
    }

}
