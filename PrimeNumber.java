package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		
//		int n=10;
//		if(n%2==0)
//		{
//			System.out.println("PrimeNumber");
//		}
//		else if( n%2 == 1)
//		{
//			System.out.println("NotPrimeNumber");
//		}
		
		
		
		int n=97;
		int temp=0;
		int flag=0;
		temp=n/2;  
		for(int i= 2 ;i<=temp;i++)
		{
			if(n%2==0)
			{
				System.out.println("NotPrimeNumber");	
			}
	
			
		}
		if(flag==0)
		{
			System.out.println("PrimeNumber");
		}

	}
}












