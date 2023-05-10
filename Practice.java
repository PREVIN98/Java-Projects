package com.java.project1;
import java.util.*;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<4;i++) {
			System.out.print("ENTER THE NUMBER:");
			
			int num = scan.nextInt();
			if (num>0 && num<27) {
				char ch =(char)(num+64);
				System.out.println("PRINT THE CHARACTER  :"+ ch);
			}
			else {
				System.out.println("IT IS NOT A NUMBER");
			}
			
		}
		
			
		
		

	}

}
