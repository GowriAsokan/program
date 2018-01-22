import java.util.Scanner;

public class LargestAndSmallestArray {

	public static void main(String args[]){
		
	
		int num,i;
		
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter the numbers");
		    num = input.nextInt();
		    int array[] = new int[num];
		    
		    System.out.println("Enter " + num + " integers: ");
		    
		    for (i = 0; i < num; i++) 
		      array[i] = input.nextInt();
		
		    
		    
		int largest = array[0];
		int smallest = array[0];
		
	
		for (i = 0; i < num; i++) {    
			if(array[i] > largest)
				
				largest=array[i];
			
			else if(array[i] < smallest)
					
				smallest = array[i];
					
		    }
		System.out.println("The largest number is:"+ largest);	
		System.out.println("The smallest number is:"+ smallest);	
		    
	}
}
			
	
