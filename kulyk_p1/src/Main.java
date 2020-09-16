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
        char[] datum = data.toCharArray();
        String ones = Integer.toString ((datum[3] + 7 - '0') % 10);
        String tens = Integer.toString ((datum[2] + 7 - '0') % 10);
        String hunds =Integer.toString ((datum[1] + 7 - '0') % 10);
        String thouds=Integer.toString ((datum[0] + 7 - '0') % 10);
        return tens + ones + thouds + hunds;
    }

    public static String decrypt (String data){
        char[] datum = data.toCharArray();
        String ones = Integer.toString (Math.floorMod((datum[3] - 7 - '0'), 10));
        String tens = Integer.toString (Math.floorMod((datum[2] - 7 - '0'), 10));
        String hunds =Integer.toString (Math.floorMod((datum[1] - 7 - '0'), 10));
        String thouds=Integer.toString (Math.floorMod((datum[0] - 7 - '0'), 10));
        return tens + ones + thouds + hunds;
    }
}
