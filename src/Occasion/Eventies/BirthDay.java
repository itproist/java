package Occasion.Eventies;

import Occasion.Event;

public class BirthDay extends Event {
    private String hero;
    private String place;
    private int age;

    public BirthDay(String date, String time, String hero, String place, int age)
    {
        super(date, time);
        this.hero = hero;
        this.place = place;
        this.age = age;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return  "date ='" + super.getDate() + '\'' +
                "time ='" + super.getTime() + '\'' +
                "hero ='" + hero + '\'' +
                "place ='" + place + '\''+
                "age ='" + age + '\'';
    }

}
