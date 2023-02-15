package day07;

public class Program04 {

	public static void main(String[] args) {
		int a=100;
		int b=1000;
        int c=100;
		System.out.println("Start Program...!");

		if((a>b)&&(b<c))
		{
			System.out.println("a is greater..!");
			
		}

		else if((a<b)&&(c>b))
		{
			System.out.println("b is greater..!");
			
		}
			
		else if((b<a)&&(c>a))
		{
			System.out.println("b is greater..!");
			
		}
		else if((a<b)&&(b>c))
		{
			System.out.println("b is greater..!");
			
		}
		else
		{	
			System.out.println("a & b & c are the equal...!");
		}
		
		System.out.println("End Program...!");


	}

	}


