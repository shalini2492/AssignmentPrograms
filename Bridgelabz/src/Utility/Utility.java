package Utility;
import java.awt.*;
import java.awt.List;
import java.text.SimpleDateFormat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.lang.reflect.Array;
import java.util.*;

import Algorithmprograms.InsortStr;
import DataStructureprograms.LinkLIst;
import Utility.Utility.LinkedList.Node;

public class Utility 
{
	
	
	Scanner sc = new Scanner(System.in);
	/*This method will read and accept input of type string and can be called using 
	 * object of class
	 */
    public String inputString()
    {
    	return sc.nextLine();
    }
    /*This method will read and accept input of type integer and can be called
     * using object of class.
     */
    public int inputInteger()
    {
    	return sc.nextInt();
    }
    
    /***********************2D array*****************************************/
    /*This method will return input of type boolean*/

    public boolean InputBoolean()
    {
    	return sc.nextBoolean();
    }

    /*This method will return input of type double.*/

    public double InputDouble()
    {
    	return sc.nextDouble(); /*Scans the next token of the input as a double. This 
    	method will throw InputMismatchException if the next token cannot be 
    	translated into a valid double value.Scans the next token of the input as
    	 a double. */ 
    }
    /**********************String Replace*************************/
    
    public String replaceString(String template, String username)
    {
    	
    	if(username.length() < 3)
    	{
    		System.out.println("Please enter string of more than 3 characters");
    	}
    	else
    	{
    		String str = template.replace("<<username>>", username);
    	    return str;
    	}
    	return template;
    }


/***********************************Flip coin******************************/

