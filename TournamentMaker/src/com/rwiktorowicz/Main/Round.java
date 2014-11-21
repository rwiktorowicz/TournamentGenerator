package com.rwiktorowicz.Main;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import com.rwiktorowicz.weightclasses.Weightclass;

public class Round {
	private LinkedList<String> round = new LinkedList<String>();
	private Scanner input = new Scanner(System.in);

	public void setRound(Weightclass weight, int size) {
		Random rand = new Random();

		for (int i = 0; i < size; i++) {
			int selection = rand.nextInt(weight.getSize());
			String randomfighter = weight.getFighter(selection);
			round.add(randomfighter);
			weight.removeFighter(randomfighter);
		}
	}

	public void getRound() {
		for (int k = 0; k < round.size(); k += 2) {
			System.out.println(round.get(k) + " VS. " + round.get(k + 1));
		}
	}

	public String getFighter(int index) {
		return round.get(index);
	}

	public void progressRounds(String weightclass) {
		String winner;
		boolean validinput = false;
		String roundheader = "";
		while (round.size() > 1) {
			System.out.println();

			if (round.size() == 2) {
				roundheader = "UFC WORLD " + weightclass.toUpperCase() + " CHAMPIONSHIP ROUND";
			} else if (round.size() == 4) {
				roundheader = "SEMI-FINALS";
			} else if (round.size() == 8) {
				roundheader = "QUARTER FINALS";
			} else {
				roundheader = "ROUND 1";
			}

			System.out.println(roundheader);
			for (int k = 0; k < round.size(); k++) {
				System.out.println();
				System.out.println(round.get(k) + " VS. " + round.get(k + 1));
				System.out.println();
				System.out.println("Press ENTER Key To Continue");
				input.nextLine();
				System.out
						.println("Who was the winner? "
								+ round.get(k)
								+ " (1) "
								+ "or "
								+ round.get(k + 1)
								+ " (2)? Enter the number that corresponds to the winner");
				while (validinput == false) {
					winner = input.nextLine();
					
					if (winner.equals("1")) {
						round.remove(k + 1);
						validinput = true;
					}
					else if (winner.equals("2")) {
						round.remove(k);
						validinput = true;
					}
					else {
						System.out.println("Your input is not recognized.  Try again!");
					}

				}
				validinput = false;

			}

		}
	}

}
