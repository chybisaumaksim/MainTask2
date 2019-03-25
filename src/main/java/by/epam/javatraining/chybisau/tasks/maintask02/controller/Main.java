package by.epam.javatraining.chybisau.tasks.maintask02.controller;

import by.epam.javatraining.chybisau.tasks.maintask02.model.data.entities.*;
import by.epam.javatraining.chybisau.tasks.maintask02.model.exceptions.PersistException;
import by.epam.javatraining.chybisau.tasks.maintask02.util.Datas;
import by.epam.javatraining.chybisau.tasks.maintask02.view.ConsoleView;
import by.epam.javatraining.chybisau.tasks.maintask02.view.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Maksim Chybisau on 22/03/19.
 *
 * @version 0.0.1
 */

public class Main {

    public static void main(String[] args) throws IOException, PersistException {
        View view = new ConsoleView();
        Boeing737_300 boeing737_300 = new Boeing737_300();
        Boeing737_500 boeing737_500 = new Boeing737_500();
        Boeing737_800 boeing737_800 = new Boeing737_800();

        Datas datas = new Datas();
        Aircraft aircraft = new Aircraft();
//        try {
//        List<String> list = datas.getData("Boeing737_300.txt");
//
//        for (String aList : list) {
//            Aircraft.add(createFactory.create(aList));
//        }
//        } catch (PersistException e) {
//            e.printStackTrace();
//        }

List<Aircraft> allPanes= new ArrayList<Aircraft>();
        allPanes.add(boeing737_300);





//        try {
//            BoingFactory boingFactory=new BoingFactory();
//            boingFactory.get
//
//
//Datas.getData()


//    }
    }
}


