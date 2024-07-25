package week1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {
	public static void main(String[] args) {
		int[] a= {1,4,3,2,8,6,7};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			if(i+1!=a[i]) {
				System.out.println("Missing numbder is: "+(i+1));
				break;
			}
			
		}
	}

}



