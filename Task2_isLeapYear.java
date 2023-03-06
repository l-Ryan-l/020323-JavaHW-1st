import java.util.Scanner;

// Task 2: Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Task2_isLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите год для проверки: ");
        int year = sc.nextInt();
        System.out.println("Високосный или нет: " + leapOrNotTest(year));
        sc.close();

    }
    public static Boolean leapOrNotTest(int year) {
        return (year % 4 == 0 & year % 100 != 0) | (year % 400 == 0);

    }

}


