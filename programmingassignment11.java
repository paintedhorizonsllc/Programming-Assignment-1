package package1;
import java.util.Scanner;
import java.util.Scanner;

public class programmingassignment11 {

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
		
		while (doneProcessingRequest == false) //start loop
		{
			System.out.println("Enter your PIN please:");
			PIN = input.next();
			
			if (PIN.length() <= 1 || !PIN.matches("\\d+")) //if Pin numbers not whole numbers. If a PIN number is less than 1, the program stops.
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
				okayToProcessRequest = true;
				System.out.println("Enter the amount to be withdrawn:");
				WithdrawnAmount = input.nextInt();

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
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				doneProcessingRequest = false;//start again
			}
		}
		
		
		
		
		
		
		
	}

}
