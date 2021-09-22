package StringBuffer;

//capacity() ; append() ; length() ; charAt() ; delete() ; deleteCharAt() ; equals();
public class StringBuffer_capacity_append {
 public static void main(String []argu){
     StringBuffer sb1=new StringBuffer();
	 System.out.println("*********************Strings********************");
     System.out.println("sb1 :"+sb1);
     StringBuffer sb2=new StringBuffer("Akash");
     System.out.println("sb2 :"+sb2);
     StringBuffer sb3=new StringBuffer("Akash");
     System.out.println("sb3 :"+sb3);
     StringBuffer sb4=new StringBuffer("Shingade");
     System.out.println("sb4 :"+sb4);

	System.out.println("*********************capacity********************");
     System.out.println("\nsb1 capacity :"+sb1.capacity());      // $$ s1.capacity(); $$
     System.out.println("sb2 capacity :"+sb2.capacity());
     System.out.println("sb4 capacity :"+sb4.capacity());

	System.out.println("*********************append********************");
     sb2.append("HelloWorld");          // $$ 2. sb1.append(); $$
     System.out.println("\nsb2 :"+sb2);
     System.out.println("sb2. append capacity :"+sb2.capacity());
     sb2.append("Computer");
     System.out.println("\nsb2 :"+sb2);
     System.out.println("sb2. append capacity :"+sb2.capacity());

     
 }
}


/* 
  OutPut :
  
*********************Strings********************
sb1 :
sb2 :Akash
sb3 :Akash
sb4 :Shingade
*********************capacity********************

sb1 capacity :16
sb2 capacity :21
sb4 capacity :24
*********************append********************

sb2 :AkashHelloWorld
sb2. append capacity :21

sb2 :AkashHelloWorldComputer
sb2. append capacity :44

 */

