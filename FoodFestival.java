package cmp;
import java.util.ArrayList;
import java.util.Scanner;
public class FoodFestival {
	public static ArrayList food = new ArrayList(); // used to make a list of foods eaten by user
	public static void main(String[] args) {
		
		boolean userHungry = true;
		Scanner kb = new Scanner(System.in); // creates a scanner
		
		System.out.println("What is your name?");
		String userName = kb.nextLine();
		while(userHungry == true) { // loops until user doesn't enter yes
		System.out.println("Are you hungry "+userName+"?");
		String userYesNo = kb.next(); // its not nextLine b/c it repeats the line twice.
		
		if(userYesNo.equalsIgnoreCase("yes")) { // user enters the loop
			System.out.println("Food Menu\n1. Meat\n2. Veggies\n3. Desserts");
			int userNum = kb.nextInt(); // user selects a certain menu
			// food.add adds to the end result when the loop ends
			if(userNum == 1) {
				System.out.println("Meat Menu");
				System.out.println("1. Ribeye Steak\n2. Fried Chicken\n3. Porkchops");
				int userNum1 = kb.nextInt();
				
				if(userNum1 == 1) {
					System.out.println("Enjoy your Ribeye Steak");
					food.add("Steak");
				}
				else if (userNum1 == 2) {
					System.out.println("Enjoy your Fried Chicken");
					food.add("Fried Chicken");
				}
				else if (userNum1 == 3) {
					System.out.println("Enjoy your Porkchops");
					food.add("Porkchops");
				}
			}
			else if (userNum == 2) {
				System.out.println("Veggie Menu");
				System.out.println("1. Veggie Burger\n2. Caesar Salad\n3. Kale Casserole");
				int userNum2 = kb.nextInt();
				
				if(userNum2 == 1) {
					System.out.println("Enjoy your Veggie Burger");
					food.add("Veggie burger");
				}
				else if (userNum2 == 2) {
					System.out.println("Enjoy your Caesar Salad");
					food.add("Caesar Salad");
				}
				else if(userNum2 == 3) {
					System.out.println("Enjoy your Kale Casserole");
					food.add("Kale Casserole");
				}
					}
			else if (userNum == 3) {
				System.out.println("Dessert Menu");
				System.out.println("1. Ice Cream Sundae\n2. Chocolate Cake");
				int userNum3 = kb.nextInt();
				
				if(userNum3 == 1) {
					System.out.println("Enjoy your Ice Cream Sundae");
					food.add("Ice Cream");
				}
				else if(userNum3 == 2) {
					System.out.println("Enjoy your Chocolate Cake");
					food.add("Cake");
				}
					}
						}
			
	
		else {
			userHungry = false; // breaks the loop
			
			System.out.println("Goodbye "+userName +" happy digesting.");
			System.out.println(userName+", in total you ate... "+food); // prints what the user ate & exits the program
			
			kb.close(); // closes the scanner
		}
			}
				}
}