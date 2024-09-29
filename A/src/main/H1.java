package main;
import java.util.Scanner;
public class H1 {

	public static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the chocolate shop, how much would you like to buy?");
		
		int userInput = 0;
				
		boolean isNumber = false;
		while (!isNumber) {
			try { 
				userInput = Integer.parseInt(sc.nextLine());
				isNumber = true;
			} catch (Exception e) {
				System.out.println("I don't think we sell that here, would you want some chocolates though?");
			}
		}
		int result = chocolates(userInput);
		System.out.println("Your total is " + result + " dollars");
	}
	public static int chocolates(int numberOfChocolates) {
			return numberOfChocolates * 5;
		
	}
}
//Homework:
//Create a process that takes input from user and generate output. Any theme. Games, Flowers, Stores, MCDonalds. 
//Ask and take input from user and handle possible exceptions with try catch.
//Output the result.