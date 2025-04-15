package bool.javarush;

/*

<	Меньше	a < 10
>	Больше	b > a
<=	Меньше либо равно	a <= 10
>=	Больше либо равно	speed >= max
==	Равно	age == 18
!=	Не равно	time != 0

 */


// ЗАДАЧА

import java.util.Scanner;

/*
Ввести с клавиатуры три целых числа.
Определить, есть ли среди них хотя бы одна пара равных между собой чисел.

Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
a) при вводе чисел 1 2 2 получим вывод 2 2

b) при вводе чисел 2 2 2 получим вывод 2 2 2

Требования:
•	Программа должна считывать три числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести их на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
 */
public class BoolTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем три целых числа с клавиатуры
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Проверяем условия равенства чисел
        if (a == b && b == c) {
            // Если все три числа равны, выводим их все
            System.out.println(a + " " + b + " " + c);

        } else if (a == b) {
            // Если первое и второе числа равны, выводим их
            System.out.println(a + " " + b);

        } else if (a == c) {
            // Если первое и третье числа равны, выводим их
            System.out.println(a + " " + c);

        } else if (b == c) {
            // Если второе и третье числа равны, выводим их
            System.out.println(b + " " + c);
        }

        // Если ни одна пара не равна, ничего не выводим
    }
}

// Еще можно вот так

/*
Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 == number2) {
            if (number1 == number3) {
                System.out.println(number1 + " " + number2 + " " + number3);
            } else {
                System.out.println(number1 + " " + number2);
            }
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}
 */