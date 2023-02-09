package day04.test01;

public class Program01 {

	public static void main(String[] args) {
		
	}
		public static void addMethod(int a,int b)
		{
			System.out.println(a+b);
		}	
		private static void subMethod(int a,int b)
		{
			System.out.println(a-b);
		}	
		protected static void mulMethod(int a,int b)
		{
			System.out.println(a*b);
		}	
		static void sqrtMethod(int a)
		{
			System.out.println(a*a);
		}
		 	
		public void addMethodNonStatic(int a,int b)
		{
			System.out.println(a+b);
		}
		private void subMethodNonStatic(int a,int b)
		{
			System.out.println(a-b);
		}	
		protected void mulMethodNonStatic(int a,int b)
		{
			System.out.println(a*b);
		}	
		void sqrtMethodNonStatic(int a)
		{
			System.out.println(a*a);
		}	
		public static void main1(String[]args){
			addMethod(1, 10);
			subMethod(20, 1);
			mulMethod(3, 1);
			sqrtMethod(10);
			Program01 x = new Program01();
			x.addMethodNonStatic(10, 5);
			x.subMethodNonStatic(10, 3);
			x.mulMethodNonStatic(20, 10);
			x.sqrtMethodNonStatic(4);
			


}

}
