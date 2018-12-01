package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;

public class IsCollinear {
public static void main(String[] args)
{
	int x1, x2, x3, y1, y2, y3;
    System.out.println("Enter the coordinates for point A");
    x1 = Utility.inputInteger();
    y1 = Utility.inputInteger();
    System.out.println("Enter the coordinates for point B");
    x2 = Utility.inputInteger();
    y2 = Utility.inputInteger();
    System.out.println("Enter the coordinates for point C");
    x3 = Utility.inputInteger();
    y3 = Utility.inputInteger();
    boolean isColl = MathFunction.checkCollinearSlope(x1, y1, x2, y2, x3, y3);
    if(isColl)
    {
  	  System.out.println("The given points are collinear checked using slope..");
    }
    else
  	  System.out.println("The given points are non-collinear checked using slope..");
   boolean coll= MathFunction.checkCollinearArea(x1, y1, x2, y2, x3, y3);
   if(coll)
   {
  	 System.out.println("The given points are collinear checked using area of triangle..");
   }
   else
  	 System.out.println("The given points are non-collinear checked using area of triangle..");
}
}
