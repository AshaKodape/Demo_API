package conditional_blocks;

public class Leap_year
{

	public static void main(String[] args)
	{
		// input
		
		int year = 2024;
		
		//logic
		if(year%4==0)
		{
			System.out.println(year+" is a LEAP year");
		}
		else
		{
			System.out.println(year+" is NOT a LEAP year");
		}

	}

}
