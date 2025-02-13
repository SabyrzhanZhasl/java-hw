import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа для преобразования температуры из Цельсии в Фарингейты");

        double tempCelsius = scanner.nextDouble();

        double coefficient = 1.8;
        int tempOffset = 32;

        double tempFahrenheit = tempCelsius * coefficient + tempOffset;

        System.out.println("Температура в Фарингейтах: " + tempFahrenheit);

    }
}
