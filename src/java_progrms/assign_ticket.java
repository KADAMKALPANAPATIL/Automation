package java_progrms;

public class assign_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age=80;
int cost=300;
int a=cost/2;
int b=cost*80/100;
String c="no ticket";
if(age<5) {
	System.out.println("you are a child"+c);
}
else if((age>5)&&(age<18)){
System.out.println("you are a minor ticket cost i"+a);

}
else if((age>18)&&(age<60)) {
	System.out.println("you are a major ticket cost is"+b);
}
	}

}
