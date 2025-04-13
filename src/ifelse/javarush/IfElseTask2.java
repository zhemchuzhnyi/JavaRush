package ifelse.javarush;

import java.util.Scanner;

/*
Требования:
•	Программа должна считывать значение температуры c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если температура меньше 0, вывести только сообщение "на улице холодно".
•	Если температура больше либо равна 0, вывести только сообщение "на улице тепло".
 */

public class IfElseTask2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        if (sc.hasNextInt()) {
            int temperature = sc.nextInt();
            if (temperature >= 0) {
                System.out.println(warm);
            } else {
                System.out.println(cold);
            }
        }
    }
}