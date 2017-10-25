 /**
 * 
 */
package algorithms;

import java.util.Scanner;

/**
 * This class contains a linear congruential generator for generating
 * a list of pseudo random numbers
 * @author Richard
 *
 */
public class RandomNumberGenerator {

	/**
	 * This method contains a linear congruential generator for generating
         * a list of pseudo random numbers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//set initial parameters to those of Numerical Recipes 
		//(https://en.wikipedia.org/wiki/Linear_congruential_generator)
		int a = 1664525;
		int c = 1013904223;
		long m =(long) Math.pow(2, 32);
		//Initialise seed as system time in milliseconds to always produce a new set of numbers
		long seed = System.currentTimeMillis();
		System.out.println("How many Random numbers would you like?");
		int number = scanner.nextInt();
		//apply formula to seed for each new number
		for (int i = 0; i <= number;i++) {
			seed = ((a*seed)+c) % m;
			System.out.println(seed);
		}
		scanner.close();
	}

}
