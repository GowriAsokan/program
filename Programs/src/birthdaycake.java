import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;



	public class birthdaycake {
	public static void main(String args[]){
		
	int num,i,count=1;
	
		
	Scanner input = new Scanner(System.in);
		
	 System.out.println("Enter the numbers of candles");
		 
	  num = input.nextInt();
		  
	  int array[] = new int[num];
		    
	  System.out.println("Enter your age ");
	  Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		    
 for (i = 0; i < num; i++){
      array[i] = input.nextInt();
	      
    }
  for(int number: array){
	
	  if(!map.containsKey(number)){
          map.put(number,1);
       }
      else{
    	  count= count+1;
         // map.put(number, map.get(number)+1);
    	  map.put(number, count);
    	  }

  }
  
  
  
//  for(Map.Entry m : map.entrySet()){
//      System.out.println("height"+ m.getKey() + "candles "+ m.getValue());
//      
//      int a=(int)m.getKey();
//   int b=(int)m.getValue();    
// 
//   if(b!= 1){
//	  
//	  System.out.println("The number of candles blown" +" "+ m.getValue() );
//	  
//   }
//   
//
//  }

  Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>(map); 
  System.out.println("After Sorting:");
  Set set2 = map1.entrySet();
  int key = 0 ;
  Iterator itr = set2.iterator();
  
  Set s=map1.keySet();
  System.out.println(s);
  
  Collection c = map1.values();
  System.out.println(c);
  
  while(itr.hasNext()) {
      
	  Map.Entry me2 = (Map.Entry)itr.next();
       System.out.print(me2.getKey() + ": ");
       System.out.println(me2.getValue());
        key = Collections.max(map1.keySet());
        
       
    		   
  
  }
  
  System.out.println("The number of candles blown:" +map1.get(key));
  
	
	}
	
}
