
public class RemoveWhiteSpace {
	public static void main(String args[]){
	
		String str = "This is an example program";
	
		//Using replaceAll() method
		String withoutspace = str.replaceAll("\\s", "");
		System.out.println("The string without space:" + withoutspace);
		
		
		//Without using replaceAll() method
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		
		for(int i=0;i<strArray.length;i++)
		{
			if ((strArray[i]!=' ') && (strArray[i]!='\t'))
			{
				sb.append(strArray[i]);
			}
		}
		
	System.out.println("The string without space:" +sb);	
		
	}

}