 static Random random = new Random();
public int HeadorTail(int n)
{
	long headper=0, tailper=0;
	int headcount=0, tailcount=0;
	//int heads, tail, n,i;
	
	
	System.out.println("Enter the no. of times you want to flip the coin");
	       if(n < 0)
	       {
		       System.out.println("Please enter valid no.");
		       n = sc.nextInt();
		       HeadorTail(n);
	       }
	
	/****Here input is checked whether it is valid or not. And if invalid then user is requested
	 * to enter a valid input and the method is called inside a method again.
	 * 
	 */
	     for(int i=0; i<n; i++)
	     {
		        double rand = Math.random();
	            System.out.println("Random no. are" +rand);
                  if(rand < 0.5)
	                    {
	    	                 System.out.println("The occurrence of tail" +i);
	    	                 tailcount = tailcount + 1;
	                    }
	               else
	    		             System.out.println("The occurrence of heads" +i);
 			                 headcount = headcount +1;
	    	
	     }
	
	/***Here the for loop to read random no. generated by using random() and then checked 
	 * if coin is head or tail after flipping. Headcount and tailcount are incremented 
	 * for computing headcount vs tailcount.
	 */
	
	                    System.out.println("Head count" +headcount);
	                     System.out.println("tail count" +tailcount);
	


/***Here headcount and tailcount is computed so as to compare their count and display output.
* 
*/
	
	            if(headcount>tailcount)
	                 {
		                    System.out.println("Headcount is greater");
	                 }
	           else
		                    System.out.println("tailcount is greater");
    return n;
}
 
/*********************Leap Year*****************************/

public void LeapYear(int yearno) 
{
	/**This method will check if the user input is of 4-digit and if it is invalid 
	 * then method is called recursively requesting user a valid input. valueOf method
	 * is used of String class to obtain value of yearno. and then its length is
	 * calculated and checked.
	 */
	   if(String.valueOf(yearno).length()<4)
            	{
		             System.out.println("Enter 4-digit year");
		             yearno = sc.nextInt();
		             LeapYear(yearno);
		
	            }
	if(yearno%4 == 0) /**This method will check if given year is a leap year.*/
       {
	        if(yearno%100 == 0) /*when all these conditions will be true the we can say
	                                   given year is a leap year.*/ 
                 {
		                if(yearno%400 == 0)
	                         {
		                          System.out.println(yearno+ "is a leap year");
	                         }
		                else
		                	System.out.println("not a leap year");
                  }
	        else
	        	System.out.println("not a leap year");
       }
	else
		      System.out.println(yearno+ "is not a leap year");
}


/*************************Power 2********************************/

public int power(int pow, int base)
{
	int i;
	System.out.println("Enter the power"); 
	      if(pow > 31) /*The input taken by the user should not exceed beyond 31. If
	                           it is more than 31 then user is requested to reenter new and valid input.*/
	            {
		                 System.out.println("Please enter valid power");
		                 pow = sc.nextInt();
	                     power(pow, base);
	            }
	      
	      else
	      {
	    	   base=2;
	      
	             for(i=0; pow<i; i++)
	                  {
		                  pow = pow*base;
	                  }
	                      System.out.println("2 to the power" +pow+ "is" +i);
	      }
	      return pow;
}

/********************Harmonic Number*****************************/

public int harmonicNo(int sum)
{
         sum=sc.nextInt();
         while(sum != 0)
 	  
             {
	                for(int i=2; i<sum; i++)
	                      {
	                             sum += (double) 1/i;
	                      }
	  
             }
              System.out.println("The harmonic no. is" +sum);
return sum;
}

/**********************Prime Factorization**************************/

public int factors(int n)
{
	    if(n%2 == 0)
	          {
		             System.out.println("" +n);
	          }
	    else
		             System.out.println("");
	            for(int i=3; i<n; i=i+2)
	                  {
		                    while(n%i == 0)
		                       {
		          
		                    	System.out.println("" +i);
	                           }
                      }
	            return n;
}

/************************Gambler*************************************/

public void gambling(int stake, int trials, int target)
{	
	/*for loop to iterate till the no. of trials */
	int won=0, bet=0;
	int cash;
	            for(int t=0; t < trials; t++) 
	                    {
		                    cash = stake;  
		 /*the player can play till the cash is 0 and cash is less than target.*/
		                    while(cash > 0 && cash <= target)
		                         {
			                           bet++;
			                           if(Math.random() < 0.5)
				                       cash++;
			                           else
				                       cash--;			
		                         }
		                   if(cash == target)		
			                            won++;		
	                    }
	/*printing the output.*/
	System.out.println(won+ "wins of" +trials);
	System.out.println("Percentage of win over trials "  +100 * won/trials);
	System.out.println("Average # bet       " +1.0 *bet/trials);
}


/*************************Distinct Coupon Number************************/

public int dist_coupon(int n)
{
	   for(int i=0; i<n; i++)
	          {
	                 double randno= Math.random();
	                 if(i != randno)
	                      {
		                         System.out.println(i+ "is a distinct coupon number");
	                      }
	                 else
		                         System.out.println("Not  a distinct coupon number");
	
              }
	   return n;
}



public void twodarr(int row, int column)
{
	        int[][] a= new int[row][column];
	        for(int i=0; i<row; i++)
	             {
	                	for(int j=0; j<column; j++)
		                     {
		                          a[i][j]= sc.nextInt(); /* Reads the integer value from user.*/
		                     }
	             }
	        for(int i=0; i<row; i++)
	             {
		                 for(int j=0; j<column; j++)
		                     {
			                      System.out.print(a[i][j]+ " ");  //printing the array.
		                     }
	                              System.out.println(" ");
	             }
	
}

/********************Sum of Three integers************************/

public int[] triplets(int a[])
{

	int n=10;
	a = new int[n];
	boolean flag=true;  // flag to check if the sum of triplets is 0. Returns true if the 
	//result is non-zero.
	for(int i=0; i<n-2; i++)
	{
		for(int j=i+1; j<n-1; j++)
		{
			for(int k=j+1; k<n; k++)
			{
				if(a[i]+a[j]+a[k] == 0) //checks whether sum is zero or non-zero.
				{
					
					flag = false;
				}
			}
		}
	}
	if(flag == true)
	{
		System.out.println("The sum is non-zero");
	}
	else
		System.out.println("The sum is 0.");
	return a;
}



/*************************Distance calculation*************************/

public void dist(int i, int j)
{
	int x = 0, y=0;
	
  double c = Math.pow(x, 2);  //Returns x*x.
  double d = Math.pow(y, 2);  //Returns y*y.
  double dn = c * d;         
  double diff = (c-i) * (d-j);
  System.out.println("The distance from (" +x+ "," +y+ ") to (0,0) is " +diff);
}

/**********************String Permutation******************************/

public void swap(String[] ch, int i, int j)
{
	/* This method is used to swap values from location i and i+1. We use temp 
	 * variable for this purpose.
	 */
	String temp= ch[i];
	ch[i]=ch[j];
	ch[j] = temp;
}

public String[] per(String[] ch, int currentindex)
{
	   int j;
	   j = sc.nextInt();  
	   ch = new String[j]; 
	
	       if(currentindex == (ch.length-1))  /*original string ch and cindex is set as its 
		                             length-1. Means currentindex is ch[i+1] and then remianing elements 
		                             are swapped using swap() method iteratively. */
	                  {
		                    System.out.println(String.valueOf(ch));
      	              }
	             for(int i = currentindex; i< ch.length; i++)
	                     {
	                           swap(ch, currentindex, j);     //iterative swap() method.
	                           per(ch, currentindex+1); /* recursive per() method. Here currentindex is 
	                                                      incremented. and again swap method is called. */
	                           swap(ch, currentindex, j);
	                     }
	             System.out.println(ch);
return ch;
}

/************************Stopwatch*********************************/

public void stopWatch(int startTime, int stopTime)
{
	startTime=0;
	stopTime=0;
	
	int elapsedTime, diff, ch;
	
	long start;
	start = System.currentTimeMillis();
	long now = System.currentTimeMillis();
	System.out.println((now-start)/1000.0);
}


/************************TicTacToe***********************************/

public void playGame(int x)
{
	    Random random = new Random(); //Random instance is created for generating 
	                                //random no.
	    int row=3, column=3, cellno;
	    int won=0, count=0, c=0;
	    int[][] a =new int[row][column];

	    for(int i=0; i < row; i++)
	       {
	    	   for(int j=0; j<column; j++)
	    	    {
		                   cellno = a[i][j];
	                       cellno = sc.nextInt();
		                   
	            }
	       }
	    switch(c)
	    {
	    case 1: if(a[0][0] + a[0][1] + a[0][2]=='X')
	            won++;
	    case 2: if(a[1][0] + a[1][1] + a[1][2]=='X')
	    	    won++;
	    case 3: if(a[2][0] + a[2][1] + a[2][2]=='X')
	    	    won++;
	    case 4: if(a[0][0] + a[1][0] + a[2][0]=='X')
	    	    won++;
	    case 5: if(a[0][1] + a[1][1] + a[2][1]=='X')
	    	    won++;
	    case 6: if(a[0][2] + a[1][2] + a[2][2]=='X')
	    	    won++;
	    case 7: if(a[0][0] + a[1][1] + a[2][2]=='X')
	    	    won++;
	    case 8: if(a[2][0] + a[1][1] + a[0][2]=='X')
	    	    won++;
	    default: System.out.println("This is default case");
	    }
	    
	    
	/*column= row;
	for(int i=0; i==row; i++)
	    {
	         if(a[row][column] == 'X')
	             {
		               won++;
	             }
	        else
		               won--;
	    }
	column=0;
	for(int i=0; i<row; i++)
	{
		System.out.println();
	}
	if(a[row][column] == 'X')
	{
		count++;
		
	}
	System.out.println("User won");
	column=1;
	for(int i=0; i<row; i++)
	{
		count++;
		
	}
	System.out.println("User won");
	column=2;
	for(int i=0; i<row; i++)
	{
		count++;
		
	}
	System.out.println("User won");
	row=0;
	for(int j=0; j<column; j++)
	{
		count++;
	}
	System.out.println("User won");
	row=1;
	for(int j=0; j<column; j++)
	{
		
	}*/
}

/*************************Quadratic*******************************/

double k, root1, root2;
public double quad(int a, int b, int c)
{
	a = sc.nextInt(); // a is accepted.
	
	
	if(k > 0)
	    {
		//calculating root1 and root2 for k if k is not 0.
		
		           root1 = (-b + (Math.sqrt(k) / (2 * a)));
		           root2 = (-b - (Math.sqrt(k) / (2 * a)));
		           System.out.println("First root:" +root1);
		           System.out.println("Second root" +root2);
	    }
	   else if(k == 0)
	        {
      //if k is 0 then only root1 is calculated because the output will not be 
		  // infinite
		          root1 = (-b + (Math.sqrt(k) / (2 * a)));
		          System.out.println("First root is:" +root1);
	        }
	   else
		          System.out.println("Roots are imaginary");
	return k;
}

/******************************WindChill********************************/

public double calTemp(double temp, double speed)
{
	double cal=0;
	temp = sc.nextDouble();
	speed = sc.nextDouble();
	           if(temp > 50 || speed <3 || speed > 120)
	                    {
	                        System.out.println("Please enter valid temperature");
	                        temp = sc.nextDouble();
	                        System.out.println("Please enter valid speed");
	                        speed = sc.nextDouble();
	                        calTemp(temp, speed);
	                    }
	           else
		          cal = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(speed, 0.16);
	              return cal;
}

/**************************ALGORITHM PROGRAMS*******************************/

/*************************Check for Anagram****************************/

public String checkAnagram(String s1, String s2)
{
	if(s1.replaceAll(" ", "").length() == s2.replaceAll(" ", "").length())
	  {
	            char[] char1 = s1.toLowerCase().toCharArray();
		        char[] char2 = s2.toLowerCase().toCharArray();
	
	            Arrays.sort(char1);
	            Arrays.sort(char2);
	
   if(Arrays.equals(char1, char2))
   	     {
		       System.out.println("Given strings are anagram");
	     }
   else 
	           System.out.println("Given strings are not anagram");
		
     }
	return s1;
}

/**********************Prime no.*****************************/

public int[] prime(int range)
{
	boolean isPrime = false;
	int count = 0;
	int prime[]=new int[range];
	for(int i=0; i<=range; i++)
	{
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				isPrime = true;
				break;
			}
			else
				isPrime = false;
			
		}
		if(isPrime == false)
			prime[count++] = i;
	}
	return prime;
}

