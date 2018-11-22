package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class PlayAGame {
public static void main(String[] args)
{
	int stake = Integer.parseInt(args[1]);
	int target = Integer.parseInt(args[2]);
	int trials = Integer.parseInt(args[3]);
	
	Utility utility = new Utility();
	utility.gambling(stake, trials, target);
}
}
