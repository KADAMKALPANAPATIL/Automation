package IQ_PRGMS;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//initialize array
		int[]arr=new int[] {1,2,3,4,5,6,2,4,3,2,4,3,3,4,5};
	//array fr will store frequency of element
		int[] fr=new int[arr.length];
		int visited=-1;
		for (int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					//to avoid counting same element again 
					fr[j]=visited;
					
				}
				
			}
			if(fr[i]!=visited)
				fr[i]=count;
		}
		//displays the frequency of each element present
		System.out.println("------------------------------------");
		System.out.println("element | frequency");
		System.out.println("------------------------------------");
		for (int i=0;i<fr.length;i++) {
			if(fr[i]!=visited)
				System.out.println("  "+arr[i]+"   |   "+fr[i]);
			}
		System.out.println("------------------------------------");
		}

}
