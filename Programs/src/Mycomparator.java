import java.util.Comparator;

public class Mycomparator implements Comparator{

	
	public int compare(Object o1, Object o2) {
		
		HotelPOJO h1 = (HotelPOJO)o1;
		HotelPOJO h2 = (HotelPOJO)o2;
	
		
	//int ratingResult = obj2.getRating().compareTo(obj1.getRating());
	
	int ratingResult = h2.getRating().compareTo(h1.getRating());

	int costResult = h1.getCost().compareTo(h2.getCost());
	
	if(ratingResult == 0){
		return costResult;
	}
	
	return ratingResult;
}
		
		
		
	
	
	

}
