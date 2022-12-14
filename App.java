import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int option = 0;

		Bank bank=new Bank();

		Scanner input=new Scanner(System.in);
		System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
		System.out.print("Please enter your choice: ");
		option = input.nextInt();
		
		while(option<1 || option>6){
			System.out.println("\nInvalid input, please choose again.");
			System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
			System.out.print("Please enter your choice: ");
			option = input.nextInt();
		}


		while(option==1 || option==2 || option==3 || option==4 || option==5){
				if(option==1){
					Scanner info=new Scanner(System.in);
					System.out.print("\nEnter first name: ");
					String firstN=info.nextLine();

					System.out.print("\nEnter last name: ");
					String lastN=info.nextLine();

					System.out.print("\nEnter social security number: ");
					String socialSec=info.nextLine();

					System.out.print("\nEnter Account Name: ");
					String acctName=info.nextLine();
					bank.addAccount(new Account(new Customer(firstN, lastN, socialSec), acctName));
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}
				if(option==2){
					bank.listAccounts();
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}
				if(option==3){
					System.out.print("Enter account number: ");
					int acctNo=input.nextInt();
					System.out.print("Enter the amount to deposit: ");
					double amount=input.nextDouble();
					bank.depositAccount(acctNo, amount);
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}
				if(option==4){
					System.out.print("Enter account number: ");
					int acctNo=input.nextInt();
					System.out.print("Enter the withdrawal amount: ");
					double amount=input.nextDouble();
					bank.withdrawAccount(acctNo, amount);
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}
				if(option==5){
					System.out.print("Enter account number: ");
					int acctNo=input.nextInt();
					bank.closeAccount(acctNo);
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}

				if(option==6){
					System.exit(0);
				}

				while(option<1 || option>6){
					System.out.println("\nInvalid input, please choose again.");
					System.out.println("\n1 - Open Account \n2 - List Accounts\n3 - Deposit funds\n4 - Withdraw funds\n5 - Close an account\n6 - Exit\n");
					System.out.print("Please enter your choice: ");
					option = input.nextInt();
				}
		}


		
	}	
	

}