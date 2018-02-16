import java.util.Scanner;

public class FibonacciSeriesUsingArray
	{
	public static void main(String args[]){
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the array size");
		int size = input.nextInt();
		
		int fibArray[] = new int[size];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
			for(int i=2;i<size;i++){
				fibArray[i]=fibArray[i-1]+fibArray[i-2];
			}
		 for(int num: fibArray){
				System.out.println(num +" ");

			 
	}
		 }

}
