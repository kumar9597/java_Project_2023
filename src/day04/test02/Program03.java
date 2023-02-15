package day04.test02;

import day04.test01.Program01;

public class Program03 extends Program01{

	public static void main(String[] args) {
		addMethod(1, 10);
		//subMethod(20, 1); // its a private method - not visible
		mulMethod(3, 1);
		//sqrtMethod(10);// its a default method- not visible 
	
		Program03 x = new Program03();// current class object
		x.addMethodNonStatic(10, 5);
		//x.subMethodNonStatic(10, 3); // its a private method- not visible
		x.mulMethodNonStatic(20, 10);
		//x.sqrtMethodNonStatic(4);// its a default method - not visible
	}

}
