package IQ_PRGMS;

public class String_Smallest_Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="I have completed my testig course";
String word="",small="",large="";
String[] words=new String[100];
int length=0;s=s+"";                //add extra space after string to get the last word
for (int i=0;i<s.length();i++) {
	if(s.charAt(i)!=' ') {          //split the string into words     
		word=word+s.charAt(i);
	}
	else {
		words[length]=word;        //add word to array words
		length++;             //increment length
		word="";               //make word in empty string
		
	}
}
small=large=words[0];
for(int k=0;k<length;k++) {                 //initialize small and large with first word
	if(small.length()>words[k].length())  //determine smallest and largest word in the string
		small=words[k];                    //if length of small is greater than any word present
	if(large.length()<words[k].length())   //store value of word into small
		large=words[k];}                   //if length of large is less than any word present
System.out.println("Smallest word:" +small);
System.out.println("Largest word:" +large);
}
}


