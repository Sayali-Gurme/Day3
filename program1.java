import java.util.*;
class MajorityEleDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		MajorityEleDemo obj=new MajorityEleDemo();
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int ans=obj.fun(arr);
		System.out.println(ans);

			
	}
	int fun(int arr[]){
		int x=arr[0];
		int count=1;

		for (int i = 1; i < arr.length; i++) {
			if (count == 0) {
     	                   	x=arr[i];
			   	count = 1;
	                } else if (arr[i] == x) {
				count++;
	                } else {
       	                	count--;
	                }
		 }

		return x;



	}
}
