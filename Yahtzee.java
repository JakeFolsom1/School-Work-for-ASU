import java.util.Random;
import java.util.Scanner;
public class Yahtzee {
private int rollNumber1;
private int rollNumber2;
private int rollNumber3;
private int rollNumber4;
private int rollNumber5;
private String playerName1;
private int playerPoints;
Yahtzee(String name, int points)
{
playerName1 = name;
playerPoints = points;
}

public void announceValue()
{
System.out.println("The value of the first die is " + rollNumber1);
System.out.println("The value of the second die is " + rollNumber2);
System.out.println("The value of the third die is "  + rollNumber3);
System.out.println("The value of the fourth die is " + rollNumber4);
System.out.println("The value of the fifth die is " + rollNumber5);
}
public String getPlayerName()
{
	return playerName1;
}


/*public void rollDice()
{
	Random randomNum = new Random();
	final int MINIMUM = 1;
	final int MAXIMUM = 1;
	rollNumber1 = MINIMUM + ((int)randomNum.nextInt(6) * MAXIMUM);
	rollNumber2 = MINIMUM + ((int)randomNum.nextInt(6) * MAXIMUM);
	rollNumber3 = MINIMUM + ((int)randomNum.nextInt(6) * MAXIMUM);
	rollNumber4 = MINIMUM + ((int)randomNum.nextInt(6) * MAXIMUM);
	rollNumber5 = MINIMUM + ((int)randomNum.nextInt(6) * MAXIMUM);
	System.out.println("This is a developer message, the value of rollNumber1 is " + rollNumber1);
	System.out.println("This is a developer message, the value of rollNumber2 is " + rollNumber2);					//Work in progress here
	System.out.println("This is a developer message, the value of rollNumber3 is " + rollNumber3);
	System.out.println("This is a developer message, the value of rollNumber4 is " + rollNumber4);
	System.out.println("This is a developer message, the value of rollNumber5 is " + rollNumber5);
	int[] arrayYahtzee1;
	arrayYahtzee1 = new int[5];
	arrayYahtzee1[0] = rollNumber1;
	arrayYahtzee1[1] = rollNumber2;
	arrayYahtzee1[2] = rollNumber3;
	arrayYahtzee1[3] = rollNumber4;
	arrayYahtzee1[4] = rollNumber5;
}

*/

public int getPoints()
{
return playerPoints;
}
public void addPoints(int points)
{
playerPoints += points;
}
}
