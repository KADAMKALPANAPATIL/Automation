package java_progrms;

public class String_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//find the length of characters
		String s=new String("hydrabad");
		String ss=new String("secundrabad");
		System.out.println(s.length());
		//toUppercase
		String s1=new String("kalpanapatil");
		System.out.println(s1.toUpperCase());
		// using charAt method
		String s2=new String("patil");
		String ss2=new String("kalpana");
		System.out.println(s2.charAt(0));
		//using substring method
		String ab=new String("kalpana");
		String ba= new String("kadam");
		System.out.println(ab.substring(2,3));
		//using append method for join together 
		StringBuffer s3=new StringBuffer("patil_");
		StringBuffer ss3=new StringBuffer("kalpana");
		System.out.println(s3.append(ss3));
		System.out.println(ss3);
		//given values are equal or not using equals method
		String a=new String("tamilnadu");
		String b=new String("chennai");
		if(a.equals(b)) {
			System.out.println("values are same");
			
		}
		else {
			System.out.println("values are not same");
			//insert the new character
			StringBuffer a1=new StringBuffer("kalpana");
			StringBuffer b1=new StringBuffer("kadam");
			System.out.println(a1.insert(3, "patil"));
	}

	}
}
