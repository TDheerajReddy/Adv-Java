//Succesful , but we know the 1st January Day

import java.util.Scanner;
import java.util.StringTokenizer;
class FindDay2
{
    public static void main(String[] args) 
    {
		 int monthDays [] = {31,28,31,30,31,30,31,31,30,31,30,31};
		 String dayNames[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Date(dd/mm/yyyy) : ");
		 String dateStr = sc.nextLine();

		 StringTokenizer st = new StringTokenizer(dateStr, "/");
		 int tokenCount = st.countTokens();

		 if(tokenCount <= 0 || tokenCount > 3)
		 {
			 System.out.println("Invalid Date!!!");
			 return;
		 }

		 int day = Integer.parseInt(st.nextToken());
		 int month = Integer.parseInt(st.nextToken());
		 int year = Integer.parseInt(st.nextToken());

		 boolean leapYear = isLeapYear(year);
		 if(leapYear)
		 {
			 monthDays[1] = 29;
		 }
		 if(month < 1 || month > 12)
		 {
			System.out.println("Invalid Month!!!");
			return;
		 }
		 if(day < 1 || day > monthDays[month - 1])
		 {
			System.out.println("Invalid Day!!!");
			return;
		 }
		 System.out.print("Day on 1st January : ");
		 String startDayName = sc.nextLine();
		 sc.close();
		 int startDayIdx = -1;
		 
		 for(int i = 0; i < dayNames.length; i++)
		 {
			 if(dayNames[i].equalsIgnoreCase(startDayName))
			 {
				 startDayIdx = i;
				 break;
			 }
		 }
		 
		 if(startDayIdx == -1)
		 {
			System.out.println("Invalid Day Name!!!");
			return;
		 }

		//Calculate Total Days
		int tDays = 0;
		for(int i = 0;i < month - 1; i++)
		{
			tDays += monthDays[i];
		}
		
		tDays += day;
		
		int currDayIdx = tDays % 7 + startDayIdx - 1;
		if(currDayIdx >= 7)
		{
			currDayIdx -= 7;
		}
		System.out.println("Day on "+dateStr+" : "+dayNames[currDayIdx]);
	}
	
	public static boolean isLeapYear(int y)
	{
		boolean ret = false;
		
		if(y % 400 == 0)
		{
			ret = true;
		}
		else if(y % 100 == 0)
		{
			ret = false;
		}
		else if(y % 4 == 0)
		{
			ret = true;
		}
		else
		{
			ret = false;
		}
		return ret;
	}
	
   
}