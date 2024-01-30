package IQ_PRGMS;

public class stringnamepalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="radar";
StringBuffer a=new StringBuffer(s);
a.reverse();
String rev=a.toString();   //conversion of StringBuffer to string
if(s.equals(rev)) {
	System.out.println("palindrome");
}
else {
	System.out.println("not a palidrome");
}

	}

}




