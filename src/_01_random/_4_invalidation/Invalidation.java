//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_invalidation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Invalidation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);
		if (randomNumber==3) {
			System.out.println("HUhA u hva nAh braEN");
		}
		System.out.println(randomNumber);
		 if (randomNumber==1) {
			System.out.println("Your parents are funnier than you, they made a joke your age years ago and people are still laughing at it");
		}
		 System.out.println(randomNumber);
			if (randomNumber==2) {
				System.out.println("Get a life!");
			}
			System.out.println(randomNumber);
			if (randomNumber==4) {
				System.out.println("Go touch some grass");
			}
			System.out.println(randomNumber);
			if (randomNumber==0) {
				System.out.println("Your dad left probaly to get milk");
			}
		

		// 1. Use each value of randomNumber to give the user a random compliment.


		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
