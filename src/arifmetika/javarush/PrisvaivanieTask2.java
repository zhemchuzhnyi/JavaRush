package arifmetika.javarush;

public class PrisvaivanieTask2 {
    public static void main(String[] args) {

        int x = 999;
        int y = 33;
        int z = 256;

        x = y = z;

        System.out.println(x);

        /*
        Запомнить: присваивание осуществляется справа налево.
        Данное выражение (x = y = z) будет выполнено по шагам:

        y = z , то есть у = 256
        x = y, то есть x = 256
         */
    }
}
