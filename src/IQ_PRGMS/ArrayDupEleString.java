package IQ_PRGMS;

public class ArrayDupEleString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"java", "c","java","c++","c"};
for(int i=0;i<s.length;i++) {
for(int j=i+1;j<s.length;j++) {
	if(s[i]==s[j]) {
		System.out.println(s[i]);
	}
}
}
	}
}
