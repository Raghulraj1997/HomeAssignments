package week1.homeassignment;

public class IsPrime {

	public static void main(String[] args) {
	int a=29, b=0;
    for(int i=2;i<a-1;i++)
    {
    	if(a%i==0)
    	{
    	System.out.println("Not a prime number");
    	b=1;
    break;
    	}
    }
    	if(b==0) {
    	
    		System.out.println("Prime number");
    	}
    	
    
    }
        	
	}

