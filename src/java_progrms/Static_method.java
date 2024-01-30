package java_progrms;
class std{
	int rollno;
	String name;
	static String college="ITS";
	static void m1() {
		college="BBDIT";	
		}
	std(int i,String s){
		rollno=i;
		name=s;
	}
	void disp() {
		System.out.println(rollno+" "+name+" "+college);
	}
}
public class Static_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
std s1=new std(101,"kalpana");
std s2=new std(102,"yogitha");
std s3=new std(103,"kalyani");
s1.disp();
s2.disp();
s3.disp();
	}

}
