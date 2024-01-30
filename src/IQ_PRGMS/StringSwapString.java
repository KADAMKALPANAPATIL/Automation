package IQ_PRGMS;

public class StringSwapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="SPGLOBAL",s2="SOLUTION";
//Concatenate both the string s1 and s2 and store it in s1
s1=s1+s2; //spglobalsolution
//Extract s2 from updateed s1
s2=s1.substring(0,(s1.length()-s2.length()));//spglobal
//Extract s1 from updated s1
s1=s1.substring(s2.length());
System.out.println("after swapping:"+s1+ " "+s2);
	}

}
