package pro.vi.kokoshko.lessons.lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Car;
        int shut = 100;
        for (int i = 1; i <=shut; i++) {
            if (i == 4 || i == 9) {
                continue;
            }
            System.out.println("Number shuttle: " + i);
        }
        System.out.println("Sum shuttle: " + shut);

    }

}