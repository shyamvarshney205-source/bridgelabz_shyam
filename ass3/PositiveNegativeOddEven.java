package array;
import java.util.Scanner;
public class PositiveNegativeOddEven {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = new int[5];
	        System.out.println("Enter 5 numbers:");
	        for (int i = 0; i < arr.length; i++) arr[i] = sc.nextInt();
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > 0) {
	                if (arr[i] % 2 == 0) System.out.println(arr[i] + " is positive even");
	                else System.out.println(arr[i] + " is positive odd");
	            } 
	            else if (arr[i] < 0) System.out.println(arr[i] + " is negative");
	            else System.out.println(arr[i] + " is zero");
	        }
	        if (arr[0] == arr[4]) System.out.println("first and last are equal");
	        else if (arr[0] > arr[4]) System.out.println("First is greater than last");
	        else System.out.println("First is less than last");
	        sc.close();
	    }
	}



