import java.util.Random;

public class Mygame {

	public static void main(String[] args) {
		Random rn = new Random();
		int randomNum;
		int randomNum2;
		int randomNum3;
		int randomNum4;
		int randomNum5;
		int MINIMUM = 1;
		int MAXIMUM = 6;
		double randomNumber1;
		randomNum = MINIMUM + (int)(Math.random() * MAXIMUM); 
		randomNum2 = MINIMUM + (int)(Math.random()* MAXIMUM);
		randomNum3 = MINIMUM + (int)(Math.random()* MAXIMUM);
		randomNum4 = MINIMUM + (int)(Math.random()* MAXIMUM);
		randomNum5 = MINIMUM + (int)(Math.random()* MAXIMUM);
		switch (randomNum)
		{
		case 1: System.out.println("⚀");
		break;
		case 2: System.out.println("⚁");
		break;
		case 3: System.out.println("⚂");
		break;
		case 4: System.out.println("⚃");
		break;
		case 5: System.out.println("⚄");
		break;
		case 6: System.out.println("⚅");
		break;
		default: System.out.println("Value failed");
		}
		switch (randomNum2)
		{
		case 1: System.out.println("⚀");
		break;
		case 2: System.out.println("⚁");
		break;
		case 3: System.out.println("⚂");
		break;
		case 4: System.out.println("⚃");
		break;
		case 5: System.out.println("⚄");
		break;
		case 6: System.out.println("⚅");
		break;
		default: System.out.println("Value failed");
		}
		switch (randomNum3)
		{
		case 1: System.out.println("⚀");
		break;
		case 2: System.out.println("⚁");
		break;
		case 3: System.out.println("⚂");
		break;
		case 4: System.out.println("⚃");
		break;
		case 5: System.out.println("⚄");
		break;
		case 6: System.out.println("⚅");
		break;
		default: System.out.println("Value failed");
		}
		switch (randomNum4)
		{
		case 1: System.out.println("⚀");
		break;
		case 2: System.out.println("⚁");
		break;
		case 3: System.out.println("⚂");
		break;
		case 4: System.out.println("⚃");
		break;
		case 5: System.out.println("⚄");
		break;
		case 6: System.out.println("⚅");
		break;
		default: System.out.println("Value failed");
		}
		switch (randomNum5)
		{
		case 1: System.out.println("⚀");
		break;
		case 2: System.out.println("⚁");
		break;
		case 3: System.out.println("⚂");
		break;
		case 4: System.out.println("⚃");
		break;
		case 5: System.out.println("⚄");
		break;
		case 6: System.out.println("⚅");
		break;
		default: System.out.println("Value failed");
		}
		if (randomNum == randomNum2 || randomNum == randomNum3 || randomNum == randomNum4 || randomNum == randomNum5 || randomNum2 == randomNum3 || randomNum2 == randomNum4 || randomNum2 == randomNum5 || randomNum3 == randomNum4 || randomNum3 == randomNum5 || randomNum4 == randomNum5)
		{
		System.out.println("Two of a kind!");
		} 
		if (randomNum == randomNum2 && randomNum == randomNum3 || randomNum == randomNum2 && randomNum == randomNum3 || randomNum == randomNum2 && randomNum == randomNum4 || randomNum == randomNum2 && randomNum == randomNum5 || randomNum == randomNum3 && randomNum == randomNum2 || randomNum == randomNum3 && randomNum == randomNum4 || randomNum == randomNum3 && randomNum == randomNum5)
		{
		System.out.println("Three of a kind!");
		}
		}
	}
