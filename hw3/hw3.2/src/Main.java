import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Конвертер валют");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество рублей: ");
        int rubles = scanner.nextInt();

        if (rubles <= 0) {
            System.out.println("Количество рублей должно быть положительным числом.");
            scanner.close();
            return;
        }

        System.out.println("Введите курс доллара: ");
        double dollarRate = scanner.nextDouble();

        if (dollarRate <= 0) {
            System.out.println("Курс доллара должен быть положительным числом.");
            scanner.close();
            return;
        }

        System.out.println("Введите курс евро: ");
        double euroRate = scanner.nextDouble();

        if (euroRate <= 0) {
            System.out.println("Курс евро должен быть положительным числом.");
            scanner.close();
            return;
        }

        double dollars = rubles / dollarRate;
        double euros = rubles / euroRate;

        System.out.printf("Значение в долларах: %.2f\n", dollars);
        System.out.printf("Значение в евро: %.2f\n", euros);

        scanner.close();

    }
}
