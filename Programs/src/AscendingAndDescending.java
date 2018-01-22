import java.util.Scanner;

  public class AscendingAndDescending {
 
	public static void main(String args[]){
		int num,i,j,temp;
		
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the numbers");
	num = input.nextInt();
      
	int array[] = new int[num];
    
    System.out.println("Enter the numbers");
   
      for(i=0; i < num; i++)
    	  array[i]= input.nextInt();
    	  
    	  for(i=0; i < num; i++){
    		  for(j=i+1; j < num; j++){
    			  
    			  if(array[i]>array[j])
    			  {
    			 	  temp= array[i];
    				  array[i]=array[j];
    				  array[j]=temp;
    				   } 
    	    }
        }
      System.out.println("The numbers in ascending order");
    	  for(i=0; i < num; i++)
    	  {
        	  System.out.println(array[i]);
    	  }
   	 System.out.println("The numbers in descending order");
   	 for(i=num-1; i>=0; i--)
   	 {
   		 System.out.println(array[i]);
   	 }
	}
}
        	  

    				  
    	
	

