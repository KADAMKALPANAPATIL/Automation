package IQ_PRGMS;

public class StringAllSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kalpana";

int len=s.length();
int temp=0;
String arr[]=new String[len*(len+1)/2];
for(int i=0;i<len;i++) {
	for(int j=i;j<len;j++) {
		arr[temp]=s.substring(i,j+1);
		temp++;
	
	}
}
System.out.println("all subsets");
for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}

}
