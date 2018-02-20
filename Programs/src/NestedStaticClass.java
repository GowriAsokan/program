
public class NestedStaticClass
{
	static int data= 30;
	static String msg = "Trying";

static class Innerclass
	{
		 void msg()
		{
			System.out.println("The data is" + data);
		}
		 static void message()
		 {
			 System.out.println("The message is" + msg);
		 }
		 
		public static void main(String args[])
		{
			
			NestedStaticClass.Innerclass n= new NestedStaticClass.Innerclass();
			n.msg();
		//n.message()
			NestedStaticClass.Innerclass.message();
		}
	}
}

/* The data is30
The message isTrying
*/