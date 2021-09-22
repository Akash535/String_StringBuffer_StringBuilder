package String;

import java.util.Scanner;
//STRING METHODS :
//length() , isEmpty() , trim() ;
/*public class String_AllMethods {
 public static void main(String[]argu){
     Scanner s=new Scanner(System.in);
     System.out.println("enter name:");
     String s1=s.next();

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("length of string ; "+s1.length());    // $$ 1. s1.length(); $$

     String s2=null;
     int i=s2.length();// Exception is throw
     if(i==0)
         System.out.println("String is empty..");
     
     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("String is empty : "+s1.isEmpty());  // $$ 2. s1.isEmpty(); $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     String n="Akash         Shingade";
     String s3=n.trim();                                   // $$ 3. n.trim(); $$
     System.out.println(s3);
 }
}
*/

//equals() , equalsIgnoreCase() , compareTo() , compareToIgnoreCase() ;
/*public class String_AllMethods {
 public static void main(String[]argu){
     Scanner s=new Scanner(System.in);
     System.out.println("enter the two Strings :");
     String s1=s.next();
     System.out.println("s1 :"+s1);
     String s2=s.next();
     System.out.println("s2 :"+s2);

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("s1 equals to s2 is : "+s1.equals(s2));      // $$ 4. s1.equals(s2); $$
     String s3="shingade";
     System.out.println("s3 :"+s3);
     System.out.println("s3 is equals to blank :" +s3.equals(""));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("s1 equals ingnore case to s2 is : "+s1.equalsIgnoreCase(s2));   // $$ 5. s1.equalsIgnoreCase(s2) $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     String s4="a";
     System.out.println("s4 :"+s4);
     String s5="A";
     System.out.println("s5 :"+s5);
     System.out.println("a compareTo A is :"+s4.compareTo(s5)+" (97-65=32)");    // $$ 6. s4.compareTo(s5); $$
     String s6="";
     System.out.println("s6 :"+s6);
     System.out.println("length of string s2 :"+s2.compareTo(s6));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("s1 compareTo ignore case s2 is :"+s1.compareToIgnoreCase(s2));  // $$ 7. s1.compareToIgnoreCase(s2); $$
 }
}

*/

//concat() , join() , subSequence() , substring() ;
/*public class String_AllMethods {
 public static void main(String[]argu) {
     Scanner s = new Scanner(System.in);
     System.out.println("enter the two Strings :");
     String s1 = s.next();
     System.out.println("s1 :" + s1);
     String s2 = s.next();
     System.out.println("s2 :" + s2);
                                         ////////////////////////////////////////////
     System.out.println("\ns1+s2 :"+s1+s2);
     System.out.println("s1+10 :"+s1+10);
     System.out.println("s1+10+20 :"+s1+10+20);
     System.out.println(10+20+s1);
     System.out.println("s1+10/5 :"+s1+10/5);
     System.out.println("s1+10-5 :error(- is not use)\ns1+10*5 :"+s1+10*5);
     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\ns1 concat with s2 :"+s1.concat(s2));  //$$ 8. s1.concat(s2); $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("s1 join with s2 :"+String.join(";",s1,s2));     // $$ 9. String.join("delimiter",s1,s2); $$
     System.out.println("s1 join with s2 :"+String.join("+",s1,s2));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     String s3="This is demo";
     System.out.println("s3 :"+s3);
     System.out.println("this is demo using  subSequence : "+s3.subSequence(3,9));   // $$ 10. s3.subSequence(beginIndex,endIndex); $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("this is demo using  subString : "+s3.substring(3));   // $$ 11. s3.substring(beginIndex or beginIndex,endIndex); $$
     System.out.println("this is demo using  subString : "+s3.substring(3,7));

 }
}
*/

//replace() , replaceFirst() , replaceAll() ;
/*public class String_AllMethods {
 public static void main(String[]argu) {
     String s1="This is Demo";
     System.out.println("s1 :"+s1);

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nreplace is by was :"+s1.replace("is","was"));   // $$ 12. s1.replace(old,new); $$
     System.out.println("replace s by how :"+s1.replace("s","how"));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nreplaceFirst is by was :"+s1.replaceFirst("is","was"));   // $$ 13. s1.replaceFirst(regex,new); $$
     System.out.println("replaceFirst i by was :"+s1.replaceFirst("i","how"));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nreplaceAll is by was :"+s1.replaceAll("is","was"));    // $$ 14. s1.replaceAll(old ,new); $$
     System.out.println("replaceAll is by was :"+s1.replaceAll("is(.)","was"));
     System.out.println("replaceAll is by was :"+s1.replaceAll("is(.*)","was"));
 }
}
*/

//indexOf() , lastIndexOf() , charAt() , contains() , startsWith() ,endsWith() , toUpperCase() , toLowerCase() , toCharArray() ;
public class String_AllMethods {
 public static void main(String[]argu) {
     String s1="Akash Shingade";
     System.out.println("s1 :"+s1);

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nindex position of s :"+ s1.indexOf('s'));     // $$ 15. s1.inde4xOf('char'); $$
     System.out.println("index position of g :"+ s1.indexOf('g'));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nlast index position of a :"+s1.lastIndexOf('a')); // $$ 16. a1.lastIndexOf('char'); $$
     System.out.println("last index position of S :"+s1.lastIndexOf('S'));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nindex 7 char is :"+s1.charAt(7));     // $$ 17. s1.charAt(index no); $$
     System.out.println("index 13 char is :"+s1.charAt(13));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\n'ga' is pragent in string :"+s1.contains("ga"));  // $$ 18. s1.contains("String") $$
     System.out.println("'mk' is pragent in string :"+s1.contains("mk"));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nStart with S :"+s1.startsWith("S"));  // $$ 19. s1.startsWith(String); $$
     System.out.println("Start with a :"+s1.startsWith("a"));
     System.out.println("Start with A :"+s1.startsWith("A"));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\nEnd with e :"+s1.endsWith("e"));  // $$ 20. s1.endsWith(String); $$
     System.out.println("End with h :"+s1.endsWith("h"));

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\n string Upper case :"+s1.toUpperCase());  // $$ 21. s1.toUpperCase(); $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     System.out.println("\n string Lower case :"+s1.toLowerCase());  // $$ 22. s1.toLowerCase(); $$

     //$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$
     char [] c=s1.toCharArray();
     System.out.println(c);
     System.out.println("char array :"+c);       // $$ 23. s1.charArray(); $$
 }
}

