package String;

public class String1 {

	public static void main(String[] args) {
		
		char a[]= {'a','b','c','d','e','f'};
		String s1=new String(a);
		System.out.println(s1);	//abcdef
		
		String s2=new String(a,2,3);
		System.out.println(s2);	//cde
		
		char ascii[]= {65,66,68,69,72,88,102,111,120,};
		String s3=new String(ascii);
		System.out.println(s3);	// ABDEHXfox
		
		System.out.println(s3.length()); // 9
		System.out.println("Hello Akash".length()); // 11
		
		String age="9";
		String s="He is "+age+" years old.";
		System.out.println(s);	// He is 9 years old.
		
		String s4="four : "+2+2;
		System.out.println(s4); // four : 22
		
		String s5="four : "+(2+2);
		System.out.println(s5); // four : 4
		
		
		
	}

}
