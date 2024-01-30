package java_progrms;
class overloading{
	public void demo(char c) {
		System.out.println(c);
	}
	public void demo(char c,int num) {
		System.out.println(c + " "+num);
	}
}
public class Method_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
overloading abc=new overloading();
abc.demo('a');
abc.demo('a',10);
	}

}
