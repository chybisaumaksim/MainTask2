package by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class BoingFactory {

    public BoingFactory() throws PersistException {
        try {
            BoingFactory.getData();
        } catch (PersistException e) {
            throw new PersistException("Ошибка установки подключения", e);
        }
    }

    private static Properties getData() throws PersistException {
        Properties prop = new Properties();
        InputStream is = null;
        try {
            is = BoingFactory.class.getClassLoader()
                    .getResourceAsStream("config.properties");
            prop.load(is);
        }  catch (FileNotFoundException e) {
            throw new PersistException("Файл config.properties не найден.", e);
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
        return prop;
    }

}
