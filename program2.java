import java.util.*;
class LeaderDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		LeaderDemo obj=new LeaderDemo();
		System.out.println("Enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements are:");
		obj.fun(arr);

			
	}
	void fun(int arr[]){
		int n=arr.length;
		int max=arr[n-1];
		System.out.println(max+" ");
		for(int i=n-2;i>=0;i--){
			if(arr[i]>max){
				max=arr[i];
				System.out.println(max+" ");
			}
		}
	}
}
