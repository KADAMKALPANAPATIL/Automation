package IQ_PRGMS;

public class StringDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="kalpana patil k k";
int count;
char s1[]=s.toCharArray();
System.out.println("duplicates:");
for(int i=0;i<s1.length;i++) {
	count=1;
	for(int j=i+1;j<s1.length;j++) {
		if(s1[i]==s1[j]&&s1[i]!=' ') {
		count++;
		//set s1[j] to 0 avoid printing visiting characters
		s1[j]='0';
		
		}
	}
	//character is considered as duplicate if count is greater than 1
	if(count>1&&s1[i]!='0')
		System.out.println(s1[i]);
}
	}

}
