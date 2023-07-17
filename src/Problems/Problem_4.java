package Problems;

import java.util.*;
public class Problem_4 {

	public static void main(String []args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
	        Map<Integer, Integer> counts = countMultiples(numbers);

	        System.out.println("Output:");
	        System.out.println(counts);
	}
	
	 private static Map<Integer, Integer> countMultiples(List<Integer> numbers) {
	        Map<Integer, Integer> counts = new HashMap<>();
	        List<Integer> multiples = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

	        for (int multiple : multiples) {
	            int count = 0;
	            for (int number : numbers) {
	                if (number % multiple == 0) {
	                    count++;
	                }
	            }
	            counts.put(multiple, count);
	        }

	        return counts;
	    }
}
