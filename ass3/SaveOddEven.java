package array;
import java.util.Scanner;
public class SaveOddEven {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a natural number: ");
	        int n = sc.nextInt();
	        if (n <= 0) {
	            System.out.println("Invalid input");
	            return;
	        }
	        int[] odd = new int[n / 2 + 1];
	        int[] even = new int[n / 2 + 1];
	        int oddIdx = 0, evenIdx = 0;
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) even[evenIdx++] = i;
	            else odd[oddIdx++] = i;
	        }
	        System.out.println("Odd numbers:");
	        for (int i = 0; i < oddIdx; i++) System.out.print(odd[i] + " ");
	        System.out.println("\nEven numbers:");
	        for (int i = 0; i < evenIdx; i++) System.out.print(even[i] + " ");
	        sc.close();
	    }
	}

