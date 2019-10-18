package testpackage;


import java.util.HashSet;
import java.util.Set;

public class PermutationPalindrome {

	public static boolean hasPalindromePermutation(String theString) {

		
		// track characters we have seen an odd number of times
		Set<Character> unpairedCharacters = new HashSet<>();

		for (char c : theString.toCharArray()) {
			if (unpairedCharacters.contains(c)) {
				unpairedCharacters.remove(c);
			} else {
				unpairedCharacters.add(c);
			}
		}

		// the string has a palindrome permutation if it
		// has one or zero characters without a pair of characters
		return unpairedCharacters.size() <= 1;
	}



	
	public static void main(String[] args) {
		final boolean result = hasPalindromePermutation("aabcbcd");
		System.out.println(result);
	}
}



