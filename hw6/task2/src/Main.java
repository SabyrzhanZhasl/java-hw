import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t\t***Программа определения весов товаров***\n\n\n");

        System.out.println("Введите первый вес: ");
        double first = scanner.nextDouble();

        System.out.println("Введите второй вес: ");
        double second = scanner.nextDouble();

        System.out.println("Введите третий вес: ");
        double third = scanner.nextDouble();

        scanner.close();

        double greatest = 0;
        double average = 0;
        double smallest = 0;

        //todo дописать логику программы ниже.

        if (first >= second && first >= third) {
            greatest = first;
        } else if (second >= first && second >= third) {
            greatest = second;
        } else if (third >= first && third >= second) {
            greatest = third;
        }

        if ((first >= second && first <= third) || (first >= third && first <= second)) {
            average = first;
        } else if ((second >= first && second <= third) || (second >= third && second <= first)) {
            average = second;
        } else if ((third >= first && third <= second) || (third >= second && third <= first)) {
            average = third;
        }

        if (first <= second && first <= third) {
            smallest = first;
        } else if (second <= first && second <= third) {
            smallest = second;
        } else if (third <= first && third <= second) {
            smallest = third;
        }

        //todo

        System.out.println("Наибольший вес: " + greatest);
        System.out.println("Средний вес: " + average);
        System.out.println("Наименьший вес: " + smallest);

    }
}
