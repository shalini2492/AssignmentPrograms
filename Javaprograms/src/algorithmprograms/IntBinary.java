package algorithmprograms;

import utility.Utility;
public class IntBinary {
   public static void main(String[] args)
   {
	  // Utility utility=new Utility();
	   int size;
	   System.out.println("Enter the size of array");
	   size = Utility.inputInteger();
	   String [] words = new String[size];
		for(int i=0; i<size; i++) 
		{
			System.out.print("words["+i+"]: ");
			words[i] = Utility.inputString();
		}
		System.out.print("Enter word to search for: ");
		String word = Utility.inputString();

		int index =Utility.binarysearchWord(word, words, 0, words.length);
		if(index < 0) {
			System.out.println("not found");
		} else {
			System.out.println("found at index " + index);
		}

		
	}
}
