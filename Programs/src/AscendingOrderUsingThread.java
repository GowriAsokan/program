class Mythread extends Thread
	{
	public int id,i;
	
	public void run()
	  {
		for(i=1;i<=5;i++)
			{
				System.out.println("Thread" + id + " : " + i);
				 
				try
				  {
					sleep(1000);
				 }
			    catch(Exception e)
					  {
			    		System.out.println("some problem");
					}
			}
	  }
	}
public class AscendingOrderUsingThread
 {
	public static void main(String[] args)
 		{
			Mythread a=new Mythread();
			Mythread b=new Mythread();
				a.id=1;
				b.id=2;
				a.start();
				b.start();
 		}
  }



/*
Thread1 : 1
Thread2 : 1
Thread1 : 2
Thread2 : 2
Thread2 : 3
Thread1 : 3
Thread1 : 4
Thread2 : 4
Thread2 : 5
Thread1 : 5
*/