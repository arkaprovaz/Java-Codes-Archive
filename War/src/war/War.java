package war;

import java.util.Arrays;
import java.util.Scanner;

public class War {
	public static void main(String args[]) {
            
		Scanner input = new Scanner(System.in);


                       //since there are 11 soldiers and 11 terrrorists according to table
			int[] soldiers_strength = new int[9];
			int[] terrorist_strength = new int[9];

			for (int i = 0; i < terrorist_strength.length; i++) {
				System.out.println("Please enter terrorist " +(i+1) +" strength ");
				terrorist_strength[i] = input.nextInt();
			}

			for (int i = 0; i < soldiers_strength.length; i++) {
				System.out.println("Please enter soldier " +(i+1) + "  strengths ");
				soldiers_strength[i] = input.nextInt();
			}

			for (int i = 0; i < soldiers_strength.length; i++) {
				System.out.println("Soldier " + (i+1) + " strength is " + soldiers_strength[i] + "");
			}
			for (int i = 0; i < terrorist_strength.length; i++) {
				System.out.println("Terrorist " + (i+1) + "strength is " + terrorist_strength[i] + "");
			}
			Arrays.sort(soldiers_strength);
			Arrays.sort(terrorist_strength);

			for (int i = 0; i < soldiers_strength.length; i++) {
				System.out.println("Soldier " + (i+1) + " strength after shuffling is " + soldiers_strength[i] + "");
			}
			for (int i = 0; i < terrorist_strength.length; i++) {
				System.out.println("Terrorist " + (i+1) + " strength after shuffling is " + terrorist_strength[i] + "");
			}
			boolean result = true;
			for (int i = 0; i < 9; i++) {
				if (soldiers_strength[i] > terrorist_strength[i]) {
					result = true;
				} else {
					result = false;
				}
			}
			if (result) {
				System.out.println("\nWIN");
			} else {
				System.out.println("\nLOSE");
			}

		
	}

}
