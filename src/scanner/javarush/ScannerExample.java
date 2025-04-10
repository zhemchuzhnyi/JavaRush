package scanner.javarush;

import java.util.Scanner;

public class ScannerExample { // Переименован класс, чтобы избежать конфликта имен

    public static void main(String[] args) {

        // Создаем объект Scanner для чтения из строки
        Scanner scanner = new Scanner("Люблю тебя, Петра творенье,\n" +
                "Люблю твой строгий, стройный вид,\n" +
                "Невы державное теченье,\n" +
                "Береговой ее гранит");

        // Читаем первую строку
        String s = scanner.nextLine();
        System.out.println(s);

        // Закрываем сканер (хорошая практика)
        scanner.close();
    }
}