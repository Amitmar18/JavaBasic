
public class ForLoopExcercise 
{
	public static void main(String[] args)
	{
		//Print 10 even Numbers
		int b =2;
		System.out.println("****Ten Even Numbers are:*****");
		for(int i = 0;i<10;i++)
		{
			
			System.out.println(b);
			b=b+2;
		}
		//Print 10 ODD Numbers
		System.out.println("*****Ten ODD Numbers are:****");
		 b =1;
		for(int i = 0;i<10;i++)
		{
			//Print 10 even Numbers
			System.out.println(b);
			b=b+2;
		}
		//Factorial of number
		System.out.println("*****factorial of numbers 1 thru 10******");
		int fact=1;
		for(int i = 1;i<=10;i++)
		{
			fact=fact*i;
			System.out.println(i+"! = "+fact);
		}
		//Generate Table of 10 
		b =10;
		System.out.println("****Table of 10******");
		for(int i =1;i<=10;i++)
		{
			b =10;
			int c=b*i;
			System.out.println(b+"*"+i+"="+c);
		}
		//Sum of digits 
		b =10;
		System.out.println("****Sum of digits for 11 thru 20******");
		for(int i =11;i<=20;i++)
		{
			b =i/10;
			b=b*i;
			System.out.println(b+"*"+i+"="+b);
		}		
	}
}
