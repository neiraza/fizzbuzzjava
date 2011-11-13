package jp.co.blacksheep.java;

public class FizzBuzz1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * １から１００数える ３で割りきれる → Fizz ５で割りきれる → Buzz ３と５で割りきれる → FizzBuzz
		 */
		for (int i = 1; i <= 100; i++) {
			System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz"
				: i % 5 == 0 ? "Buzz" : i);
		}
	}
}
