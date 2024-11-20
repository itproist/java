package Model;

import java.util.Scanner;

public class Model1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Contact contact = new Contact(
                1,
                "Maxim",
                "Sklyanin",
                "Nizhniy Novgorod",
                "+7 (987)) 745 94 66",
                "-"
        );

        System.out.println(contact);

        in.close();
    }
}