package labs;

public class BandBooster
{
	private String name;
	private int boxesSold;
	
	public BandBooster(String bandBooster)
	{
		boxesSold = 0;
		name = bandBooster;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void updateSales(int boxes)
	{
		boxesSold += boxes;
	}
	
	public String toString()
	{
		return name + ": " + boxesSold + " boxes";
	}
	
	
}
