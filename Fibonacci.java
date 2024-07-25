package week1.homeassignment;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0;
		int b=1;
		int n=8;
		int c;
		System.out.println("Fibonacci series in this range are: ");
		for(int i=0;i<n;i++)
		{
		
			System.out.println(a);		
			c=a+b;
			a=b;
			b=c;
			
	}
	
	}

}
