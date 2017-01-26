public class AllArithematic 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 90;
		int c = a+b;
		//Sum
		System.out.println("Sum of "+a+" and "+b+" is:"+c);
		// Difference 
		c=b-a;
		System.out.println("difference between "+b+" and "+a+" is:"+c);
		// Multiplication
		c=b*a;
		System.out.println("Product of "+b+" and "+a+" is:"+c);
		// Division
		c=b/a;
		System.out.println("Division of "+b+" by "+a+" is:"+c);
		// Increment
		c=b++;
		System.out.println("Increment of "+b+" is:"+c);
		// Decrement
		c=b--;
		System.out.println("Decrement of "+b+" is:"+c);
	}
}
