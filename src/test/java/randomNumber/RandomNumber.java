package randomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.junit.Test;

public class RandomNumber {

	@Test
	public void test() {
		int[] randomNumbers = new int[50];
		Random random = new Random();

		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = random.nextInt(50)+1 ;
		}

		Arrays.sort(randomNumbers);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n for nth smallest number: ");
		int n = scanner.nextInt();

		int nthSmallest = randomNumbers[n-1];

		System.out.println("The " + n + "th smallest number is: " + nthSmallest);
	}
}
