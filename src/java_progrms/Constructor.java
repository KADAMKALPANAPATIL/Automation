package java_progrms;
class student1{
	int id;
	String name;
	student1(int i,String n){
		id=i;
		name=n;
	}
	public student1() {
		// TODO Auto-generated constructor stub
	}
	void disp() {
		System.out.println(id+" "+name);
	}
}
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 s1=new student1(111,"ayan");
student1 s2=new student1(222,"aryan");
s1.disp();
s2.disp();


	}

}
