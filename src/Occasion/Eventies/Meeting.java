package Occasion.Eventies;

import Occasion.Event;

public class Meeting extends Event {
    private String person;
    private String place;

    public Meeting (String date, String time, String person, String place){
        super(date, time);
        this.person = person;
        this.place = place;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString(){
        return  "person ='" + person + '\'' +
                "place ='" + place + '\'';
    }

}
