import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class durges {
    public static void main (String args[]) throws Throwable {
        //import file
        File file = new File("C:\\Users\\dominic_the_genius\\OneDrive\\Desktop\\JAVA ART\\mfr.txt");

        //make scanner object
        Scanner sc = new Scanner (file);

        while (sc.hasNextLine()) {
            String mfr = sc.nextLine();
            System.out.println(mfr);
            Thread.sleep(200);
        }
    }
}