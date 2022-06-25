package com.day1.test;
import java.util.*;
import com.day1.pojo.box;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("How many boxes do you want to create?");
		int quant=sc.nextInt();
		box []boxes= new box[quant];
		for(int i=0;i<quant;i++) {
			System.out.println("Enter box dimensions: length, width, height");
			boxes[i]= new box(sc.nextDouble(),sc.nextDouble(), sc.nextDouble());
		}
		for (box b: boxes) {
			System.out.println(b.getVolume());
		}
		
		sc.close();

	}

}
