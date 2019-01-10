import java.util.Scanner;

class Main

{
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args)
	{
		
		while(true) {
		
		System.out.println("Enter any Number");
		
		int num = sc.nextInt();
		
		System.out.println(IsNumberPrime(num));
		}
		
		
	}
	
	
	public static boolean IsNumberPrime(int num) 
	{
		
		boolean isPrime = false;
		
		if(num % 2 == 1 ) 
		{
			isPrime = true;
		}
		return isPrime;
	}
	
	public static boolean IsNumberEven(int num) 
	{
		return false;
	}
	
	public static boolean IsNumberOdd(int num) 
	{
		return false;
	}
}