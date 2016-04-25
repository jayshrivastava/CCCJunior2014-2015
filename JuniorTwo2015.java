package ccc2016jr;

//import java.io.File;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class JuniorTwo2015 {

	public static void main(String[] args) {// throws FileNotFoundException {
		// TODO Auto-generated method stub

		// File file = new File("myfilename.txt");
		// Scanner scan = new Scanner(file);
		Scanner scan = new Scanner(System.in);

		// String message = scan.nextLine ();
		String message = scan.nextLine();
		String happy = ":-)";
		String sad = ":-(";

		int happyCounter = 0;
		int sadCounter = 0;

		//System.out.println(message.indexOf(happy));
		//System.out.println(message.indexOf(sad));

		while (message.indexOf(happy) > -1 && message.indexOf(sad) > -1) {

			if (message.indexOf(happy) < message.indexOf(sad)) {

				message = message.substring(message.indexOf(happy) + 3, message.length());
				//System.out.println(message);
				happyCounter++;
			} else {

				message = message.substring(message.indexOf(sad) + 3, message.length());
				//System.out.println(message);
				sadCounter++;

			}

		}

		while (message.indexOf(happy) > -1 || message.indexOf(sad) > -1) {

			if (message.indexOf(happy) == -1) {

				message = message.substring(message.indexOf(sad) + 3, message.length());
				//System.out.println(message);
				sadCounter++;
			} else {
				message = message.substring(message.indexOf(happy) + 3, message.length());
				//System.out.println(message);
				happyCounter++;
			}

		}
		
		//System.out.println(happyCounter + " and " + sadCounter );

		if ((happyCounter == sadCounter) && happyCounter != 0)		{
			System.out.println("unsure");
		} else if ((happyCounter == sadCounter) && happyCounter == 0)	{
			System.out.println("none");

		} else if (happyCounter < sadCounter)		{
			System.out.println("sad");
		} else if (happyCounter > sadCounter)		{
			System.out.println("happy");
		}

		scan.close();
	}
}
