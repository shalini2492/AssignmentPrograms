package lib;

import functionsandlibraries.MathFunction;
import utility.Utility;
import functionsandlibraries.BLStdOut;
public class IsCollinear {
public static void main(String[] args)
{
	int x1, x2, x3, y1, y2, y3;
    BLStdOut.println("Enter the coordinates for point A");
    x1 = Utility.inputInteger();
    y1 = Utility.inputInteger();
    BLStdOut.println("Enter the coordinates for point B");
    x2 = Utility.inputInteger();
    y2 = Utility.inputInteger();
    BLStdOut.println("Enter the coordinates for point C");
    x3 = Utility.inputInteger();
    y3 = Utility.inputInteger();
    boolean isColl = MathFunction.checkCollinearSlope(x1, y1, x2, y2, x3, y3);
    if(isColl)
    {
  	  BLStdOut.println("The given points are collinear checked using slope..");
    }
    else
  	  BLStdOut.println("The given points are non-collinear checked using slope..");
   boolean coll= MathFunction.checkCollinearArea(x1, y1, x2, y2, x3, y3);
   if(coll)
   {
  	 BLStdOut.println("The given points are collinear checked using area of triangle..");
   }
   else
  	 BLStdOut.println("The given points are non-collinear checked using area of triangle..");
}
}