public int[] primdrome(int[] a)
{
  int i=0, j=1;
  int[] c = new int[1000];
  
  if(c[i] == c[j])
  {
    System.out.println(c[i]);
  }
           for(i=0; i<1000; i++)
                 {
	                     if(c[i+1] == c[i-1])
	                             {
	                                  System.out.println(c[i]);
	                                  primdrome(a);
	                             }
	                     else
		                              System.out.println("");
                 }
           return a;
}

/***********************Binary Search for Integer**********************/

public int searchBinary(int[] k, int s, int e)
{
	int x, i, j;
    int mid = (s + (e-1))/2; //mid value is calculated.
               if(x == mid) //checked if mid value is the key or not.
                    {
    	                   return mid;
                    }
               else 
    	             if(x > mid)    //if key is in first half part then recursive method is used.
    		                         //mid is set start and end is decremented by 1. 
    	                  {
    		                   return searchBinary(k, mid, e-1);
    	                  }
    	else // If key is in second half part of array then recursive method is used.
    		// Now the mid is incremented and set as start of array and end is kept
    		//as it is.
    		return searchBinary(k, mid+1, e);
}

/*********************Binary Search for String****************************/

public String[] searchStr(String s[])
{
	int i, k, start=0;
	String search = "are";
    int n=10;
	s = new String[n];
	int end = n;
	int mid= (start + (end-1) / 2); /* Mid element is calculated by taking the sum of 
	start and end position of array and dividing it by 2. */ 
	k = mid;
	if(search.equals(s[mid]))
	    {
		          System.out.println("Element searched:" +s[k]);
	    } 
	else if(k > mid)
	    {
		          start = mid;
		          end = end-1;
		          return searchStr(s);
		
	    }
	else
		          start = mid + 1;
		          return searchStr(s);
}


