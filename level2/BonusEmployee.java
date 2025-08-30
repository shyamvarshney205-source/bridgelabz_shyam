package array;
import java.util.Scanner;
public class BonusEmployee {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] salary = new double[10];
	        double[] years = new double[10];
	        double[] bonus = new double[10];
	        double[] newSalary = new double[10];
	        double totalBonus = 0, totalOld = 0, totalNew = 0;
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Enter salary of employee " + (i + 1) + ": ");
	            salary[i] = sc.nextDouble();
	            System.out.print("Enter years of service of employee " + (i + 1) + ": ");
	            years[i] = sc.nextDouble();
	            if (salary[i] <= 0 || years[i] < 0) {
	                System.out.println("Invalid input, enter again");
	                i--;
	            }
	        }
	        for (int i = 0; i < 10; i++) {
	            if (years[i] > 5) bonus[i] = salary[i] * 0.05;
	            else bonus[i] = salary[i] * 0.02;
	            newSalary[i] = salary[i] + bonus[i];
	            totalBonus += bonus[i];
	            totalOld += salary[i];
	            totalNew += newSalary[i];
	        }
	        System.out.println("Total bonus payout = " + totalBonus);
	        System.out.println("Total old salary = " + totalOld);
	        System.out.println("Total new salary = " + totalNew);
	        sc.close();
	    }
	}


