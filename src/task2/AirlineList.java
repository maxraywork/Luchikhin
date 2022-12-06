package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlineList {
    public List<Airline> getAircraftsByDestination(List<Airline> airs, String dest){
        List<Airline> result = new ArrayList<>();
        for(Airline air : airs){
            if (air.getDestination().equals(dest))
                result.add(air);
        }
        return result;
    }

    public List<Airline> getAircraftsByDay(List<Airline> airs, int day){
        List<Airline> result = new ArrayList<>();
        for(Airline air : airs){
            if (air.getDayOfWeek() == day)
                result.add(air);
        }
        return result;
    }

    public List<Airline> getAircraftsByDayAndAfterDate(List<Airline> airs, int day, String data) throws ParseException{
        List<Airline> result = new ArrayList<>();
        Date date = new SimpleDateFormat( "dd.MM.yyyy HH:mm" ).parse( data );
        for(Airline air : airs){
            if ((air.getDayOfWeek() == day) && (air.getTimeOfDeparture().after(date)))
                result.add(air);
        }
        return result;
    }
}