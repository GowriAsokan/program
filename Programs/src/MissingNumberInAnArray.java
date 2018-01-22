
  	public class MissingNumberInAnArray {
  		
  		public static void main(String ars[]){
  			
  			int arr[]= {1,1,3,3,9,9,8};
  			
  			for(int i=0; i<arr.length; i++){
  				if(arr[i]==arr[i+1]){
  					i++;
  				}
  				
  				
  				else {
  					System.out.println(arr[i]);
  				}
  			}
  			
	 
 }
}
