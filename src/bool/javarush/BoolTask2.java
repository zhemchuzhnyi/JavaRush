package bool.javarush;

/*
Программа считывает с клавиатуры значение температуры тела и выдает сообщение о том,
что температура тела высокая, низкая или нормальная, в зависимости от условий.

В классе объявлены две булевые переменные isHigh (высокая температура) и isLow (низкая),
в которые нужно вынести соответствующие условия и вместо выражений сравнения использовать эти переменные.

Требования:
•	Программа должна считывать значение температуры c клавиатуры.
•	Не изменяй объявление переменных isHigh и isLow.
•	Переменным isHigh и isLow в методе main должны быть присвоены соответствующие выражения сравнения.
•	Вместо выражений сравнения в операторах if () должны быть использованы переменные isHigh и isLow.
•	Функционал программы не должен измениться.
 */

import java.util.Scanner;

public class BoolTask2 {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHigh) {
            System.out.println("температура тела высокая");
        } else if (isLow) {
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
