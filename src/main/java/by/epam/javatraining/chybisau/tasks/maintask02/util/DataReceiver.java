package by.epam.javatraining.chybisau.tasks.maintask02.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class DataReceiver {

    static List<String> getData(String path) throws PersistException{
        BufferedReader is = null;
        String i;
        List<String> list = new ArrayList<>();
        try {
            is = new BufferedReader(new FileReader(path));
            while ((i = is.readLine()) != null) {
                list.add(i);
            }
        } catch (FileNotFoundException e) {
            throw new PersistException("Файл не найден.", e);
        } catch (IOException e) {
            throw new PersistException("Ошибка при работе с потоком fileInputStream", e);
        }  finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                System.err.println("Ошибка закрытия потока InputStream" + e.getMessage());
            }
        }
        return list;
    }
}
