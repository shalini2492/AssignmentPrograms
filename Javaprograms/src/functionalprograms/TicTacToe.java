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

}
