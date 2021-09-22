package StringBuilder;

public class StringBuilder_length_charAt_equals_delete {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder();
		StringBuilder s2=new StringBuilder("hum sath sath hai");
		StringBuilder s3=new StringBuilder("all is well");

		System.out.println("\n*********************length********************");
		System.out.println("sb2 length :"+s2.length());      // $$ 3. sb2.length(); $$
	    System.out.println("sb1 length :"+s1.length());
	    System.out.println("sb4 length :"+s3.length());

		System.out.println("\n*********************charAt********************");
	    System.out.println("sb3 index 3 char :"+s3.charAt(3));   // $$ 4. sb2.charAt(); $$
	    System.out.println("sb2 index 9 char :"+s2.charAt(9));

		System.out.println("\n*********************equals********************");
	    System.out.println("s2 is equal s3 :"+ s2.equals(s3));       // $$ 7. sb2.equals(s3); $$

		System.out.println("\n*********************delete * deleteCharAt*******************");
	    System.out.print("Delete method:\n"+s2+" : ");
	    System.out.println("delete(7,15) = "+s2.delete(7,15));           // $$ 5. sb2.delete(); $$

	    System.out.print("Delete method only char :\n"+s3+" : ");
	    System.out.println("deleteCharAt(4) = "+s3.deleteCharAt(4));        // $$ 6. sb3.deleteCharAt(); $$

	}

}
/* 
 OutPut :


*********************length********************
sb2 length :17
sb1 length :0
sb4 length :11

*********************charAt********************
sb3 index 3 char : 
sb2 index 9 char :s

*********************equals********************
s2 is equal s3 :false

*********************delete * deleteCharAt*******************
Delete method:
hum sath sath hai : delete(7,15) = hum satai
Delete method only char :
all is well : deleteCharAt(4) = all s well

*/