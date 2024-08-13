import java.util.Scanner;
class ATM 
{
private BankAcct account;
public ATM(BankAcct account) 
{
this.account = account;
}
public void displaymenu() 
{
System.out.println("ATM MENU");
System.out.println("1. Withdraw");
System.out.println("2. Deposit");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
}
public void withdraw(double amount) 
{
if (account.getbalance() >= amount) 
{
account.withdraw(amount);
System.out.println("Withdrawal successful. New balance: " + account.getbalance());
} 
else 
{
System.out.println("Insufficient funds.");
}
}
public void deposit(double amount) 
{
account.deposit(amount);
System.out.println("Deposit successful. New balance: " + account.getbalance());
}
public void checkbalance() 
{
System.out.println("Your current balance is: " + account.getbalance());
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
BankAcct account = new BankAcct(1000);         
ATM atm = new ATM(account);
while (true) 
{
atm.displaymenu();
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
switch (choice) 
{
case 1:
System.out.print("Enter amount to withdraw: ");
double withdrawamount = scanner.nextDouble();
atm.withdraw(withdrawamount);
break;
case 2:
System.out.print("Enter amount to deposit: ");
double depositamount = scanner.nextDouble();
atm.deposit(depositamount);
break;
case 3:
atm.checkbalance();
break;
case 4:
System.out.println("Exiting ATM.");
scanner.close();
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
System.out.println();
}
}
}
class BankAcct 
{
private double balance;
public BankAcct(double initialbalance) 
{
this.balance = initialbalance;
}
public void withdraw(double amount) 
{
this.balance -= amount;
}
public void deposit(double amount) 
{
this.balance += amount;
}
public double getbalance() 
{
return balance;
}
}