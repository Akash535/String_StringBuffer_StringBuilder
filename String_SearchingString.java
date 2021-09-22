package String;

public class String_SearchingString {

	public static void main(String[] args) {
		System.out.println("*********************indexOf & lastIndexOf**************************");
		String s1="Now is the time for all good man"+"to come to the aid of their country";
		System.out.println(s1);
		System.out.println("\nindexOf(m) = "+s1.indexOf('m'));
		System.out.println("\nlastIndexOf(m) = "+s1.lastIndexOf('m'));
		
		System.out.println("\nindexOf(the) = "+s1.indexOf("the"));
		System.out.println("\nlastIndexOf() = "+s1.lastIndexOf("the"));
		
		System.out.println("\nindexOf(t,10) = "+s1.indexOf('t',10));
		System.out.println("\nlastIndexOf(the,60) = "+s1.lastIndexOf("the",60));
		
		
		System.out.println("**********************subString & subSequence*************************");
		String s2="sea is a c.c is a sea";
		System.out.println(s2);
		System.out.println("\nsubString(5) = "+s2.substring(5));
		System.out.println("\nsubString(5,17) = "+s2.substring(5, 17));
		System.out.println("\nsubSequence(5,17) = "+s2.subSequence(5, 17));
		
		
		System.out.println("*********************Concat * Replace*************************");
		String s3="Akash";
		String s4=" java";
		String s5=" C++";
		System.out.println("concat = "+s3.concat(s4));
		System.out.println("concat = "+s3.concat(s5));
		
		String s6="class is class";
		System.out.println("\n"+s6);
		System.out.println("replace(glass) = "+s6.replace("class", "glass"));
		System.out.println("replaceFirst(glass) = "+s6.replaceFirst("class", "glass"));
		System.out.println("replaceAll(glass) = "+s6.replaceAll("class", "glass"));
		System.out.println("replaceAll(.) = "+s6.replaceAll("class(.)", "glass"));
		System.out.println("replaceAll(.*) = "+s6.replaceAll("class(.*)", "glass"));

		System.out.println("*********************trim * strip************************");
		String st1="  OM SHANTI OM  ";
		System.out.println("original ="+st1);
		System.out.println("trim ="+st1.trim());
		System.out.println("strip ="+st1.strip());
		System.out.println("stripLeading ="+st1.stripLeading());
		System.out.println("stripTrailing ="+st1.stripTrailing());
		
	}

}

/* 
	OutPut :

*********************indexOf & lastIndexOf**************************
Now is the time for all good manto come to the aid of their country

indexOf(m) = 13

lastIndexOf(m) = 37

indexOf(the) = 7

lastIndexOf() = 54

indexOf(t,10) = 11

lastIndexOf(the,60) = 54
**********************subString & subSequence*************************
sea is a c.c is a sea

subString(5) = s a c.c is a sea

subString(5,17) = s a c.c is a

subSequence(5,17) = s a c.c is a
*********************Concat * Replace*************************
concat = Akash java
concat = Akash C++

class is class
replace(glass) = glass is glass
replaceFirst(glass) = glass is class
replaceAll(glass) = glass is glass
replaceAll(.) = glassis class
replaceAll(.*) = glass
*********************trim * strip************************
original =  OM SHANTI OM  
trim =OM SHANTI OM
strip =OM SHANTI OM
stripLeading =OM SHANTI OM  
stripTrailing =  OM SHANTI OM

*/