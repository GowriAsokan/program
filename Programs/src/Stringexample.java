
public class Stringexample {

	public static void main(String ars[])
	{
		
		Integer I1 = 10;    //Autoboxing
		
		
		int a= 10;
		Integer i=Integer.valueOf(a);	// using utility method	- valueOf()
		
		String s1 = new String("java");
		System.out.println(s1);
		String s2= s1.concat("program");
		String s7 = new String("java");
		
		System.out.println(s2);
String s3 = s1;
System.out.println(s3);

 final StringBuffer s5= new StringBuffer("examples");
s5.append("soft");
System.out.println(s5);
//StringBuffer s5 = new StringBuffer("erf");
	
	 final String s23= new String ("sadfsd");
String s24=	s23.concat("sdfs");
 s23.concat("gowri");
System.out.println(s23);
	
	System.out.println(s24);
	
	  StringBuffer sb= new StringBuffer("examples");
	 // StringBuffer sb= new StringBuffer("exampl");
	  
	  Boolean b = new Boolean("durga");
	  System.out.println(b);
  
	  
	  int x=12;
	  //String s= i.toString();
	  Integer I = new Integer(12);
	  String s = I.toString();
	  System.out.println(s);
	  
	  Integer I3 = new Integer(x);
	  System.out.println(I3);
	  Integer I4 = x;
	  
	  
	  
	  
	  
	  
	  

	
	}
	
	
	
	
}
