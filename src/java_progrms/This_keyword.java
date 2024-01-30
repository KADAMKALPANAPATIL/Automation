package java_progrms;
class std1{
	int rollnum;
	String name;
	float fee;
std1(int rollnum,String name,float fee){
	this.rollnum=rollnum;
	this.name=name;
	this.fee=fee;
}
void disp() {
	System.out.println(rollnum+" "+name+" "+fee);
}
}
public class This_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
std1 s1=new std1(001,"kalpana",5000.0f);
std1 s2=new std1(002,"manisha",6000.0f);
s1.disp();
s2.disp();
	}

}
