package Functionalprograms;

import java.util.*;
import Utility.Utility;

public class PlayAGame {
public static void main(String[] args)
{
	int stake = Integer.parseInt(args[0]);
	int target = Integer.parseInt(args[1]);
	int trials = Integer.parseInt(args[2]);
	
	Utility utility = new Utility();
	utility.gambling(stake, trials, target);
}
}