/*********************Insertion Sort for Integer*************************/

public int[] insertionSort(int[] s)
{
	int in, index;
	int i=1, n=5;
	int j = i -1;
	System.out.println("Swapping elements:");
	for(i = 1; i < n; i++)
	{
		if(s[i] > s[j])
		{
			
			 int temp;
	         temp = i;
	         i = j;
	         j = temp;
			
		}
		else
			//insertionSort(s);
			
	}
	return s;
}
    


/******************Insertion sort for String*******************************/
	          
public String[] insortStr(String[] s)
{
	int flag =0, i;
	//s = new String[5];
    for(i = 1; i < 5; i++)
    {
    	int key = i;
    	int j = key - 1;
    	if(s[i].compareToIgnoreCase(s[j]) > 0)
    			{
    		        flag = 1;
    		        String temp;
    		        temp = s[i];
    		        s[i] = s[j];
    		        s[j] = temp;
    			}
    	else
    		insortStr(s);
    		
    }
    return s;
}

/********************Bubble Sort for Integer************************/
int i, j, temp;
public int[] bubsortint(int no, int[] arr)
{

	
	for(i=1; i < no-1; i++)
	{
		for(j=i-1; j<no-i-1; j++)
	        {
		        if(arr[i] < arr[j])
		              {
		// flag = 1;
		                 temp = arr[i];
		                 arr[i]=arr[j];
		                 arr[j]=temp;
		              }
	            
	        }

    }
	
	return arr;
}
public void sortedArray(int no, int[] arr)
{
	System.out.println("Sorted elements are:");
	for(i=0; i<no; i++)
	{
		System.out.println(arr[i]);
	}
}

