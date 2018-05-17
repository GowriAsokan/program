import java.lang.reflect.Method;
import java.util.Scanner;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Test
{
    // creating a private field
    private String s;
 
    // creating a public constructor
    public Test()  {  s = "Reflection"; }
 
    // Creating a public method with no arguments
    public void method1()  {
        System.out.println("The string is " + s);
    }
 
    // Creating a public method with int as argument
    public void method2(int n)  {
        System.out.println("The number is " + n);
    }
 
    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}



public class Reflection{
	public static void main(String args[]) throws NoSuchFieldException, SecurityException, NoSuchMethodException
	{
		Test obj = new Test();
		
		
		 Class cls = obj.getClass();
	        System.out.println("The name of class is " +
	                            cls.getName());
		
		
       Constructor constructor = cls.getConstructor();
	        System.out.println("The name of constructor is " +
                    constructor.getName());
	        
	        
	        System.out.println("The public methods of class are : ");
	 
	        // Getting methods of the class through the object
	        // of the class by using getMethods
	        Method[] methods = cls.getMethods();
	 
	        // Printing method names
	        for (Method method:methods)
	            System.out.println(method.getName());
		
	        Method methodcall1 = cls.getDeclaredMethod("method2",
                    int.class);

	        Field field = cls.getDeclaredField("s");
	        
//		Class name   = Scanner.class;
//		//System.out.println(name.getClass().getName());
//		//System.out.println(name.getCanonicalName());
//	
//		
//		 //Field field = name.getField();
//		 Method[] m = name.getMethods();
//		 
//		// for(int i=0;i<m.length;i++){
//			// System.out.println(m[i]);
//		 //}
//		 for(int i=0;i<m.length;i++){
//			 System.out.println(m[i].getReturnType());
//		 }
		 
		 
	}
	
	
}
