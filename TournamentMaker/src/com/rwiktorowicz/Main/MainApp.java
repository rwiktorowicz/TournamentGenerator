package com.rwiktorowicz.Main;

import java.util.Scanner;
import com.rwiktorowicz.weightclasses.*;

public class MainApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean runclass = true;
		boolean runsize = true;
       
		System.out.println("Welcome to UFC Tournament Generator");
		System.out.println();
		System.out.println("Pick a tournament size: 4, or 8");
		String usernumber = input.nextLine();
		
		while(runsize){
			if(usernumber.equals("4") || usernumber.equals("8")){
				runsize = false;
			}
			else{
				System.out.println("You must choose either 4, or 8");
				usernumber = input.nextLine();
			}
		}
		
		System.out.println();
		System.out.println("Pick a Weightclass:");
		System.out.println();
		System.out.println("Heavyweight" + "\n" + "Light Heavyweight" + "\n" + "Middleweight" + "\n" + "Welterweight" + "\n" + "Lightweight" 
		+ "\n" + "Featherweight" + "\n" + "Bantamweight" + "\n" + "Flyweight");

		String userinput = input.nextLine().toLowerCase();
		
	
		while (runclass) {
			switch (userinput) {
				case "heavyweight":
					Tournament heavyTourny = new Tournament();
					System.out.println();
					heavyTourny.start(new Heavyweight("heavyweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				case "light heavyweight":
					Tournament lightHeavyTourny = new Tournament();
					System.out.println();
					lightHeavyTourny.start(new LightHeavyweight("lightheavyweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				case "middleweight":
					Tournament middleTourny = new Tournament();
					System.out.println();
					middleTourny.start(new Middleweight("middleweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				case "welterweight":
					Tournament welterTourny = new Tournament();
					System.out.println();
					welterTourny.start(new Welterweight("welterweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				case "lightweight":
					Tournament lightTourny = new Tournament();
					System.out.println();
					lightTourny.start(new Lightweight("lightweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				case "bantamweight":
					Tournament bantamTourny = new Tournament();
					System.out.println();
					bantamTourny.start(new Bantamweight("bantamweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
					
				case "flyweight":
					Tournament flyTourny = new Tournament();
					System.out.println();
					flyTourny.start(new Flyweight("flyweight.txt"), Integer.parseInt(usernumber));
					runclass = false;
					input.close();
					break;
				default:
					System.out.println("Cannot recognize input. Please try again:");
					userinput = input.nextLine().toLowerCase();
			}
		}
	}

}
