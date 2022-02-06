package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean mainloop = true;
		
		int menuSelection;
		
		do{
			System.out.println("\n Please select an option:\n");
			System.out.print("1. Quarts to fluid ounces\n");
			System.out.print("2. Cups to Gallons\n");
			System.out.print("3. Teaspoons to Tablespoons\n");
			System.out.print("4. Quit\n");
			
			menuSelection = input.nextInt();
		}
		
		while(menuSelection >4); {

			switch(menuSelection) {
		
		case -1: // nothing goes here so execution will fall through to next case.
			
		case 1:  // option 1 - Quarts to Fluid Ounces
			int multNum1; int fluidOunces;
			
			System.out.print("Please enter your number.");
			multNum1 = input.nextInt();
			fluidOunces = (multNum1 * 32);
			String q = (multNum1+" Quarts = "+fluidOunces+" Fluid Ounces");
			System.out.println(q);
			menuSelection=0;
			multNum1=0;
			main(args);
			break;
			
		case 2: // option 2 - Cups to Gallons
			int multNum2; double gallons;
			
			System.out.print("Please enter your number.");
			multNum2 = input.nextInt();
			gallons = (multNum2 * 0.0625);
			String g = (multNum2+" Cups = "+gallons+" Gallons");
			System.out.println(g);
			menuSelection=0;
			multNum2=0;
			main(args);
			break;
			
		case 3: // option 3 - Teaspoons to Tablespoons
			int divNum1; int tablespoons;
			
			System.out.print("Please enter your number.");
			divNum1 = input.nextInt();
			tablespoons = (divNum1 / 3);
			String t = (divNum1+" Teaspoons = "+tablespoons+" Tablespoons");
			System.out.println(t);
			menuSelection=0;
			divNum1=0;
			main(args);
			break;
			
		case 4: // option 4 - Quit, this will break the loop.
			System.out.println("\n#####################################################################");
			System.out.println("\t\nThanks for using my app, have a nice day.");
			System.out.println("\t\nCoded By: Gloria Johnston, Web Developer & Software Engineer");
			System.out.println("\n#####################################################################");
			break;
			
		default: // option for wrong selection
			System.out.println("You must select one of the four options.");

			}
		}
}}