package ccc2016jr;

import java.util.Scanner;

public class JuniorFive2015 {

	public static int howManyWays(int pieces, int people, int slice) {

		slice = pieces / people;
		if (pieces == 1 || pieces == people) {
			return 1;
		} else if (pieces < people) {
			return 0;
		}

		if (slice < 1) {
			return 1 + howManyWays(pieces - slice, people, slice);
		}

		return 1 + howManyWays(pieces - 1, people, slice);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int Pieces = scan.nextInt();
		int People = scan.nextInt();

		System.out.println(howManyWays(Pieces, People, 1));
		scan.close();
	}

}
