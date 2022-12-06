package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class task2 {
    public static void main(String[] args) throws ParseException {
        Airline air1 = new Airline("Пункт А", 111222, "грузовой", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("11.06.2015 11:15"), 5);
        Airline air2 = new Airline("Пункт Б", 222333, "грузовой", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("23.09.2015 23:10"), 4);
        Airline air3 = new Airline("Пункт С", 333444, "грузовой", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("05.03.2015 16:45"), 3);
        Airline air4 = new Airline("Пункт А", 444555, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("03.07.2015 09:30"), 2);
        Airline air5 = new Airline("Пункт Б", 555666, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("16.08.2015 19:59"), 3);
        Airline air6 = new Airline("Пункт С", 666777, "пассажирский", new SimpleDateFormat("dd.MM.yyyy HH:mm").parse("20.10.2015 02:21"), 1);

        List<Airline> airs = Arrays.asList(air1, air2, air3, air4, air5, air6);

        AirlineList al = new AirlineList();

        System.out.println("список рейсов для заданного пункта назначения:");
        List<Airline> resultList1 = al.getAircraftsByDestination(airs, "Пункт А");
        for (Airline a : resultList1)
            System.out.println(a.toString());

        System.out.println("\nсписок рейсов для заданного дня недели:");
        List<Airline> resultList2 = al.getAircraftsByDay(airs, 3);
        for (Airline a : resultList2)
            System.out.println(a.toString());

        System.out.println("\nсписок рейсов для заданного дня недели, время вылета для которых больше заданного:");
        List<Airline> resultList3 = al.getAircraftsByDayAndAfterDate(airs, 3, "11.11.2014 00:00");
        for (Airline a : resultList3)
            System.out.println(a.toString());
    }
}