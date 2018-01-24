
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HotelChecking 
 {
	public static void main(String args[])
	{
		HotelPOJO h1 = new HotelPOJO("Hotel 1",8,500);
		HotelPOJO h2 = new HotelPOJO("Hotel 2",5,1000);
		HotelPOJO h3 = new HotelPOJO("Hotel 3",6,450);
		HotelPOJO h4 = new HotelPOJO("Hotel 4",8,550);
		HotelPOJO h5 = new HotelPOJO("Hotel 5",7,800);

		Set<HotelPOJO> set = new TreeSet<HotelPOJO>(new Mycomparator());
		set.add(h1);
		set.add(h2);
		set.add(h3);
		set.add(h4);
		set.add(h5);

		Iterator iter = set.iterator();
			
			while(iter.hasNext())
			{
			
				HotelPOJO h = (HotelPOJO)iter.next();
			System.out.println("The hotelname is" + h.getName() +"rating is " +h.getRating()+"and cost is"+h.getCost());
		}
		
	}

}
