package IQ_PRGMS;

public class StringDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kalpana are you fine are you getting me hello kalpana";
int count;
s=s.toLowerCase();
String word[]=s.split(" ");
System.out.println("duplicate:");
for(int i=0;i<word.length;i++) {
	count=1;
	for(int j=i+1;j<word.length;j++) {
		if(word[i].equals(word[j])) {
			count++;
			word[j]="0";
			
		}
	}
	if(count>1&&word[i]!="0"){
		System.out.println(word[i]);
	}
}
	}

}
