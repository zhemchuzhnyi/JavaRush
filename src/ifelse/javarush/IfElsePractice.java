package ifelse.javarush;

/*
if переводится как «если»,
а else как «иначе».

Человеческим языком это можно записать так:

Если условие истинно, то
   выполнить команда1;
иначе
   выполнить команда2;
 */

public class IfElsePractice {

    public static void main(String[] args) {

        int age = 17;
        if (age < 18)
            System.out.println("Вы еще ребенок");
        else
            System.out.println("Вы уже не ребенок");

        int temperature = 5;
        if (temperature < 0)
            System.out.println("На улице мороз");
        else
            System.out.println("Тепло");

        int age1 = 18;
        if (age1 == 18)
            System.out.println("Явитесь в военкомат");
        else
            System.out.println("Все равно явитесь");

    }
}
