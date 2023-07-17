package Problems;
import java.util.*;

public class Problem_1 {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Calculator...");
		System.out.println("Enter number (a)");
		double a=sc.nextDouble();
		
		System.out.println("Enter number (b)");
		sc.nextLine();
		double b=sc.nextDouble();
		System.out.println("Enter type of operation");
		System.out.println("+ - Addition");
		System.out.println("- - Substraction");
		System.out.println("* - Multiplication");
		System.out.println("/ - Division");
		String operation=sc.next();
		
		switch(operation) {
		case "+":
			System.out.printf("Addition of Two Number is %2f",a+b);
			break;
		case "-":
			System.out.printf("Substraction of Two Number is %2f",a-b);
			break;
		case "*":
			System.out.printf("Multiplication of Two Number is %2f",a*b);
			break;
		case "/":
			if(a>b) {
				System.out.printf("Division of Two Number is %2f",a/b);
				break;
			}else {
				System.out.printf("Division of Two Number is %2f",b/a);
				break;
			}
		default:
			System.out.println("Please enter correct operation");
			break;
		}
		
		
	}

}
