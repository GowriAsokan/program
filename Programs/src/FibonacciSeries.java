
public class FibonacciSeries 
	{

	public static void main(String args[])
		{
		
		int a=0, b=1;
		int temp;
		
	System.out.println("The fabonacci series is" + a + " "+b);
		for(int i=0;i<10;i++)
			{
			 	temp = a+b;
			 System.out.println(temp);
			 	a=b;
			 	b=temp;
			}
	
		}
	}



/** 
0 1 1 2 3 5 8
 
Each number is the sum of previous two numbers

**/