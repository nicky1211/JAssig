import java.util.*;
import java.io.*;

class BankAccount{
	
	String ownerName;
	String accNumber;
	double balance;

	BankAccount (String name, String number, double amount){

		this.ownerName = name;
		this.accNumber = number;
		// These need to be tested later
		if (amount >= 0) {
			balance = amount;
		}
		else
			System.out.println("The Amount you have entered is not correct. Please try again");
	}

	public double deposit (double amount){
		if (amount > 0) {
			this.balance += amount;
		}
		else
			System.out.println("The Amount you have entered is not correct. Please try again");

		return balance;
	}

	public double withdraw (double amount){

		if (amount > 0 && amount < balance){
			this.balance -= amount;
		}
		else
			System.out.println("Balance is not sufficient or the amount entered is invalid");

		return balance;

	}

	// public void display ()
	// {
	// 	System.out.println ("NAME :  " +ownerName);
	// 	System.out.println ("BALANCE :  " +balance);
	// }

	static BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));


	public static void main(String[] args) throws IOException{


		System.out.print("Please enter an account number: ");
		Scanner input1 = new Scanner(System.in);
   		String accNo = input1.nextLine();


		System.out.print("Please enter the owner's name: ");
		Scanner input2 = new Scanner(System.in);
   		String name = input2.nextLine();

		System.out.print("Please enter the balance: ");
		Scanner input3 = new Scanner(System.in);

		// int blns = Integer.parseInt(input3.nextLine());
		// System.out.print(blns);
		int blns =Integer.parseInt(Br.readLine());

		BankAccount acc = new BankAccount(name, accNo, blns);
		
		assert(acc.withdraw(5) == (blns - 5)) : "Test to withdraw failed";

		assert(acc.deposit(10) == (blns - 5 + 10)) : "Deposit test failed" ;
		
	}
}