package test;

public class Testing {

	public static void main(String[] args) {
		long a = fun();//6432//100.0
		System.out.println(a+a);//200.0

	}
	
	public static long fun() {
		int x = 10;
		System.out.println(x*x);
		return x*x;
	}


}
