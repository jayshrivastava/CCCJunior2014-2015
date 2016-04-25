package ccc2016jr;

//import java.util.Scanner;
import java.io.*;

public class JuniorFour2015 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// Scanner scan = new Scanner (System.in);
		BufferedReader in = new BufferedReader(new FileReader("input.txt"));

		String letter = "";
		int friendNum = 0;
		int friendCount = 0;
		int time = -1;

		// int inputSize = scan.nextInt();
		String inputSizeStr =  in.readLine();
		int inputSize = Integer.parseInt(inputSizeStr);
		
		System.out.println(inputSize);

		String[][] friendInfo = new String[2][inputSize];

		for (int i = 0; i < inputSize; i++) {
			// String line = scan.nextLine();
			String line = in.readLine();
			friendInfo[0][i] = line.substring(0, 1);
			friendInfo[1][i] = line.substring(2);

		}

		
		
		for (int i = 0; i < inputSize; i++) {

			System.out.println(friendInfo[0][i] + friendInfo[1][i]);

		}

		// scan.close ();
		in.close();
	}

}
