import java.util.Random;
import java.util.*;
class Companies
{
	Random rand=new Random();
	Scanner sc=new Scanner(System.in);
	int amount,invest,total;
	String name;
	void details(String s,int a)
	{
		this.amount=a;
		this.name=s;
	}
	void display()
	{
		System.out.println("Your name is : "+name+"\nYour amount in the Trading platform  is : "+amount);
	}
	void companies()
	{
		System.out.println("The stock  prices of the companys are: \n1=>Apple \n2=>Google\n3=>Amazon\n4=>Facebook\n5=>Tesla\n6=>Samsung\n7=>Exit");
		
	}
	void buystocks(int amount)
	{
		double totalprice;
	}
	void block(int option)
	{
		
	}
	
}








class StockTrading 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Companies ob=new Companies();
		Random rand=new Random();
		int amount,invest,total=0;
		String name;
		System.out.println("Enter the USER Name : ");
		name=sc.nextLine();
		System.out.println("Add the amount into your Trading platform :");
		amount=sc.nextInt();
		ob.details(name,amount);
		ob.display();		
		boolean run=true;
		while (run) {
			ob.companies();  
			System.out.println("Enter the option between 1 to 7: ");
			int option = sc.nextInt();

			switch (option) {
				case 1:
					System.out.println("Enter amount to invest into the Apple company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest; 
						amount -= invest;
						System.out.println("Invested in Apple. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 2:
					System.out.println("Enter amount to invest into the Google company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest;
						amount -= invest;
						System.out.println("Invested in Google. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 3:
					System.out.println("Enter amount to invest into the Amazon company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest;
						amount -= invest;
						System.out.println("Invested in Amazon. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 4:
					System.out.println("Enter amount to invest into the Facebook company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest;
						amount -= invest;
						System.out.println("Invested in Facebook. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 5:
					System.out.println("Enter amount to invest into the Tesla company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest;
						amount -= invest;
						System.out.println("Invested in Tesla. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 6:
					System.out.println("Enter amount to invest into the Samsung company");
					invest = sc.nextInt();
					if (invest <= amount) {
						total += rand.nextInt(100) * invest;
						amount -= invest;
						System.out.println("Invested in Samsung. Remaining balance: " + amount);
					} else {
						System.out.println("Insufficient balance.");
					}
					break;
				case 7:
					System.out.println("Exiting.....");
					run = false;
					break;
				default:
					System.out.println("Invalid option. Try again.");
					break;
			}

			
			if (option != 7) {
				System.out.println("The total amount you won in the stocks are: " + total);
				System.out.println("Your current balance is: " + total);
				System.out.println("Enter 1 to invest again or 2 to exit.");
				int nextAction = sc.nextInt();
				if (nextAction == 2) {
					run = false;
				}
			}
		}
		System.out.println("Final balance: " + amount);
        System.out.println("Total profit/loss: " + total);
        System.out.println("Thank you for using the Stock Trading platform!");
	}
}
