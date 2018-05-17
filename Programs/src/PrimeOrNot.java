import java.util.Scanner;

public class PrimeOrNot {
	public static void main(String[] args) {
		System.out.println("Enter number to check prime or not");
		Scanner sc=new Scanner(System.in);
		Integer number=sc.nextInt();
		
		boolean prime=true;
		for(int i=2;i<number;i++){
			if(number%i==0){
				prime=false;
			}
		}
		
		if(prime==true){
			System.out.println("The given number is a prime number:"+number);
		}else{
			System.out.println("The given number is not a prime number");
		}

	}


}
