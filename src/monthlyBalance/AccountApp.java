package monthlyBalance;

public class AccountApp {

	public static void main(String[] args) {
		
		Console.displayLine("Welcome to the Account Calculator");
		
		//create checking account object
        CheckingAccount c = new CheckingAccount();
		
		//show starting balance
        Console.displayLine("Starting Balance" + "\n" + "Checking: " + c.getBalanceFormatted() + "\n");

        //declare variables
        String choice = "y";
        String selection = "";
        double userInput = 0;       
        
		while(choice.equalsIgnoreCase("y")) {
			
        	//ask user if wants to create employer or customer account
			selection = Console.getString("Withdrawal or Deposit (w/d)? \n");
        	
        	if(selection.equalsIgnoreCase("w")){
        		userInput = Console.getDouble("Please enter amount:\n");
        		
        		if(userInput > c.getBalance()) {
        			Console.displayLine("The amount insert is bigger than your balance");
        			
        		}else{
        			Transaction.withdraw(c, userInput);//withdraw transaction
        			
        		}        		
        		
        	}else if(selection.equalsIgnoreCase("d")){
        		userInput = Console.getDouble("Please enter amount:\n");
        		
        		if(userInput > 10000){      			
        			Console.displayLine("Max Deposit allowed is 10000");
        			
        		}else{
        			Transaction.deposit(c, userInput);//deposit transaction   
        			
        		}
        		
        	}else{
        		Console.displayLine("Please select Withdrawal or Deposit (w/d):");
				continue;
				
        	}
        	
        	//ask user if wants to continue
			choice = Console.getString("Do you want to continue? (y/n) \n");
        }
		
        
        Console.displayLine("Monthly Fees");
        Console.displayLine("Checkin Fee: " +  c.getMontlyFeeFormatted() + "\n");
        c.subtractMontlyFee();

	}

}
