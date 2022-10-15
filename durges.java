import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class durges {
    public static void main (String args[]) throws Throwable {
        //import file
        File file = new File(C:\Users\dominic_the_genius\OneDrive\Desktop\JAVA ART\img1.png);

        //make scanner object
        Scanner sc = new Scanner (file);

        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            System.out.println(s);
            Thread.sleep(200);
        }
    }
}
