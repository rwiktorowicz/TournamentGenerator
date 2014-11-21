package com.rwiktorowicz.Main;

import java.util.Scanner;

import com.rwiktorowicz.weightclasses.Weightclass;

public class Tournament {

	public void start(Weightclass weight, int size) {
		Round newRound = new Round();
		Scanner input = new Scanner(System.in);

		newRound.setRound(weight, size);
		System.out.println("UFC WORLD " + weight.getName().toUpperCase() + " CHAMPIONSHIP TOURNAMENT");
		newRound.getRound();
		System.out.println();
		System.out.println("Press ENTER Key To Continue");
		System.out.println();
		input.nextLine();
		newRound.progressRounds(weight.getName());
		System.out.println("The UFC World " + weight.getName() + " Champion is "
				+ newRound.getFighter(0));
		input.close();
	}

}
