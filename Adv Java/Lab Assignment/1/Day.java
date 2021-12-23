import java.util.*;

class Day
{
	public static void main(String args[])

	{
 	Scanner sc = new Scanner (System.in);
	int day, manth, year;
	int totalDayOfManth, totalDay, leapDay=0;
	int yearDivBy4, yearDivBy100, yearDivBy400, numofleapYear;
	int manthDay []={0,31,59,90,120,151,181,212,243,273,304,334};
	
	System.out.print("Day: ");
	day = sc.nextInt ();

	System.out.print("month: ");
	manth= sc.nextInt ();

	System.out.print("year : ");
	year = sc.nextInt ();

	if (year%100==0)
	{
		if (year %400==0)
		{
		leapDay=1;
		}
	}
	else
	{
		if(year%4==0)
			{
			leapDay=1;
			}
	}

	if((manth > 2) && (leapDay==1))
		{
			manthDay[manth-1]+= 1;
		}

	yearDivBy4 = (year-1)/4;
	yearDivBy100= (year-1)/100;
	yearDivBy400=(year-1)/400;

	numofleapYear=yearDivBy4+yearDivBy400-yearDivBy100;



	totalDay = (year-1)*365+numofleapYear+manthDay[manth-1]+day;
	switch (totalDay % 7)
	{
	case 0: System.out.println("Sunday");
			break;
	case 1: System.out.println("Monday");
			break;
	case 2: System.out.println("Tusday");
			break;
	case 3: System.out.println("Wednsday");
			break;
	case 4: System.out.println("Thrusday");
			break;
	case 5: System.out.println("friday");
			break;
	case 6: System.out.println("Saterday");
			break;
	}
  }
}