/**********************Bubble Sort for String***********************/

String tem;
public String[] bubsortString(String[] str, int no)
{
	int i, j;
    for(i=0; i<no-1; i++)
	{
		for(j=0; j<no-i-1; j++)
		{
			if(str[i].compareToIgnoreCase(str[j+1])>0)
			{
				tem = str[i];
				str[i] = str[j];
				str[j] = tem;
			}
		}
	}
	return str;
}

/*********************Find a number*****************************/
int N;
private Object Calender;
public int guessNo(int n)
{
	int mid;
	int start=0;
	int end=n;
	mid=(start+end)/2;
	
	for(int i=0; i<Math.pow(2, N); i++)
	{
		if(n == mid)
		{
			System.out.println(n);
		}
		if(n>mid)
		{
			mid=mid+1;
			guessNo(n);
			
		}
		if(n>mid)
		{
			mid = mid-1;
			guessNo(n);
		}
		
	}
	System.out.println("No. "  +n+ " found");
	return n;
}

/*********************Binary Search word************************/
/*
public static void sort(String[] word)
{
	int length = word.length;
	for(int i=0; i<length; i++)
	{
		for(int j=i; j<length; j++)
		{
			if(word[i].compareTo(word[j])>0)
			{
				String temp;
				temp = word[i];
				word[i]= word[j];
				word[j] = temp;
			}
		}
	}
}
*/

