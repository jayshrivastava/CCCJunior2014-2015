package ccc2016jr;

import java.util.*;

public class JuniorThree2015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		String word = scan.nextLine();
		String letter = "";
		String vowels = "aeiou";
		String alphabet = "abcdegfhijklmnopqrstuvwxyz";
		String newWord = "";

		String closestConsonant = "1";
		String closestVowelBefore = "1";
		String closestVowelAfter = "1";

		int distanceCounterAfter = 0;
		int distanceCounterBefore = 0;

		while (word.length() > 0) {

			letter = word.substring(0, 1);
			closestVowelAfter = letter;
			closestVowelBefore = letter;
			 closestConsonant = letter;

			if (vowels.indexOf(letter) > -1) {
				newWord = newWord + letter;
			} else {

				newWord = newWord + letter;

				// closest vowel

				if (alphabet.indexOf(letter) >= 21) {

					newWord = newWord + "u";
				}

				else {
					
				 
					while (vowels.indexOf(closestVowelAfter) < 0) {
						closestVowelAfter = alphabet.substring(alphabet.indexOf(closestVowelAfter) + 1,
								alphabet.indexOf(closestVowelAfter) + 2);
						distanceCounterAfter++;
						
					}

					while (vowels.indexOf(closestVowelBefore) < 0) {
						closestVowelBefore = alphabet.substring(alphabet.indexOf(closestVowelBefore) - 1,
								alphabet.indexOf(closestVowelBefore));
						distanceCounterBefore++;
						//System.out.println(closestVowelBefore);
					}
					
					if (distanceCounterAfter == distanceCounterBefore){
						
						newWord = newWord + closestVowelBefore;
						
					} else if  (distanceCounterAfter < distanceCounterBefore){
						
						newWord = newWord + closestVowelAfter; 
						
					} else if (distanceCounterAfter > distanceCounterBefore){
						
						newWord = newWord + closestVowelBefore;
					}

				}
				// while (vowels.indexOf(closestVowelAfter) < 0) {

				// closestVowelAfter =
				// alphabet.substring(alphabet.indexOf(letter) + 1,
				// alphabet.indexOf(letter) + 2);

				// }

				// following closestConsonant

				closestConsonant = "";

				if (letter != "z") {

					closestConsonant = alphabet.substring(alphabet.indexOf(letter) + 1, alphabet.indexOf(letter) + 2);

					if (vowels.indexOf(closestConsonant) < 0) {
						newWord = newWord + closestConsonant;
					} else {
						closestConsonant = alphabet.substring(alphabet.indexOf(closestConsonant) + 1,
								alphabet.indexOf(closestConsonant) + 2);
						newWord = newWord + closestConsonant;

					}

				} else {
					newWord = newWord + letter;

				}

			}
			word = word.substring(1, word.length());
			closestVowelAfter = "1";
			closestVowelBefore = "1";
			closestConsonant = "1";
			distanceCounterAfter = 0;
			distanceCounterBefore =0; 

		}

		System.out.println(newWord);

		scan.close();

	}

}
