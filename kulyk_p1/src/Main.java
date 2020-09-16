package src;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args){
        // Create a Scanner object
        Scanner keyboard = new Scanner(System.in);
        // Entering a string of four digit integer

    }


        void testEncrypt1234to0189() {
            Encrypter e = new Encrypter();
            assertEquals("0189", e.encrypt("1234"));
    }
}

class Encrypter{
    public static String encrypt (String data){
        int datum = Integer.parseInt(data);
        String ones = Integer.toString ((datum % 10 + 7) % 10);
        String tens = Integer.toString (((datum / 10) % 10 + 7) % 10);
        String hunds =Integer.toString (((datum / 100) % 10 + 7) % 10);
        String thouds=Integer.toString (((datum / 1000) % 10 + 7) % 10);
        return tens + ones + thouds + hunds;
    }
}
