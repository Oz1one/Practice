package day1;
import java.util.Scanner;
public class Acceptdouble {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		try {
		System.out.println("Enter the double values.");
		if(sc.hasNextDouble()) {
			double d1=sc.nextDouble();
			if(sc.hasNextDouble()) {
				double d2=sc.nextDouble();
			System.out.println("The two double values are:"+d1+" "+d2);
			}
			else
				System.out.println("D2 is not double");
		}
		else
			System.out.println("D1 is not double.");
		}catch (Exception e) {
			System.out.println("Please try again later!!!" );
		}
		sc.close();
		
	}
}
