package IQ_PRGMS;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr1=new int[] {1,2,3,4,5};
//creater another array with size of arr1
int[]arr2=new int[arr1.length];
//copy all elements of one array int another 
for (int i=0;i<arr1.length;i++) {
	System.out.print(arr1[i]+" ");
} System.out.println();
//displaying elements of array arr2
System.out.println("elements of new array:");
for(int i=0;i<arr2.length;i++) {
	System.out.print(arr2[i]+" ");
	
}
	}

}
