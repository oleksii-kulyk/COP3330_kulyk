package src;
import java.util.Scanner;
import static org.junit.Assert.*;

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
        int ones = (datum % 10 + 7) % 10;
        int tens = ((datum / 10) % 10 + 7) % 10;
        int hunds = ((datum / 100) % 10 + 7) % 10;
        int thouds = ((datum / 1000) % 10 + 7) % 10;
        //swapping 1 and 3
        int temp = ones;
        ones = hunds;
        hunds = temp;
        //sawpping 2 and 4
        temp  = tens;
        tens = thouds;
        thouds = temp;
        datum = thouds*1000 + hunds*100 + tens*10 + ones;
        return data = Integer.toString(datum);
    }
}
