package bool.javarush;

public class BoolTask1 {

    public static void main(String[] args) {

        boolean isOK = true; // isOK -  содержит значение true - истина
        boolean hasError = false; // - hasError - содержит false - ложь

        int age = 70;
        boolean isSenior = (age > 65); // - содержит значение true - истина

        int record = 612;
        int value = 615;
        boolean hasNewRecord = (value > record); // - переменная hasNewRecord - содержит значение true - истина

        int min = 00;
        int max = 100;
        int temperature = -20;
        boolean isIce = (temperature < min); // isIce - содержит истину
        boolean isSteam = (temperature > max); // isSteam - содержит ложь

/*
Использование булевых переменных
От булевых переменных было бы мало толку,
если бы в них можно было только сохранять результаты выражений.
Все дело в том, что их можно еще и использовать.

Где? Да везде, где можно написать логическое выражение.

Например, логическую переменную можно подставить в условие if-а:
 */
        int age1 = 70;
        boolean isSenior1 = (age > 65);
        if (isSenior1)
            System.out.println("Пора на пенсию");
    }
}
