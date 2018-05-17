import java.util.Scanner;
public class AmstrongOrNot {

	public static void main(String args[]){
		
		int n, number, sum=0, rem;
		
		Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the number");
		
		n= s.nextInt();
		number= n;
		
			while(number!=0)
			{
				
				rem = number%10;
				sum = sum+rem*rem*rem;
				number= number/10;
		
			}
		System.out.println(sum);
		if(sum == n)
		{
			System.out.println("It is a amstrong number");
		}
	
		else
		{
			System.out.println("It is not an amstrong number");
		}
	}
	
}
