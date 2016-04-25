package ccc2016jr;

import java.util.Scanner;

public class JuniorFive2014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STILL OUTPUTS WRONG GUY LIKE BRUH

		Scanner scan = new Scanner(System.in);

		int students = scan.nextInt();
		String line = "";
		String status = "good";
		int Space = 0;
		String[][] studentArr = new String[students + 1][2];

		/*
		 * for (int j = 0; j < 2; j++) { line = scan.next(); for (int i = 1; i <
		 * students + 1; i++) {
		 * 
		 * Space = line.indexOf(" ");
		 * 
		 * if (Space > 1) {
		 * 
		 * studentArr[i][j] = line.substring(0, Space - 1);
		 * 
		 * line = line.substring(Space + 1);
		 * 
		 * } else { studentArr[i][j] = line; }
		 * 
		 * }
		 * 
		 * }
		 */

		for (int j = 0; j < 2; j++) {

			for (int i = 1; i < students + 1; i++) {

				studentArr[i][j] = scan.next();

			}
		}

		for (int i = 1; i < students + 1; i++) {

			System.out.println(studentArr[i][0]);
			System.out.println(studentArr[students + 1 - i][1]);

			if (studentArr[i][0] != studentArr[students + 1 - i][1]) {

				status = "bad";
			}

		}

		System.out.println(status);
		scan.close();

	}

}
