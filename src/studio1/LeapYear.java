package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What year would you like to check?");
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		boolean leap = true;
		boolean leap4= year % 4 == 0;
		boolean leap100= year % 100 !=0;
		boolean leap400 = year % 400 == 0;
		
		leap=leap100 && leap4 || leap400 ;
		System.out.println(year + " is a leap year: " + leap);
		

	}

}
