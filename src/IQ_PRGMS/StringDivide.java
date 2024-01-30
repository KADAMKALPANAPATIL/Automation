package IQ_PRGMS;

public class StringDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="spglobalsolution";
int length =s.length();
int n=4;
int temp=0,charact=length/n;
String[]equalstr=new String[n];
if(length%n!=0) {
	System.out.println("string cannot be divided int"+n+"equal parts.");
}
else {
	for(int i=0;i<length;i=i+charact) {
	String part=s.substring(i,i+charact);
	equalstr[temp]=part;
	temp++;
	}
	System.out.println(n+"equal part of given string are");
	for(int i=0;i < equalstr.length ;i++) {
	System.out.println(equalstr[i]);	
	}
}
	}

}
