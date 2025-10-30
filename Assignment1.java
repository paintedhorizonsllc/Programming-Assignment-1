package Package2;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);

		String PIN;
		int ten_counter = 0,
				five_counter = 0,
				one_counter = 0;
		int WithdrawnAmount = 0;
		char surchargeResponse;
		boolean doneProcessingRequest = false;
		boolean okayToProcessRequest = false;

		while (doneProcessingRequest == false) 
		{
			System.out.println("Enter your PIN please:");
			PIN = input.next();

			if (PIN.length() <= 1 || !PIN.matches("\\d+")) 
			{
				System.out.println("Invalid PIN. The program will terminate!");
				return;
			} 
			else 
			{
				doneProcessingRequest = true;
			}
			while(doneProcessingRequest == true)
			{
				System.out.println("Enter the amount to be withdrawn:");
				WithdrawnAmount = input.nextInt();
				okayToProcessRequest = true;

				if (WithdrawnAmount < 1||WithdrawnAmount > 500)
				{
					System.out.printf("Invalid amount: %d\n", WithdrawnAmount);
					okayToProcessRequest = false;
				}
				if (okayToProcessRequest == false)
				{
					System.out.println("Enter the amount to be withdrawn:");
					WithdrawnAmount = input.nextInt();
				}

				int amountCopy = WithdrawnAmount;
				ten_counter = amountCopy / 10;
				amountCopy %= 10;
				five_counter = amountCopy / 5;
				one_counter = amountCopy % 5;

				if (Integer.parseInt(PIN) % 2 == 0)
				{
					if (WithdrawnAmount % 5 == 0)
					{
						System.out.printf("You requested: $%d\n", WithdrawnAmount);
						System.out.printf("You are receiving the following bills:\n");
						System.out.printf("Number of $10 bills: %d\n", ten_counter);
						System.out.printf("Number of $5 bills: %d\n", five_counter);
						System.out.printf("Number of $1 bills: %d\n", one_counter);
					}
					else
					{
						System.out.printf("You are a type 2 customer, but the amount you requested was %d.\n"
								+ "You will be charged $1 for changing your default setting.\n"
								+ "Do you want to be charged $1? (Y/N)", WithdrawnAmount);

						surchargeResponse = input.next().charAt(0);

						if (surchargeResponse == 'y'||surchargeResponse == 'Y')
						{
							System.out.printf("You requested: $%d\n", WithdrawnAmount);
							System.out.printf("You have been charged $1.");
							System.out.printf("You are receiving the following bills:\n");
							System.out.printf("Number of $10 bills: %d\n", ten_counter);
							System.out.printf("Number of $5 bills: %d\n", five_counter);
							System.out.printf("Number of $1 bills: %d\n", one_counter - 1);
						}
						else if (surchargeResponse == 'n'||surchargeResponse == 'N')
						{
							System.out.println("Transaction canceled. Please enter another amount.");
							continue;
						}
						else
						{
							System.out.println("please enter (Y/N)\n");
							surchargeResponse = input.next().charAt(0);
						}			
					}
				}
				else
				{
					System.out.printf("You requested: $%d\n", WithdrawnAmount);
					System.out.printf("You are receiving the following bills:\n");
					System.out.printf("Number of $10 bills: %d\n", ten_counter);
					System.out.printf("Number of $5 bills: %d\n", five_counter);
					System.out.printf("Number of $1 bills: %d\n", one_counter);
				}
				doneProcessingRequest = false;
			}
		}
		input.close();
	}
}
