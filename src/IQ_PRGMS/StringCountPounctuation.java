package IQ_PRGMS;

public class StringCountPounctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=0;
String s="he\fk said.id?,'ur ";
for(int i=0;i<s.length();i++) {
	//check character is punctuation mark
	if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='-'||s.charAt(i)=='\''||s.charAt(i)=='\"'||s.charAt(i)==':'||s.charAt(i)=='*'){
		count++;

	}
}
System.out.println("number of punctuation:"+count);
}

}
