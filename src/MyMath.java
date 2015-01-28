
public class MyMath {
	
//	¥	find the maximum of three numbers
	public static double maxNum(double a,double b,double c)
	{
		double nums[] = {a,b,c};
		// test
		double max = nums[0];
		
		for(int i=1;i<3;i++)
		{
			if (nums[i]>max)
			{
				max=nums[i];
			}
			
		}
		
		return max;
		
	}//end maxNum
	
	
//	¥	calculate ab  where b is a positive integer
	public static double myPow(double a,double b)
	{
		double ans = a;
		
		for(int i=2;i<=b;i++)
		{
			ans=ans*a;
		}
		
		return ans;
	}//end myPow
	
	
//	¥	find the sum of the numbers 1 to n  where n >=1
	public static int sumOf(int n)
	{
		int total = 0;
		
		for(int i=1;i<=n;i++)
		{
			total+=i;
		}
		
		return total;
	}//end sumOf
	
//	¥	test if a number n is a prime number
	public static boolean isPrime(int num)
	{
		int test=0;
		boolean answer=false;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				test++;
			}
		}
		
		if(test==0)
		{
			answer=true;
		}
		
		return answer;
	}//end isPrime
	
	
	public static boolean isValid(String password)
	{
		boolean lowerCaseTest=false,upperCaseTest=false,numberTest=false,result=false;
		
		for(int i=0;i<password.length();i++)
		{
			if(password.length()>7)
			{
				if(password.charAt(i)>='a' && password.charAt(i)<='z')
				{
					lowerCaseTest=true;
				}
				
				if(password.charAt(i)>='A' && password.charAt(i)<='Z')
				{
					upperCaseTest=true;
				}
				
				if(password.charAt(i)>='0' && password.charAt(i)<='9')
				{
					numberTest=true;
				}
					
					
			}
			
			if(lowerCaseTest==true && upperCaseTest==true && numberTest==true)
			{
				result=true;
			}
			
		}
		
		return result;
	}//end isValid
	
	
	
	
    }//end class


















