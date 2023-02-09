package day02;

public class Javaprogram02 {

	public static void main(String[] args) {
		Javaprogram02 xyz= new Javaprogram02();
		xyz.addMethod(20,30);
		xyz.subMethod(10,5);
		xyz.mulMethod(10,10);
		
}
	
	public void addMethod(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void subMethod(int a,int b)
	{
		System.out.println(a-b);
	}
	
	
	public void mulMethod(int a,int b)
	{
		System.out.println(a*b);
	}
	
	
	
}