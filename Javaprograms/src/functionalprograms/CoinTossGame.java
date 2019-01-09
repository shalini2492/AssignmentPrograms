package functionalprograms;

/*purpose: To compute the percentage of head vs tails

 * author: Shalini
 * date: 14/11/2018
 * version: 1.0
 */
import java.util.Random;

	import java.util.Scanner;

import utility.Utility;

	 

	// Coin toss/flip game in Java

	public class CoinTossGame {
		public static void main(String[] args)
		{
			System.out.println("Enter the number of times you want to flip coin..");
			int number=Utility.inputInteger();
			Utility.HeadorTail(number);
//int k=0; 
//int j=0;
//	 
//
//	    private enum Coin {
//	        Head, Tail
//    };
//
//	 
//
//	    public static void main(String[] args) {
//
//	        CoinTossGame game = new CoinTossGame();
//
//	        game.startGame();
//
//	    }
//
//	 
//	    // Starts a coin flip game till user decides to quit.
//
//	    private void startGame() {
//
//	 
//
//	        Scanner scanner = new Scanner(System.in);
//
//	        Coin guess;
//	        int i=0;
//	        int j=0;
//
//	        while (true) {
//
//	            System.out.print("Enter you guess (h for heads, t for tails, q to quit):");
//
//	            String choice = scanner.nextLine();
//
//	            if (choice.equalsIgnoreCase("q")) {
//
//	                break;
//
//	            } else if (choice.equalsIgnoreCase("h")) {
//
//	                guess = Coin.Head;
//	              
//
//	            } else if (choice.equalsIgnoreCase("t")) {
//
//	                guess = Coin.Tail;
//	               
//	            } else {
//
//	                System.out.println("Wrong choice! Try again!");
//
//	                continue;
//
//	            }
//
//	 
//
//	            Coin toss = tossCoin();
//
//	            if (guess == toss) {
//
//	                System.out.println("Congratulations! You won the toss!");
//	               
//	            } else {
//
//	                System.out.println("Sorry! You lost the toss.");
//	                
//	            }
//	            
//	 
//
//	        }
//
//	        scanner.close();
//
//	 
//
//	    }
//
//	 
//
//	    // Flip a coin and return result
//
//	    private Coin tossCoin() {
//
//	        Random r = new Random();
//
//	        int i = r.nextInt(2);
//
//        if (i == 0) {
//        		k++;
//        		System.out.println("Count of head: "+k);
//	            return Coin.Head;
//	            
//	        } else {
//	        	j++;
//	        	System.out.println("Count of tail: "+j);
//	            return Coin.Tail;
//
//	        }

	    }

	 

	}
