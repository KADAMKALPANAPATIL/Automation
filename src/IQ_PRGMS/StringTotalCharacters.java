package IQ_PRGMS;

public class StringTotalCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="testing interview theory ankush sir";
int count=0;
for(int i=0;i<s.length();i++) {
	//expect space counts each character
	if(s.charAt(i)!= 'u'&& s.charAt(i)!=' ')
		count++;
}
System.out.println("Total character:"+count);
	}

}
