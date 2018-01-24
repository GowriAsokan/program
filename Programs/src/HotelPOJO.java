
public class HotelPOJO 
	{
		private String name;
		private Integer cost;
		private Integer rating;
	
	HotelPOJO(String name, Integer rating, Integer cost){
		
		this.name = name;
		this.rating = rating;
		this.cost = cost;	
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name= name;
	}
	public Integer getCost()
	{
		return cost;
	}
	public void setCost(Integer cost)
	{
		this.cost= cost;
	}
	public Integer getRating()
	{
		return rating;
	}
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
}
