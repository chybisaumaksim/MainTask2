package by.epam.javatraining.chybisau.tasks.maintask02.util;

import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */
public class DataReceiver {
    private static final Logger logger;

    static {
        logger = Logger.getRootLogger();
    }

    public static List<String> getData(String path) throws PersistException {
        logger.debug("Getting dates from file");
        BufferedReader is = null;
        String i;
        List<String> stringData = new ArrayList<>();
        try {
            is = new BufferedReader(new FileReader(path));
            while ((i = is.readLine()) != null && i.length() > 1) {
                stringData.add(i);
            }
        } catch (FileNotFoundException e) {
            throw new PersistException("File not found", e);
        } catch (IOException e) {
            throw new PersistException("Error while working with fileInputStream", e);
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                System.err.println("Error in closing InputStream" + e.getMessage());
            }
        }
        return stringData;
    }
}
