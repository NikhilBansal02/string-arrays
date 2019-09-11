//Given two strings, write a method to decide if one is a permutation of the other.

package arrayandstring;

public class StringPermutation {
	
	public static String sort(String str) {
		
		char ch[] = str.toCharArray();
		java.util.Arrays.sort(ch);
		return new String(ch);
		
	}
	
	public static boolean checkPermutation(String s , String t) {
		
		if(s.length() != t.length())
			return false;
		
		return sort(s).equals(sort(t));
	
	}

	public static void main(String[] args) {
		
		System.out.println(checkPermutation("nikhil","nikhil"));
		System.out.println(checkPermutation("nikhil","Nikhil"));
		System.out.println(checkPermutation("nikhil","nikhil "));
		System.out.println(checkPermutation("nikhil","khilin"));
		System.out.println(checkPermutation("abcdef","cdefab"));
	}

}
