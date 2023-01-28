package atm;

import java.util.Scanner;
//import java.time.LocalDate;
class AccountHolder
{
	Scanner sc=new Scanner(System.in);
	String name,add;
	int dob;
	public void idetification()
	{
   System.out.println("Enter the name of Account Holder");
   name=sc.next();
   System.out.println("Enter Address of Account Holder");
   add=sc.next();
   System.out.println("Enter Date of birth of account holder");
   dob=sc.nextInt();
	}
   
}

class Account
{
	int accNo,IFSC,bcode;
	Scanner sc=new Scanner(System.in);
	public void details()
	{
	System.out.println("Enter Account number of given Account holder");
	accNo=sc.nextInt();
	System.out.println("Enter Account IFSC Code");
	IFSC=sc.nextInt();
	System.out.println("Enter Branch code of account");
	bcode=sc.nextInt();
	
	}
}

class BankTransaction
{
	Scanner sc=new Scanner(System.in);
	int deposit_amt,withdraw_amt,balance;
	public void transactions()
	{
		System.out.println("Enter amount that u want to deposit in Bank");
		deposit_amt=sc.nextInt();
		System.out.println("Enter amount that u want to withdrawl");
		withdraw_amt=sc.nextInt();
	}
	public void Balance()
	{
		balance=deposit_amt-withdraw_amt;
		System.out.println("Balance in Account is:"+balance);
	}
	
}

class Bank
{
	String bname,branch,badd;
	int code;
	Scanner sc=new Scanner(System.in);
	public void bank_details()
	{
		System.out.println("Enter Name of Bank");
		bname=sc.next();
		System.out.println("Enter Branch of Bank");
		branch=sc.next();
		System.out.println("Enter Address of Bank");
		badd=sc.next();
		
	}
}



public class ATMInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int withdraw = 0,deposit = 0;
		Scanner sc=new Scanner(System.in);
		BankTransaction b1=new BankTransaction();
		AccountHolder a1=new AccountHolder();
		int bal=100000;
		Account a=new Account();
		
		while(true)
		{
			System.out.println("ATM Machine");
			System.out.println("choose 1 for Withdraw");
			System.out.println("choose 2 for Deposit");
			System.out.println("choose 3 for Transaction History");
			System.out.println("choose 4 for Transfer");
			System.out.println("choose 5 for Quit");
			
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				a1.idetification();
				
				System.out.println("Enter Money to be Withdrawn");
				withdraw=sc.nextInt();
				
				
				if(bal>=withdraw)
				{
					bal=bal-withdraw;
					System.out.println("Please Collect your cash");
				}
				else
				{
					System.out.println("Insufficient Balance");
					
				}
				System.out.println("");
				break;
				
			case 2:
				System.out.println("Enter Money to be Deposited");
				deposit=sc.nextInt();
				
				bal=bal+deposit;
				System.out.println("Your money has been successfully Deposited in Your Account");
				System.out.println(" ");
				break;
				
		   case 3:
			   System.out.println("Transaction History");
			   System.out.println("Deposited Amount"+deposit);
			   System.out.println("Withdrwal Amount"+withdraw);
			   System.out.println(" ");
			   break;
			   
		   case 4:
			   System.out.println("Enter Account Details that u want to tranfer Money");
			   a.details();
			   System.out.println(" ");
			   break;
			   
		   case 5:
			   System.exit(0);
			   
		 
			}
		}
 
	}

}
