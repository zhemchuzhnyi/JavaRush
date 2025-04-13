package ifelse.javarush;

public class IfElseTask4 {

    public static void main(String[] args) {

        int age = 17;
        if (age < 18)
        {
            System.out.println("Ты еще ребенок");
            System.out.println("Не спорь со взрослыми");
        }
        else
        {
            System.out.println("Вы уже взрослый");
            System.out.println("Ну и молодежь пошла");
        }

        int temperature = 5;
        if (temperature < 0)
        {
            System.out.println("На улице мороз");
            System.out.println("Шапку надень");
        }
        else
            System.out.println("Тепло");

        int age1 = 21;
        if (age1 == 18)
            System.out.println("Явитесь в военкомат");
        else
        {
        }
/*
Сокращенная форма оператора if

Иногда бывает, что какую-то команду или команды нужно выполнить,
если условие истинно, а если оно ложное, ничего делать не нужно.

Например, мы можем задать команду Если приехал автобус номер 62, зайти в него,
а на отсутствие автобуса никак не реагировать.

В Java при таком развитии событий мы можем использовать
сокращенную форму оператора if — без блока else.

Другими словами, если команду(ы) нужно выполнять, только если условие истинно и нет команд,
которые нужно выполнять, когда условие ложно,
нужно использовать сокращенную запись оператора if — без блока else. Она имеет вид:

if (условие)
   команда1;

 */

        int age2 = 18;
        if (age2 == 18)
        {
            System.out.println("Явитесь в военкомат");
        }
        else
        {
        }

        int age3 = 18;
        if (age3 == 18)
        {
            System.out.println("Явитесь в военкомат");
        }

        int age4 = 18;
        if (age4 == 18)
            System.out.println("Явитесь в военкомат");


    }
}
