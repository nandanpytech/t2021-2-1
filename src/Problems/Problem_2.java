package Problems;
import java.util.*;

public class Problem_2 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Input 'x'");
		int x=sc.nextInt();
		if(x>0) {
			for(int i=1;i<=x*2;i=i+2) {
				System.out.print(i+",");
			}
		}else {
			System.out.println("'x' should be greater than 0");
		}
		
	}

}
