package java_progrms;
class aaa implements Runnable{


	public void run() {

	for(int i=0;i<=9;i++) {
		System.out.println(i);
	}
	}
	
}
public class thread_ruunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
aaa abc=new aaa();
Thread t=new Thread(abc);
t.start();
aaa abc1=new aaa();
Thread tt=new Thread(abc1);
tt.start();
	}

}
