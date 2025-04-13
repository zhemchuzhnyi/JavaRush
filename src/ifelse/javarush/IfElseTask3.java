package ifelse.javarush;

import java.util.Scanner;

/*
Требования:
Программа должна считывать данные с клавиатуры два раза.
Программа должна использовать команду System.out.println() или System.out.print().
Если возраст в пределах 18-28 (включительно), то вывести только сообщение "Имя, явитесь в военкомат".
Если возраст не находится в указанных пределах, то ничего выводить не нужно.
 */

public class IfElseTask3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String militaryCommissar = ", явитесь в военкомат";
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        if (age >= 18)
            if (age <= 28) {
                System.out.println(name + militaryCommissar);
            }
        }
    }