package java_progrms;


class one {
	public int age=18;
	public void demo() {
	System.out.println(age);	
	}
}
class two extends one{

	public void show() {
		// TODO Auto-generated method stub
		
	}
}
public class accessmodifier_public {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two abc=new two();
System.out.println(abc.age);
	}

}
