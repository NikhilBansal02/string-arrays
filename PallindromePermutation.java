/*Palindrome Permutation: Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations: "taco cat'; "atc o eta�; etc.)

SOLUTION
This is a question where it helps to figure out what it means for a string to be a permutation of a palindrome.
This is like asking what the "defining features" of such a string would be.
A palindrome is a string that is the same forwards and backwards. Therefore, to decide if a string is a permutation
of a palindrome, we need to know if it can be written such that it's the same forwards and backwards.
What does it take to be able to write a set of characters the same way forwards and backwards? We need to
have an even number of almost all characters, so that half can be on one side and half can be on the other
side. At most one character (the middle character) can have an odd count.
For example, we know tactcoapapa is a permutation of a palindrome because it has two Ts, four As, two
Cs, two Ps, and one 0. That O would be the center of all possible palindromes.
I To be more precise, strings with even length (after removing all non-letter characters) must have
all even counts of characters. Strings of an odd length must have exactly one character with
an odd count. Of course, an "even" string can't have an odd number of exactly one character,
otherwise it wouldn't be an even-length string (an odd number+ many even numbers= an odd
number). Likewise, a string with odd length can't have all characters with even counts (sum of
evens is even). It's therefore sufficient to say that, to be a permutation ot a palindrome, a string
can have no more than one character that is odd. This will cover both the odd and the even cases.*/

/*Solution
Implementing this algorithm is fairly straightforward. We use a hash table to count how many times each
character appears. Then, we iterate through the hash table and ensure that no more than one character has
an odd count.*/


package arrayandstring;

public class PallindromePermutation {
	
	public static boolean isPallindromePermutation(String str) {
		
		int table[] = buildCharFrequencyTable(str);
		return checkMaxOneOdd(table);
		
	}
	
	public static boolean checkMaxOneOdd(int table[]) {
		
		boolean foundOdd = false;
		
		for(int count : table) {
			if(count%2 == 1) {
				if(foundOdd) {
					return false;
				}
				foundOdd=true;
			}
			
		}
		return true;
	}
	
	public static int getCharNumber(char c) {
		
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val =Character.getNumericValue(c);
		
		if(val>=a && val <=z)
			return val-a;
		
		return -1;
		
	}
	
	public static int[] buildCharFrequencyTable(String str) {
		
		int table[] = new int[26];
		
		for(char c :str.toCharArray() ) {
			int x  = getCharNumber(c);
			
			if(x!= -1) {
				table[x]++;
			}	
		}
		return table;
	}
	
	

	public static void main(String[] args) {
		
		String str = "nikhil  % 7777 khiillnnl";
		System.out.println(isPallindromePermutation(str));
		
	}

}
