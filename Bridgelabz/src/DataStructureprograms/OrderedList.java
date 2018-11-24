package DataStructureprograms;

import Utility.Utility;
import java.io.*;
public class OrderedList {
public static void main(String[] args) throws Exception
{
 int n;
 LinkLIst<Integer> linked = new LinkLIst<Integer>();
  Utility utility = new Utility();
 String filepath = "/home/hp/Desktop/demo";
 BufferedReader br;
 String f = linked.readfromFile(filepath);
 int noarr[]=f.split("");
 for(int i=0; i<noarr.length; i++)
 {
	 linked.add(noarr[i]);
 }
}
}
