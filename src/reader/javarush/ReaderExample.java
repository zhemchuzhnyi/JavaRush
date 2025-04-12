package reader.javarush;

import java.io.IOException;

public class ReaderExample {

    public static void main(String[] args) throws IOException {

        while (true) {
            int x = System.in.read();
            System.out.println(x);
        }
    }
}
