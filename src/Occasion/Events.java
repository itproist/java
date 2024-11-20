package Occasion;

import java.util.*;

public class Events {

    private ArrayList<Event> eventArrayList;

    public Events(ArrayList<Event> eventArrayList){
        this.eventArrayList = eventArrayList;
    }

    public void addElements(Event event){
        eventArrayList.add(event);
    }

    public  void clearElements() {
        eventArrayList.clear();
    }

    public void printArrayEvent(){
        for(Event event : eventArrayList)
            System.out.printf("Date: '" + event.getDate() + "', Time: '" + event.getTime() + "'\n");
    }

    public ArrayList<Event> getEventArrayList() {
        return eventArrayList;
    }

    public void setEventArrayList(ArrayList<Event> eventArrayList) {
        this.eventArrayList = eventArrayList;
    }
}


