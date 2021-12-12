package eu.senla.taskTrain1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

import eu.senla.taskTrain.model.*;
 
public class Starter {

	public static void main(String[] args) throws ParseException {    
        taskTrain rail1 = new taskTrain( 111222, "Минск - Москва", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("11.06.2021 11:15"));
        taskTrain rail2 = new taskTrain( 222333, "Варшава - Гомель", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("23.09.2021 23:10"));
        taskTrain rail3 = new taskTrain( 333444, "грузовой", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("05.03.2021 16:45"));
        taskTrain rail4 = new taskTrain( 444555, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("03.07.2021 09:30"));
        taskTrain rail5 = new taskTrain( 555666, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("16.08.2021 19:59"));
        taskTrain rail6 = new taskTrain( 666777, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("20.10.2021 02:21"));
 
        List<taskTrain> rails = Arrays.asList(rail1, rail2, rail3, rail4, rail5, rail6);
        
        TrainList al = new TrainList();
 
        System.out.println("Cписок рейсов для заданного пункта назначения:");
        List<taskTrain> resultList1 = al.getTrainsByPoint(rails, "Минск - Москва");
        for (taskTrain a : resultList1)
            System.out.println(a.toString());
    }
}
