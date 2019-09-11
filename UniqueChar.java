package arrayandstring;

public class UniqueChar {
	
	public static boolean isUniqueChars(String str) {
		
		if(str.length()>128)
			return false;
		
		boolean arr[] = new boolean[128];
		int val = 0;
		for(int i=0; i<str.length();i++) {
			val = str.charAt(i);
			
			if(arr[val])
				return false;
			
			arr[val] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		
		String str = "abcdef ghij ";
		System.out.println("Is "+str + " is having unique characters: "+ isUniqueChars(str) );

	}

}
