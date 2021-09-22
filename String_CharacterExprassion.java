package String;

public class String_CharacterExprassion {

	public static void main(String[] args) {
		char c="How are you ?".charAt(5);
		System.out.println(c);	// r
		
		String s1="This is demo of the getChar method";
		int start=10;
		int end=21;
		char c1[]=new char[end-start];
		s1.getChars(start, end, c1, 0);
		System.out.println(c1);	// mo of the g
	}

}
