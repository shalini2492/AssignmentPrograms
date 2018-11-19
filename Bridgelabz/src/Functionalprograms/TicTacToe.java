package Functionalprograms;

import Utility.Utility;
public class TicTacToe {
public static void main(String[] args)
{
	int row, column, x;
	Utility utility = new Utility();
	System.out.println("Enter the row in matrix for input X");
    row = utility.inputInteger();
    System.out.println("Enter the column in matrix for input X");
    column = utility.inputInteger();
    int[][] a = new int[row][column];
    System.out.println("Enter input");
    x = utility.inputInteger();
    utility.playGame(x);
}
}
