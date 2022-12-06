package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {

    private String destination;
    private int flightNumber;
    private String typeOfAircraft;
    private Date timeOfDeparture;
    private int dayOfWeek;

    public Airline(String destination, int flightNumber, String typeOfAircraft, Date time, int dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.typeOfAircraft = typeOfAircraft;
        timeOfDeparture = time;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void seFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAircraft() {
        return typeOfAircraft;
    }

    public void setTypeOfAircraft(String typeOfAircraft) {
        this.typeOfAircraft = typeOfAircraft;
    }

    public Date getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String time) throws ParseException {
        this.timeOfDeparture = new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(time); // "23.09.2015 11:15"
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void seDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Airline{");
        sb.append("destination=").append(destination);
        sb.append(", flightNumber=").append(flightNumber);
        sb.append(", typeOfAircraft=").append(typeOfAircraft);
        sb.append(", timeOfDeparture=").append(timeOfDeparture);
        sb.append(", dayOfWeek=").append(dayOfWeek);
        sb.append('}');
        return sb.toString();
    }

}