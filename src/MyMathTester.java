import javax.swing.JOptionPane;


public class MyMathTester {
	public static void main(String args[])
	{
		double ans = MyMath.maxNum(1,4,9);
		System.out.println("9 is " + ans);
		
		ans = MyMath.maxNum(9,1,4);
		System.out.println("9 is " + ans);
		
		ans = MyMath.maxNum(-7,9,4);
		System.out.println("9 is " + ans);
		
		ans = MyMath.maxNum(-7,-3,-9);
		System.out.println("-3 is " + ans);
		
		ans = MyMath.maxNum(5.7,-4.2,5.2);
		System.out.println("5.7 is " + ans);
		
		ans = MyMath.myPow(2,4);
		System.out.println("16 is " + ans);
		
		ans = MyMath.myPow(4,2);
		System.out.println("16 is " + ans);
		
		ans = MyMath.myPow(8,1);
		System.out.println("8 is " + ans);
		
		ans = MyMath.myPow(7,2);
		System.out.println("49 is " + ans);
		
		int ans2 = MyMath.sumOf(4);
		System.out.println("10 is " + ans2);
		
		ans2 = MyMath.sumOf(7);
		System.out.println("28 is " + ans2);
		
		ans2 = MyMath.sumOf(9);
		System.out.println("45 is " + ans2);
		
		boolean ans3 = MyMath.isPrime(11);
		System.out.println("11 is true " + ans3);
		
		ans3 = MyMath.isPrime(7);
		System.out.println("7 is true " + ans3);
		
		ans3 = MyMath.isPrime(2);
		System.out.println("2 is true " + ans3);
		
		ans3 = MyMath.isPrime(4);
		System.out.println("4 is false " + ans3);
		
		ans3 = MyMath.isPrime(16);
		System.out.println("16 is false " + ans3);
		
		ans3 = MyMath.isPrime(10);
		System.out.println("10 is false " + ans3);
		
		String password;
		
		do
		{
			password = JOptionPane.showInputDialog("Password:");
			
			
		}while(!MyMath.isValid(password));
	}
}





















