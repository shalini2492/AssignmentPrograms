package standardlibrary;

public class BLStats {

	/***This method is used to return largest value from the array of double type array.
	 * 
	 * @param a array of type double.
	 * @return largest number
	 */
	
	public static double max(double[] a)
{
	validateNotNull(a);
	double max = Double.NEGATIVE_INFINITY;
	for(int i=0; i<a.length; i++)
	{
		 if (Double.isNaN(a[i])) 
			 return Double.NaN;
         if (a[i] > max) max = a[i];
     }
     return max;
}
	/**This method is used to return the smallest value from the array of type double
	 * 
	 * @param a array of type double
	 * @return smallest number
	 */
	public static double min(double[] a)
	{
		 validateNotNull(a);

	        double min = Double.POSITIVE_INFINITY;
	        for (int i = 0; i < a.length; i++) {
	            if (Double.isNaN(a[i])) 
	            return Double.NaN;
	            if (a[i] < min) min = a[i];
	        }
	        return min;
	}
	
	/**This method is used to return average value in specified subarray. 
	 * @param a array of type double
	 * @return average value
	 */
	public static double mean(double[] a)
	{
		validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double sum = sum(a);
        return sum / a.length;
	}
	/**
     * Returns the sum of all values in the specified array.
     *
     * @param  a the array
     * @return the sum of all values in the array {@code a[]};
     *         {@code 0.0} if no such value
     */
    private static double sum(double[] a) {
        validateNotNull(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
	/**This method is used to return sample variance in array of type double
	 * @param a array of type double
	 * @return sample variance
	 */
	public static double var(double[] a)
	{
		validateNotNull(a);

        if (a.length == 0) return Double.NaN;
        double avg = mean(a);
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] - avg) * (a[i] - avg);
        }
        return sum / (a.length - 1);
	}
	/**This method is used to return the standard deviation in the specified subarray
	 * @param a array of type double
	 * @return sample standard deviation
	 */
	public static double stddev(double[] a)
	{
		 validateNotNull(a);
	        return Math.sqrt(var(a));
	}
	public static double median(double[] a)
	{
	   int startIndex=0, endIndex=0;
	   int midIndex = (startIndex+endIndex)/2;
	   if((midIndex%2) == 0)
	   {
		   a[midIndex]=midIndex;
	   }
	   else
		   a[midIndex]=(a[midIndex]+a[midIndex+1])/2;
	       double y=a[midIndex];
	       return y;
	}
	/**
	 * @param a
	 */
	public static void plotPoints(double[] a)
	{
		validateNotNull(a);
        int n = a.length;
        BLStdDraw.setXscale(-1, n);
        BLStdDraw.setPenRadius(1.0 / (3.0 * n));
        for (int i = 0; i < n; i++) {
            BLStdDraw.point(i, a[i]);
        }
	}
	public static void plotLines(double[] a)
	{
		validateNotNull(a);
        int n = a.length;
        BLStdDraw.setXscale(-1, n);
        BLStdDraw.setPenRadius();
        for (int i = 1; i < n; i++) {
            BLStdDraw.line(i-1, a[i-1], i, a[i]);
        }
	}
	public static void plotBars(double[] a)
	{
		validateNotNull(a);
        int n = a.length;
        BLStdDraw.setXscale(-1, n);
        for (int i = 0; i < n; i++) {
            BLStdDraw.filledRectangle(i, a[i]/2, 0.25, a[i]/2);
        }
	}
	 private static void validateNotNull(Object x) {
	        if (x == null)
	            throw new IllegalArgumentException("argument is null");
	    }
}
