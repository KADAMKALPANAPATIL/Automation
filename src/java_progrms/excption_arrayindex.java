package java_progrms;

public class excption_arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20; int b;
int abc[]= {12,34,56,78};
try {
	System.out.println(abc[2]);
	
}
catch(ArrayIndexOutOfBoundsException exception) {
	System.out.println("please provide proper index");
}

	}

}
