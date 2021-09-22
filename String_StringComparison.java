package String;

public class String_StringComparison {

	static String arr[]= {"jan","Feb","march","april","May","jun","july","Aug","sept","oct","nov","dec"};
	public static void main(String[] args) {
		
		StringBuffer br=new StringBuffer();
		System.out.println(br.capacity());
		
		System.out.println(br.append("ab"));
		System.out.println(br.capacity());
		
		System.out.println(br.append("abcdefghijklmnop"));
		System.out.println(br.capacity());
		
		System.out.println(br.append("abcdefghijklmnopab"));
		System.out.println(br.capacity());
		
		System.out.println(br.append("a"));
		System.out.println(br.capacity());

		
		String s1="Hello";
		String s2="Hello";
		String s3="Good Bey";
		String s4="HELLO";
		
		System.out.println(s1+" equals "+s2+" = "+s1.equals(s2));	// Hello equals Hello = true
		
		System.out.println(s1+" equals "+s3+" = "+s1.equals(s3));	// Hello equals Good Bey = false

		System.out.println(s1+" equals "+s4+" = "+s1.equals(s4));	// Hello equals HELLO = false

		System.out.println(s1+" equals "+s4+" = "+s1.equalsIgnoreCase(s4)); // Hello equals HELLO = true

		String s5="ExceptionHandling";
		System.out.println(s5.startsWith("ex"));
		System.out.println(s5.endsWith("ing"));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].compareTo(arr[i])<0) {
				String t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
				}
			}
			System.out.println(arr[i]);
		}
		
	}

}

/* 
  OutPut :
  
Aug
Feb
May
april
dec
jan
july
jun
march
nov
oct
sept
 */

