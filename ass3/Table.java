package array;
import java.util.Scanner;
public class Table {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int[] table = new int[10];
	        for (int i = 1; i <= 10; i++) table[i - 1] = n * i;
	        for (int i = 1; i <= 10; i++) System.out.println(n + " * " + i + " = " + table[i - 1]);
	        sc.close();
	    }
	}