public String binSearch(String search)
{
	String lineNo = "";
	String line = "";
	double count=0, countLine=0, counted = 0;
	String filePath = "/home/hp/Desktop/abcd.txt";
    BufferedReader br;
	try
	{
     br= new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
     if((line = br.readLine()) != null)
     {
    	 countLine++;
    	 System.out.println(line);
    	 String[] words = line.split("");
    	 for(String word : words)
    	 {
    		 if(word.equals(search))
    		 {
    		    count++;
    			 counted++;
    			 System.out.println(word+ " found.");
    		 }
    		
    		 
    	 }
    	
    		 if(counted > 0)
    		 {
    			 counted=0;
    			 lineNo += countLine + ',';
    			
    		 }
    		
    	 }
     
    	 br.close();
     }
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
   return search;
}

/************************Insertion Sort***************************/

public String[] sortString(String[] str, int n)
{
	int i=0, j=i+1;
	n = sc.nextInt();
	for(i=0; i<n; i++)
	{
		for(j=i+1; j<n; j++)
		{
			if(str[i].compareToIgnoreCase(str[j]) > 0)
			{
				String temp;
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
			else
				return sortString(str, n);
		}
	}
	return str;
}

/**************************Bubble sort for Integers*****************/

public int[] bubSort(int[] bub)
{
	//int range;
	for(int i=0; i<bub.length; i++)
	{
		for(int j=0; j<bub.length; j++)
		{
			if(bub[i] > bub[j])
			{
				int temp=bub[i];
				bub[i]=bub[j];
				bub[j]=temp;
						
		    }
			else
				bubSort(bub);
	    }
    }
	return bub;
}

/************************Merge Sort*****************************/

public String[] mergeSort(String[] st, int low, int high)
{

	int mid = (low+high) / 2;
	for(int i=0; i<4; i++)
	{
		if(st[i].compareToIgnoreCase(st[mid]) > 0)
			{
				String temp="";
				temp = st[i];
				st[i]=st[mid];
				st[mid]=temp;
			}
			else
			    mergeSort(st, low, high);
	}
	
	return st;
}

/***********************Vending MAchine change return*****************/

public int changeReturn(int valofnote, int noofnote)
{
	int change, count=0;
	change= sc.nextInt();
	int[] arr= new int[8];
	for(int i=0; i<8; i++)
	{
		if(change > arr[i])
		{
			arr[i] = arr[i+1];
			System.out.println("");
		}
		if(change == arr[i])
		{
			count++;
		}
		System.out.println("Largest change to be returned is:" +arr[i]);
		valofnote=arr[i];
		noofnote=count;
	}
	//else
		return changeReturn(valofnote, noofnote);
}

/**************************Calculate day*****************************/

public void calDay(Date d1)
{
	int y, d, m;
	y = sc.nextInt();
	d= sc.nextInt();
	m = sc.nextInt();
	double x, d0, m0, y0;
	while(d1 != null)
	{
		y0 = y - (14 - m) / 12;
		x = y0 + y0/4 - y0/100 + y0/100;
		m0 = m + 12 *((14 - m)/12) - 2;
		d0 = (d + x + 31 * m0 / 12) % 7;
	}
	/*Calendar cal1 = new GregorianCalendar();
	Calendar cal2 = new GregorianCalendar(2019, 12, 23);
	cal2.get(Calendar.DAY_OF_WEEK);*/
}

/*********************Temperature Conversion***********************/

public static void temperaturConversion(double cel, double fa)
{
	double ctof, ftoc;
  if(cel>60 || fa > 55)
  {
	  System.out.println("Invalid value");
	  System.out.println("please enter valid input");
	  //temperaturConversion(cel, fa);
  }
   ctof= (cel * 9/5) + 32;
   System.out.println("Converting temperature from celsius to fahreinheit:" +ctof);
  
   ftoc = (fa - 32) * 5/9;
   System.out.println("Converting temperature from fahreinheit to celsius:" +ftoc);
}

/**********************Monthly Payment*****************************/

public void monthlyPayment(int p, double r, int y)
{
	double pay;
	int n = 12 * y;
	double R = r / (12*100);
	System.out.println("Calculating payment...");
	pay = p * R / (1 -  Math.pow((1 + R), -n));
	System.out.println("Monthly payment should be: "+pay);
}

/***************Square Root using Newton's method*******************/

public static void sqrt(int c)
{
	double epsilon = 1e-15;  //relative error tolerance
	double t=c;  //assume square root of c
	while(Math.abs(t-c/t) > epsilon*t)
//repeatedly apply newton's method till the desired accuracy is not achieved.		
	{
		t = (t+ (c/t))/2.0;
	}
	System.out.println("Sqaure root of " +c+ " is:" +t);
		
}

/***************Conversion of decimal to binary********************/

public static void toBinry(int input)
{
	int[] bin = new int[100];
	int i=0;
	while(input > 0)
	{
		bin[i] = input%2; //remainder is determined as binary value.
		input = input/2;  //divisor is set as next input.
		i++;
	}
	for(int j=i-1; j>=0; j--)
	{
		System.out.print(bin[j]); //displaying binary representation of no.
	
	//System.out.println(bin[i]);
    }
}

/***********************Expansion to binary**************************/

public static void toBinary(int x)
{
	/*int[] bin = new int[100];
	int mid, i=0, nibble1, nibble2;
	int len = in, high, low;
	while(in > 0)
	{
		bin[i] = in%2; //remainder is determined as binary value.
		in = in/2;  //divisor is set as next input.
		i++;
	}
	for(int j=i-1; j>=0; j--)
	{
		System.out.print(bin[j]); //displaying binary representation of no.
	
	//System.out.println(bin[i]);
    }
	*/
	System.out.println("Swapping nibbles....");
//return ((x & 0x0F << 4) | (x & 0xF0 >> 4));
int h=((x & 0x0F) << 4 | (x & 0xF0) >> 4); //Bitwise operators are used to shift 
                                             //bits of nibbles
System.out.println(h);
}

/******************************Displaying list*************************/

public void displayList(String[] task, String[] deadline, int[] minutes)
{
	int n=10;
	String status;
	task = new String[n];
	for(int i=0; i<n; i++)
	{
	
	}
}

/************************DATA STRUCTURE PROGRAMS****************************/

/**********************Unordered linked list********************/

/*class LinkedList
{
	Node head;
	class Node
	{
	  int data;
	  Node next;
	  public void Node(int d)
	  {
		  data = d;
		  next=null;
	  }
	}
	public String list(String str)
	{
		return str;
	}
	public String addItem(String item)
	{
		ArrayList<String> l = new ArrayList<>();
		l.add(item);
		return item;
	}
	public String removeItem(String item)
	{
		ArrayList<String> l = new ArrayList<>();
		l.remove(item);
		return item;
	}
	public String search(String item)
	{
		//System.out.println("Enter string to be searched");
	    Node d;
	    int p;
	    //while()
	}
}



public void unorderedList(Node head, int ptr) throws Exception
{
	//Node a=new Node();
	
   /* ArrayList<String> al = new ArrayList<>();

    int len = Array.getLength(al);
    for(int i=0; i<len; i++)
     {
          //al = sc.next();
     }
    for(int i=0; i<len; i++)
    {
	     System.out.println(al);
    }*/
	
   /* LinkLIst<String> link = new LinkLIst<>();

    public String readfromFile(String file) throws Exception
    {
	     String[] st=new String[20];
	     String l = null;
	     String readfile="cd//home//hp//JavaPrograms//Bridgelabz//bin//Algorithmprograms//abcd.txt";
	     BufferedReader br = new BufferedReader(new FileReader(readfile));
	     while((l=br.readLine()) != null)
	     {
		      System.out.println(l);
		      st=readfile.split(" ");
	     }
    }
    return ;*/

}

	