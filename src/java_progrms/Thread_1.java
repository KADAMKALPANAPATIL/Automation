package java_progrms;
class aa  extends Thread{
	//
	public void run() {
		for(int i=0;i<=20;i++) {
			System.out.println(i);
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
one abc=new one();
aa a = new aa();
a.start();
	}

}
