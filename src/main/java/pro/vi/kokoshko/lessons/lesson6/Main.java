package pro.vi.kokoshko.lessons.lesson6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(11); // Генерує випадкове число від 0 до 10
        int attempts = 3; // Кількість спроб

        System.out.println("Вгадайте число від 0 до 10. У вас є 3 спроби.");

        while (attempts > 0) {
            System.out.print("Ваш варіант: ");
            int userGuess = scanner.nextInt();

            if (userGuess == secretNumber) {
                System.out.println("Ви вгадали!");
                break; // Вихід із циклу, якщо вгадано
            } else {
                System.out.println("Неправильно.");
                attempts--;
                System.out.println("Залишилось спроб: " + attempts);
            }
        }

        if (attempts == 0) {
            System.out.println("Ви вичерпали всі спроби. Загадане число було: " + secretNumber);
        }

        scanner.close();
    }
}
