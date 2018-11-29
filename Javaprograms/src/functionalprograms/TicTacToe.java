/* purpose: To calculate win over loss by taking user inputs in such a way that the inputs should be in line.
 * author: Shalini
 * date: 24/11/2018
 * version: 1.0
 */
package functionalprograms;

import java.util.Scanner;

public class TicTacToe {
	public static int row, col;
	public static Scanner sc=new Scanner(System.in);
	public static char[][] cell=new char[3][3];
	public static char turn='X';
	
public static void main(String[] args)
{
	
	for(int i=0; i < 3; i++)
	{
		for(int j=0; j < 3; j++)
		{
			cell[i][j] = '_';
		}
	}
	play();
	
}
public static void printCell()                   //display the matrix
{
	for(int i=0; i < 3; i++)
	{
		System.out.println();              
		 for(int j=0; j < 3; j++)
		 {
			 if(j == 0)
				 System.out.print("| ");
			 System.out.print(cell[i][j] + " | ");
		 }
	}
	System.out.println();
}
public static void play()
{
	boolean isPlay=true;
	printCell();
    while(isPlay)
    {
    	for(int k=0; k<9; k++)
    	{
    	System.out.println("Please enter row and column");
    	row = sc.nextInt();
    	col = sc.nextInt();                        //user input row and column for inserting X
        cell[row][col] = turn;                     //switch turn from 0 to X
        if(gameOver(row,col))
     	{
     		isPlay = false;
     		System.out.println("Game Over! Player " +turn + " wins");
     	}
    	printCell();
    	if(turn == 'X')
    		turn = 'O';
    	else
    		turn = 'X';
    	//gameOver(row, col);
    	}
    	 
    }
}

public static boolean gameOver(int cMove, int rMove)
{
	if (cell[0][cMove] == cell[1][cMove] && cell[0][cMove] == cell[2][cMove])
		return true;
	if (cell[0][rMove] == cell[1][rMove] && cell[0][rMove] == cell[2][rMove])//checking for perpendicular victory
		return true;
	if (cell[0][0] == cell[1][1] && cell[0][0] == cell[2][2] && cell[1][1] != '_')
		return true;                                    //checking for diagonal victory
	if (cell[0][2] == cell[1][1] && cell[0][2] == cell[2][0] && cell[1][1] != '_')
		return true;
	return false;
}
/*	String[] cell= new String[9];
	String turn;
	Utility utility=new Utility();
	
	turn = "X";
	String winner = null;
	
	utility.populateEmptyCell();

	System.out.println("Welcome to Game of Tic Tac Toe.");
	System.out.println("--------------------------------");
	utility.printCell();
	System.out.println("X's will play first. Enter a cell number to place X in:");

	while (winner == null) 
	{
		int numInput;
		try 
		{
			numInput = utility.inputInteger();
			if (!(numInput > 0 && numInput <= 9)) 
			{
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("Invalid input; re-enter slot number:");
			continue;
		}
		if (cell[numInput-1].equals(String.valueOf(numInput)))
		{
			cell[numInput-1] = turn;
			if (turn.equals("X")) 
			{
				turn = "O";
			} 
			else 
			{
				turn = "X";
			}
			utility.printCell();
			winner = checkWinner();
		} 
		else 
		{
			System.out.println("Cell already taken, re-enter cell number:");
			continue;
		}
	}
	if (winner.equalsIgnoreCase("draw")) 
	{
		System.out.println("It's a draw! Thanks for playing.");
	} 
	else 
	{
		System.out.println("Congratulations! " + winner + " have won! Thanks for playing.");
	}
}

static String checkWinner() 
{
	String[] cell = new String[9];
	String turn ="X";
	for (int a = 0; a < 8; a++) 
	{
		String line = null;
		switch (a) 
		{
		case 0:
			line = cell[0] + cell[1] + cell[2];
			break;
		case 1:
			line = cell[3] + cell[4] + cell[5];
			break;
		case 2:
			line = cell[6] + cell[7] + cell[8];
			break;
		case 3:
			line = cell[0] + cell[3] + cell[6];
			break;
		case 4:
			line = cell[1] + cell[4] + cell[7];
			break;
		case 5:
			line = cell[2] + cell[5] + cell[8];
			break;
		case 6:
			line = cell[0] + cell[4] + cell[8];
			break;
		case 7:
			line = cell[2] + cell[4] + cell[6];
			break;
		}
		if (line.equals("XXX")) 
		{
			return "X";
		} 
		else if (line.equals("OOO")) 
		{
			return "O";
		}
	}

	for (int a = 0; a < 9; a++) 
	{
		if (Arrays.asList(cell).contains(String.valueOf(a+1))) 
		{
			break;
		}
		else if (a == 8) return "draw";
	}

	System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
	return null;
}

*/
}
