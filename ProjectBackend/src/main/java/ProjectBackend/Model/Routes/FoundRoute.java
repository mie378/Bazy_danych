package ProjectBackend.Model.Routes;

import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Time;
@Document("foundRoutes")
public class FoundRoute {
    private String firstStation;
    private String lastStation;
    private Time departureTime;
    private Time arrivalTime;

    public FoundRoute(String firstStation, String lastStation, Time departureTime, Time arrivalTime) {
        this.firstStation = firstStation;
        this.lastStation = lastStation;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getFirstStation() {
        return firstStation;
    }

    public void setFirstStation(String firstStation) {
        this.firstStation = firstStation;
    }

    public String getLastStation() {
        return lastStation;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = lastStation;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
}
