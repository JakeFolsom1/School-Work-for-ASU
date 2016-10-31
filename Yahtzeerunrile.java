import java.util.Scanner;
import java.util.Random;
public class Yahtzeerunrile {

	public static void main(String[] args) {
		int getOuttaLoop = 1;
		final int MINIMUM = 1;
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
					String playerName = " ";
					playerName = scan.next();
					Yahtzee player = new Yahtzee (playerName,0);
					for (int zw = 0; zw < 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + player.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(player.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							player.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(player.getPlayerName() + " Got three of a kind, that is three points!");
							player.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(player.getPlayerName() + " Got two pairs, That is two points!");
							player.addPoints(2);
						}
						if (u == 1)
						{
							player.addPoints(1);
							System.out.println(player.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + player.getPlayerName() +  "all the values are the same");
							player.addPoints(10);
						}
					}
					System.out.println("Player " + player.getPlayerName() + " got " + player.getPoints() + " points in this game of Yahtzee!");
					playerChecker = 1;
					break;
				case 2:
					System.out.println("Player 1 please enter your name");
					String playerplayer = " ";
					playerplayer = scan.next();
					Yahtzee p12 = new Yahtzee (playerplayer,0);
					for (int zw = 0; zw < 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + p12.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(p12.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							p12.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(p12.getPlayerName() + " Got three of a kind, that is three points!");
							p12.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(p12.getPlayerName() + " Got two pairs, That is two points!");
							p12.addPoints(2);
						}
						if (u == 1)
						{
							p12.addPoints(1);
							System.out.println(p12.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + p12.getPlayerName() +  "all the values are the same");
							p12.addPoints(10);
						}

					}
					System.out.println("Player 2 please enter your name");
					String player2player = " ";
					playerplayer = scan.next();
					Yahtzee p22 = new Yahtzee (player2player,0);
					for (int zw = 0; zw < 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + p22.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(p22.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							p22.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(p22.getPlayerName() + " Got three of a kind, that is three points!");
							p22.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(p22.getPlayerName() + " Got two pairs, That is two points!");
							p22.addPoints(2);
						}
						if (u == 1)
						{
							p22.addPoints(1);
							System.out.println(p22.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + p22.getPlayerName() +  "all the values are the same");
							p22.addPoints(10);
						}
					}
					System.out.println("Player " + p12.getPlayerName() + " got " + p12.getPoints() + " points in this game of Yahtzee!");
					System.out.println("Player " + p22.getPlayerName() + " got " + p22.getPoints() + " points in this game of Yahtzee!");
					playerChecker = 1;
					if (p12.getPoints() > p22.getPoints())
						System.out.println("The winner of this game of Yahtzee is " + p12.getPlayerName());
					else if (p12.getPoints() == p22.getPoints())
						System.out.println("There was a tie between " + p12.getPlayerName() + " and " + p22.getPlayerName());
					else
						System.out.println("The winner of this game of Yahtzee is " + p22.getPlayerName());
					break;
				case 3:
					System.out.println("Player 1 please enter your name");
					String playername1 = " ";
					playerplayer = scan.next();
					Yahtzee p13 = new Yahtzee (playername1,0);
					for (int zw = 0; zw < 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + p13.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(p13.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							p13.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(p13.getPlayerName() + " Got three of a kind, that is three points!");
							p13.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(p13.getPlayerName() + " Got two pairs, That is two points!");
							p13.addPoints(2);
						}
						if (u == 1)
						{
							p13.addPoints(1);
							System.out.println(p13.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + p13.getPlayerName() +  "all the values are the same");
							p13.addPoints(10);
						}
					}
					System.out.println("Player 2 please enter your name");
					String playername21 = " ";
					playerplayer = scan.next();
					Yahtzee p23 = new Yahtzee (playername21,0);
					for (int zw = 0; zw < 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + p23.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(p23.getPlayerName() + "Got 4 of a kind! Wow!, that is 4 points!");
							p23.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(p23.getPlayerName() + " Got three of a kind, that is three points!");
							p23.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(p23.getPlayerName() + " Got two pairs, That is two points!");
							p23.addPoints(2);
						}
						if (u == 1)
						{
							p23.addPoints(1);
							System.out.println(p23.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard," + p23.getPlayerName() +  "all the values are the same");
							p23.addPoints(10);
						}
					}
					System.out.println("Player 3 please enter your name");
					String playername33 = " ";
					playerplayer = scan.next();
					Yahtzee p33 = new Yahtzee (playername33,0);
					for (int zw = 0; zw <= 13; zw++ )
					{
						System.out.println("\n" + "Type in any key to roll the dice for " + p33.getPlayerName());
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
									u++;
							}
						}
						u = u - 6;
						System.out.println("\n" + "Developer message here, the current value of u is " + u);
						if (u == 11)
						{
							System.out.println(p33.getPlayerName() + " Got 4 of a kind! Wow!, that is 4 points!");
							p33.addPoints(8);
						}
						if (u == 5)
						{
							System.out.println(p33.getPlayerName() + " Got three of a kind, that is three points!");
							p33.addPoints(6);
						}
						if (u == 3)
						{
							System.out.println(p33.getPlayerName() + " Got two pairs, That is two points!");
							p33.addPoints(2);
						}
						if (u == 1)
						{
							p33.addPoints(1);
							System.out.println(p33.getPlayerName() + " Got one pair, that is one point!");
						}
						if (u == 19)
						{
							System.out.println("You lucky bastard, " + p33.getPlayerName() +  " all the values are the same");
							p33.addPoints(10);
						}
					}
					if ((p33.getPoints() > p23.getPoints()) && (p33.getPoints() > p13.getPoints()))
						System.out.println(p33.getPlayerName() + " Has won this game of Yahtzee");
					else if ((p23.getPoints() > p33.getPoints()) && (p23.getPoints() > p13.getPoints()))
						System.out.println(p23.getPlayerName() + " Has won this game of Yahtzee");
					else if ((p13.getPoints() > p23.getPoints()) && (p13.getPoints() > p33.getPoints()))
						System.out.println(p13.getPlayerName() + " Has won this game of Yahtzee");
					else if ((p13.getPoints() == p23.getPoints()) && (p13.getPoints() == p33.getPoints()))
						System.out.println("It is a tie between players " + p13.getPlayerName() + p23.getPlayerName() + p33.getPlayerName());
					else if ((p13.getPoints() == p23.getPoints()) && (p13.getPoints() != p33.getPoints()))
							System.out.println("It is a tie between players " + p13.getPlayerName() + p23.getPlayerName());
					else if ((p23.getPoints() == p13.getPoints()) && (p13.getPoints() != p33.getPoints()))
							System.out.println("It is a tie between players " + p23.getPlayerName() + p13.getPlayerName());
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