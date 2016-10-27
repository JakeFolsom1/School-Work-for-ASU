import java.util.Scanner;
import java.util.Random;
public class Yahtzeerunrile {

	public static void main(String[] args) {
		int getOuttaLoop = 1;
		//		int rollNumber1, rollNumber2, rollNumber3, rollNumber4, rollNumber5;
		Scanner scan = new Scanner (System.in);
		int playerChecker = 1;
		Random randomNum = new Random();
		do{
			System.out.println("Would you like to play? Type 1 for yes and 2 for no");
			playerChecker = scan.nextInt();
			if (playerChecker == 1)
			{
				System.out.println("Please enter the number of players");
				int numPlayers = 0;
				numPlayers = scan.nextInt();
				switch (numPlayers)
				{
				case 1:
					System.out.println("Please enter your name");
					String player1Name = " ";
					player1Name = scan.next();
					Yahtzee player1 = new Yahtzee (player1Name,0);
					final int MINIMUM = 1;
					for (int zw = 0; zw <= 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + player1.getPlayerName());
						scan.next();
						int[] arrayYahtzee1 = new int[5];
						System.out.println("Your rolls are ");
						for(int i = 0; i <= 4; i++) {
							arrayYahtzee1[i] = MINIMUM + ((int)randomNum.nextInt(6));
							System.out.print(arrayYahtzee1[i] + " ");
						}
						int l = 0;
						int m = 0;
						int u = 0;
						for (int x = 0; x <= 4; x++)
						{
							l = arrayYahtzee1[x];
							//System.out.println(l);
							for (int y = 0; y <= 4; y++)
							{
								m = arrayYahtzee1[y];
								//System.out.println(m);
								if (m == l)
								{
									u++;
								}

							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(player1.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							player1.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(player1.getPlayerName() + " Got three of a kind, that is three points!");
							player1.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(player1.getPlayerName() + " Got two pairs, That is two points!");
							player1.addPoints(2);
						}
						if (u == 1)
						{
							player1.addPoints(1);
							System.out.println(player1.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + player1.getPlayerName() +  "all the values are the same");
							player1.addPoints(10);
						}
					}
					System.out.println("Player " + player1.getPlayerName() + " got " + player1.getPoints() + " points in this game of Yahtzee!");
					playerChecker = 1;
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default: 
					System.out.println("Please enter a value of players from 1-4");
					break;
				}
			}
		} while (playerChecker != 2);
		scan.close();
	}











}