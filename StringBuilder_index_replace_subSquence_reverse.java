package StringBuilder;

//indexOf(char) ; lastIndexOf() ; lastIndexOf() ; replace() ; replace() ; subSequence() ;
public class StringBuilder_index_replace_subSquence_reverse {
public static void main(String []argu){
   StringBuilder sb1=new StringBuilder("Akash Shingade");
   System.out.println("sb1 :"+sb1);

   System.out.println("\n*********************indexOf********************");
   System.out.println("index position of i :"+ sb1.indexOf("i"));    // $$ 8. s1.indexOf(char); $$
   System.out.println("index position of a :"+ sb1.indexOf("a"));

	System.out.println("\n*********************lastIndexOf********************");
   System.out.println("last index position of a :"+ sb1.lastIndexOf("a"));   // $$ 9. s1.lastIndexOf(char); $$
   System.out.println("last index position of H :"+ sb1.lastIndexOf("H"));

	System.out.println("\n*********************insert********************");
   System.out.println("insert hhh in sb1 :"+sb1.insert(5,"hhh"));   // $$ 10. s1.lastIndexOf(indexno,str); $$
   System.out.println("insert ZZZ in sb1 :"+sb1.insert(12,"ZZZ"));

	System.out.println("\n*********************replace********************");
   StringBuilder sb2=new StringBuilder("Computer Engg.");
   System.out.println("sb2 :"+sb2);
   System.out.println("replace of zzz in sb2 :"+sb2.replace(3,10,"zzz"));     // $$ 11. s2.replace(start,end,str); $$

	System.out.println("\n*********************subSequence********************");
   StringBuilder sb3=new StringBuilder("Akash Shingade");
   System.out.println("sb3 :"+sb3);
   System.out.println("subSequence of sb3 :"+sb3.subSequence(2,9));    // $$ 12. s3.subSequence(start,end); $$

	System.out.println("\n*********************reverse********************");
   System.out.println("revers String  sb3 :"+sb3.reverse());   // $$ 13. s3.replace(); $$

}
}

/*
	OutPut :

sb1 :Akash Shingade

*********************indexOf********************
index position of i :8
index position of a :2

*********************lastIndexOf********************
last index position of a :11
last index position of H :-1

*********************insert********************
insert hhh in sb1 :Akashhhh Shingade
insert ZZZ in sb1 :Akashhhh ShiZZZngade

*********************replace********************
sb2 :Computer Engg.
replace of zzz in sb2 :Comzzzngg.

*********************subSequence********************
sb3 :Akash Shingade
subSequence of sb3 :ash Shi

*********************reverse********************
revers String  sb3 :edagnihS hsakA

*/
