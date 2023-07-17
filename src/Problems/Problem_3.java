package Problems;

import java.util.Scanner;

public class Problem_3 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input 'x'");
		int x=sc.nextInt();
		if(x%2==0) {
			generateprimes(x-1);
		}else {
			generateprimes(x);
		}
	}
	static void generateprimes(int x) {
		for(int i=1;i<=x*2;i=i+2) {
			System.out.print(i);
			
		}
	}

}
