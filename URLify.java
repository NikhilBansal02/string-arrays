/*Write a method to replace all spaces in a string with '%20'. You may assume that the string
has sufficient space at the end to hold the additional characters, and that you are given the "true"
length of the string. (Note: if implementing in Java, please use a character array so that you can
perform this operation in place.) 
This converts all spaces to %20*/


package arrayandstring;

public class URLify {
	
	public static void replaceSpaceChars(String str) {
		
		char ch[] = str.toCharArray();
		int size  = str.length();
		
		//System.out.println(size);
		
		int count = numberOfSpaceChar(str);
		int newsize = (size-count) + count*3;
		
		//System.out.println(newsize);
		
		char newCh[] = new char[newsize];
		
		for(int i=0,j=0; i<size;i++,j++) {
			
			if(ch[i]==' ') {
				newCh[j] = '%';
				newCh[++j] = '2';
				newCh[++j] = '0';
			}
			else
			newCh[j] = ch[i];
		}
		System.out.println(new String(newCh));
	}
	
	public static int numberOfSpaceChar(String str1) {
		char ch[] = str1.toCharArray();
		int count = 0 ;
		
		for (int i = 0; i< str1.length();i++)
			if(ch[i]==' ')
				count++;
		//System.out.println(count);
		return count;
	}

	public static void main(String[] args) {
		replaceSpaceChars(" abcd ef  ");

	}

}
