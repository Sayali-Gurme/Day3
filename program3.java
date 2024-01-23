import java.util.*;
class CountDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		CountDemo obj=new CountDemo();
		System.out.println("enter size:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter value of k");
		int k=sc.nextInt();
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=obj.fun(arr,k);
		System.out.println("Output ="+count);
	}
	int fun(int arr[],int k){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j]==k){
					count++;
				}
			}
		}
		return count;
	}
}
