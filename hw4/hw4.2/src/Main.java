import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор, который может все (ну или почти все)");
        System.out.println("Вы можете посчитать сумму (1) / разность (2) / частное (3) чисел");
        System.out.println("Введите число в соответствий с тем, какую операцию хотите выполнить: ");
        int action = scanner.nextInt();

        System.out.println("Введите первое число: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Введите второе число: ");
        double secondNumber = scanner.nextDouble();

        System.out.println(calculator(action, firstNumber, secondNumber));

    }

    public static double calculator(int action, double firstNumber, double secondNumber) {
        double resultValue = 0;
        if (action == 1) {
            resultValue = firstNumber + secondNumber;
        } else if (action == 2) {
            resultValue = firstNumber - secondNumber;
        } else if (action == 3) {
            resultValue = firstNumber / secondNumber;
        }
        return resultValue;
    }
}
