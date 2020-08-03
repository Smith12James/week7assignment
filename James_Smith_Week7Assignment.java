// James Smith 18, 186
// This program randomizes team scores to mimic a season of basketball for unknown teams with unknown statistics

import java.util.Scanner;
// import java.util.Arrays;
import java.util.Random;

public class James_Smith_Week7Assignment {
	
	public static void main(String[] args) {
		
		String introduction = "Basketball Team Randomized Season Scores";
		String border = "----------------------------------------------------------------";
		int teams;
		int games;
		int topSpot = 0;
		int high = 0;
		
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println(border + "\n" + introduction + "\n" + border);
		
		System.out.print("Enter the number of teams: ");
		teams = input.nextInt();
		teams = teams + 1;
		System.out.print("Enter the number of games: ");
		games = input.nextInt();
		games = games + 1;
		input.close();
		
		System.out.println(border);
		System.out.print("Team\tScores");
		
		for (int i = 3; i < games; i++) {
			
			System.out.print("   ");
			
		}
		
		System.out.print("\tTot\tAvg\n");
		
		int [][] scores = new int[teams][games];
		int [][] top = new int[teams][2];
		
		for (int i = 0; i < teams; i++) {
			
			scores[i][0] = i + 1;
			
		}
		
		//this for loop is used to randomize the scores, I used a for loop to limit the amount of numbers created
		
		for (int i = 0; i < teams - 1; i++) {
			// System.out.println("\n" +i+"\n");
			for (int j = 1; j < games; j++) {
				
				scores[i][j] = rand.nextInt(99 - 40 + 1) + 40;
				 // System.out.println(scores[i][j]);
				
			}
			
		}
		
		System.out.println(border);
		
		score(scores, teams, games, top);
		
		System.out.println(border);
		
		// this for loop is used to find the biggest number in the total array
		
		for(int i = 0; i < teams; i++) {
			
			if (top[i][1] > high) {
				
				high = top[i][1];
				topSpot = i;
				
			}
			
		}
		
		System.out.printf("Top Team: Team %d", top[topSpot][0]);
		// System.out.print(Arrays.deepToString(scores));
		
	}
	
	private static void score(int [][] arr, int x, int y, int topArr[][]) {
		
		for (int i = 0; i < x; i++) {
			
			topArr[i][0] = i + 1;
			
		}
		
		for (int i = 0; i < x - 1; i++) {
			
			int tot = 0;
			int avg = 0;
			
			for (int j = 0; j < y; j++) {
				
				if (j == 0) {
					
					System.out.print(arr[i][0]+ ": \t");
					
				} else {
					
				System.out.print(arr[i][j] + " ");
				tot = arr[i][j] + tot;
				topArr[i][1] = tot;
				avg = tot / y;
				
				}
				
				
				
			}
			
			System.out.print("\t" + tot);
			System.out.println("\t" + avg);
			
		}
		
	}

}