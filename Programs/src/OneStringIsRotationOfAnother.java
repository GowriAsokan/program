
public class OneStringIsRotationOfAnother {
	
	public static void main(String args[]){
		
		String s1="JavaJ2eeStrutsHibernate";
		String s2="StrutsHibernateJavaJ2ee";
			
			if(s1.length() != s2.length())
			{
				System.out.println("The string s2 is not in rotational version of s1");
			}
			else{
				
				String s3= s1+s1;
					
				if(s3.contains(s2))
				{
					 System.out.println("The string is in rotation");
				}	 
				 else
				 {
						System.out.println("The string s2 is not in rotational version of s1"); 
				 }
				  
			}
	}

}
