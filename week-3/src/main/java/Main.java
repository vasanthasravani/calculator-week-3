import java.util.*;
public class Main {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("*****CALCULATOR******");
	System.out.println("Enter Number1: ");
	int a=sc.nextInt();
	System.out.println("Enter Number2: ");
	int b=sc.nextInt();
	System.out.println("Enter your Choice: ");
	Addition add=new Addition();
	System.out.println("1. Addition");
	Subtract sub=new Subtract();
	System.out.println("2. Subtract Number2 from Number1.");
	Multiply mul=new Multiply();
	System.out.println("3. Multiply");
	Divide div=new Divide();
	System.out.println("4. Divide Number1 with Number2.");
	int k=sc.nextInt();
	int value;
	if(k==1)
	{
		value=add.Calculate(a,b);
		System.out.println("Sum of Number1 and Number2 is: "+value);
	}
	else if(k==2)
	{
		value=sub.Calculate(a,b);
		System.out.println("Difference between Number1 and Number2 is: "+value);
	}
		
	else if(k==3)
	{
		value=mul.Calculate(a,b);
		System.out.println("product of Number1 and Number2 is: "+value);
	}
	else if(k==4)
	{
		value=div.Calculate(a,b);
		System.out.println("Quotient when Number1 is divided by Number2 is: "+value);
	}
	sc.close();
}
}
