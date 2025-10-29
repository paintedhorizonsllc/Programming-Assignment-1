package package1;
import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		double total_value = 0.0;
		String code; 
		int pennies_counter = 0,
				Nickels_counter = 0,
				Dimes_counter = 0,
				Quarters_counter = 0,
				Unknowncoins_counter = 0;

		System.out.println("Enter the coin code: ");
		code = input.nextLine();
		while(!code.equalsIgnoreCase("x"))//Not Necessary
		{
			pennies_counter = 0;
			Nickels_counter = 0;
			Dimes_counter = 0;
			Quarters_counter = 0;
			Unknowncoins_counter = 0;
			total_value = 0.0;
			for (int coin = 0; coin < code.length(); coin++) 
			{
				char copy = code.charAt(coin);
				if (!Character.isLetter(copy))
				{
					coin++;
					continue;
				}
				if ( copy == 'p'||copy == 'P') 
				{
					pennies_counter++;
					total_value += 0.01;
				}

				else if ( copy == 'n'||copy == 'N') 
				{
					Nickels_counter++;
					total_value += 0.05;
				}

				else if ( copy == 'd'||copy == 'D')
				{
					Dimes_counter++;
					total_value += 0.10;
				}

				else if ( copy == 'q'||copy == 'Q')
				{
					Quarters_counter++;
					total_value += 0.25;
				}

				else
				{
					Unknowncoins_counter++;
				}
				coin++;

				if (Unknowncoins_counter >= 10)
				{
					System.out.println("Too many unidentified coins. Program ending.");
					System.out.println("Thank you for using my app, see u soon!");
					input.close();
					return;
				}
			} 

			System.out.println("Coin counts: ");
			System.out.println("---------------");
			System.out.printf("pennies:%d \n", pennies_counter);
			System.out.printf("Nickels:%d \n" , Nickels_counter);
			System.out.printf("Dimes:%d \n", Dimes_counter);
			System.out.printf("Quarters:%d \n", Quarters_counter);
			System.out.println("---------------");

			System.out.printf("TOTAL VALUE: $%.2f \n" , total_value);
			System.out.printf("Number of unidentified coins:%d \n\n" , Unknowncoins_counter);


			System.out.println("Enter the coin code: ");
			code = input.nextLine();
		}
		System.out.println("Thank you for using my app, see u soon");
		input.close();
	}

}
