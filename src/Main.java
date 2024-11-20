import Occasion.Event;
import Occasion.Events;
import Occasion.SortEvent;

import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print(" 1 - Работа с данными\n 0 - Завершение работы\n");
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    MenuStructure();
                    break;
                }
                case 0: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void MenuStructure() {

        String menu = "Выберите действие:\n" +
                "1 - Заполнить список в ручную\n " +
                "2 - Заполнить список из файла\n" +
                "3 - Записать список в файл\n" +
                "4 - Вывести список\n " +
                "5 - Осортировать список по дате\n " +
                "6 - Осортировать список по времени\n " +
                "7 - Завершить программу\n";

        Scanner in = new Scanner(System.in);

        ArrayList<Event> eventArrayList = new ArrayList<>();

        Events events = new Events(eventArrayList);

        boolean flag = true;

        while (flag) {
            System.out.print(menu);
            int num = in.nextInt();
            switch (num) {
                case 1: {
                    RecordData(events);
                    break;
                }
                case 2: {
                    ReadDataFile(events);
                    events.printArrayEvent();
                    break;
                }
                case 3: {
                    WriteDataFile(events);
                    break;
                }
                case 4: {
                    events.printArrayEvent();
                    break;
                }
                case 5: {
                    SortEvent.sortByDate(events.getEventArrayList());
                    events.printArrayEvent();
                    break;
                }
                case 6: {
                    SortEvent.sortByTime(events.getEventArrayList());
                    events.printArrayEvent();
                    break;
                }
                case 7: {
                    flag = false;
                    break;
                }
            }
        }
    }

    public static void RecordData(Events events) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.print("Введите дату:");
            String date = in.next();
            System.out.print("Введите время:");
            String time = in.next();
            events.addElements(new Event(date, time));
            System.out.print("Ввести еще даты рождения (1 - да / 0 - нет):");
            if (in.nextInt() != 1) {
                flag = false;
            }
        }
    }

    public static void ReadDataFile(Events events) {
        events.clearElements();
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("DateTime.txt")))) {
            String str;
            while ((str = reader.readLine()) != null)
                events.addElements(ParseString(str));
            System.out.print("Успешно выведено!\n");
        } catch (IOException e) {
            System.out.print("Что-то пошло не так\n");
            e.printStackTrace();
        }
    }

    public static void WriteDataFile(Events events) {
        try (FileWriter writer = new FileWriter("DateTime.txt", false)) {
            for (Event event : events.getEventArrayList()) {
                writer.write(event.getDate() + " " + event.getTime());
                writer.append('\n');
            }
            writer.flush();
            System.out.print("Успешно записано\n");
        } catch (IOException ex) {
            System.out.print("Что-то пошло не так\n");
            System.out.println(ex.getMessage());
        }
    }

    public static Event ParseString(String str) {
        String[] arrayData = str.split(" ");
        return new Event(arrayData[0], arrayData[1]);
    }
}