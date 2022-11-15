import java.io.*;

public class break_loop {
	public static void main (String args[]) {
		int j = 0;
		do {
			System.out.println("1	0	1	0	0	1	0	1	1	1	0	1	0	1	1	0	1	0	0	1	0	1	1	1	0	1	0	1");
			j++;
			if (j > 100) {
				break;
			}
		}
		while (true);	
	}
}