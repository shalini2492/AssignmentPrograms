package functionsandlibraries;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import standardlibrary.BLStdOut;
public class Birthdays {
public static void main(String[] args)
{
	
	for(int i=0; i<50; i++)
	{
	LocalDate randomDate = createRandomDate(1992,1993);
    System.out.println(randomDate);
    
	}
}

public static int createRandomIntBetween(int start, int end)
{
	return start + (int) (Math.round(Math.random() * (end-start)));
}
public static LocalDate createRandomDate(int startYear, int endYear)
{
	int day=createRandomIntBetween(1, 30);
	int month;
	month=createRandomIntBetween(1, 12);
	int mon[]= {1,2,3,4,5,6,7,8,9,10,11,12};
	for(int i=1; i<12; i++)
	{
		if(mon[i]==(mon[month]))
		{
			System.out.println();
		}
	}
	
	int year=createRandomIntBetween(1992, 1993);
	LocalDate newDate= LocalDate.of(year, month, day);
	
	return newDate;
	
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	GregorianCalendar gc = new GregorianCalendar();

    int year = randBetween(1992, 1993);
    for(int i=0; i<50; i++)
    {
    gc.set(gc.YEAR, year);

    int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));

    gc.set(gc.DAY_OF_YEAR, dayOfYear);

    System.out.println(gc.get(gc.YEAR) + "-" + (gc.DECEMBER + 1) + "-" + gc.get(gc.DAY_OF_MONTH));
    }
}

public static int randBetween(int start, int end) {
    return start + (int)Math.round(Math.random() * (end - start));*/

