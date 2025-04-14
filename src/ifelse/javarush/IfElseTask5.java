package ifelse.javarush;

public class IfElseTask5 {

    public static void main(String[] args) {

        int temperature = 9;

        if (temperature > 20)
            System.out.println("надеть рубашку");
        else // тут температура меньше (или равна) 20
            if (temperature > 10)
                System.out.println("надеть свитер");
            else // тут температура меньше (или равна) 10
                if (temperature > 0)
                    System.out.println("надеть плащ");
                else // тут температура меньше 0
                    System.out.println("надеть пальто");
    }
}
// Операторы if-else можно вкладывать друг в друга,
// и таким образом реализовывать в программе достаточно сложную логику.

/*
 такую конструкцию программисты записывают немного по-иному:

int temperature = 9;

if (temperature > 20)
   System.out.println("надеть рубашку");
else if (temperature > 10) // тут температура меньше (или равна) 20
   System.out.println("надеть свитер");
else if (temperature > 0) // тут температура меньше (или равна) 10
   System.out.println("надеть плащ");
else // тут температура меньше 0
   System.out.println("надеть пальто");

 */

//Важный момент:
//Если в конструкции if-else не расставлены фигурные скобки,
// else относится к предыдущему (ближайшему к нему) if-у.
/*
int age = 65;

if (age < 60)
   if (age > 20)
      System.out.println("Надо работать");
else
   System.out.println("Можно не работать");
 */
