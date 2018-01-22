import java.lang.*;
import java.util.Arrays;
import java.util.HashSet;
public class CommonElementsInTwoArrays {
 public static void main(String args[])
 {
	 String[] str1 = {"one", "two","three","four"};
	 String[] str2={"two","five","four","six"};
	 
	HashSet <String> set = new HashSet<String>();
	for(int i=0;i<str1.length; i++)
	{
		for(int j=0; j<str2.length; j++)
		{
			 if(str1[i].equals(str2[j])){
				 set.add(str1[i]);
			 }
		 }
	 }
	 System.out.println(set);

 //Using retainAll() method:
	 
	 Integer[] i1= {10,34,79,88};
	 Integer[] i2= {34,44,90,10,5};
	 
	 HashSet<Integer> set1= new HashSet<>(Arrays.asList(i1));
	 HashSet<Integer> set2= new HashSet<>(Arrays.asList(i2));
	 	set1.retainAll(set2);
	 System.out.println(set1);

 	}
}
 
 
 
 
 
 
 
 
 
 
 
 
 

