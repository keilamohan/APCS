public interface Monster
{
	public int getBig();
	public String getName();
	public boolean isBigger(Monster other);	
	public boolean isSmaller(Monster other);
	public boolean namesSame(Monster other);
}