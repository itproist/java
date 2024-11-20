package Occasion;

import java.util.ArrayList;

public class SortEvent {
    public static void sortByDate(ArrayList<Event> list) {
        list.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
    }
    public static void sortByTime(ArrayList<Event> list) {
        list.sort((o1, o2)  -> o2.getTime().compareTo(o1.getTime()));
    }
}


