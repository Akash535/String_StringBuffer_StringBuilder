package String;

public class String_ChangingCase_Joining {

	public static void main(String[] args) {
		String s1="Aur is Dil mein kya Rakha hai...";
		System.out.println("s1 = "+s1);
		System.out.println("LowerCase = "+s1.toLowerCase());
		System.out.println("UpperCase = "+s1.toUpperCase());
		
		String s2="Tera hi dard Chhupa Rakha hai...";
		System.out.println("\ns2 = "+s2);
		
		System.out.println("join = "+s1.join("-->",s1,s2));
	}

}
