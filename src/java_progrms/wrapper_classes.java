package java_progrms;

public class wrapper_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data type into object
double d=20.4; double dd;
Double ddd=new Double(d);
System.out.println(ddd);
dd=ddd;
System.out.println(dd);
// string object into primitive data type
float f=30.0f; int i;
Integer ii=new Integer((int) f);
System.out.println(ii);
i=ii;
System.out.println(i);
//string object into primitive data type
String aa="50";
int bb=Integer.parseInt(aa);
bb++;
System.out.println(bb);
//else
String a="40.8";
float ff=Float.parseFloat(a);
ff++;
System.out.println(ff);
	}

}
