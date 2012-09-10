/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.
 *  Find the largest palindrome made from the product of two 3-digit numbers. Any programming language is acceptable.
 */

public class PalindromeNumber {
	
	/*
	 * This function returns true or false depending on the equality of the string with its reversed value.
	 */
	public static boolean isPalindromeNumber(String s) {
		return s.equals(new StringBuffer(s).reverse().toString());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Intend to go backwards (i.e. from 999 to 100) since we need to find the largest palindrome number.
		for(int i = (999 * 999); i >= (100 * 100); i--) {
			if(isPalindromeNumber(i+"")) {
				//Iff the number is a palindrome, we check if it is a product of 2 3-digit numbers.
				for(int x = 100; x < 1000; x++) {
					for(int y = 100; y < 1000; y++) {
						if(i == (x*y)) {
							System.out.println("Largest Palindrome Number is: " + i);
							return;
						}
					}
				}
			}
		}
	}

}
