package day02.test01;

public class Program02 extends Program01{
	//Program01-super class(parent)
	//Program02- sub class (child)

	public static void main(String[] args) {
		Program01 xyz = new Program01();
		
		xyz.addMethod(10,20);
		subMethod(10,5);
		mulMethod(15,6);

	}

}
