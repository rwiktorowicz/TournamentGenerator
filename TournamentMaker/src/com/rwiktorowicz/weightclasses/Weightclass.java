package com.rwiktorowicz.weightclasses;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public abstract class Weightclass {
	private LinkedList<String> fighters = new LinkedList<String>();
	private String name;
	
	public Weightclass(String filename) {
		filename.toLowerCase();
		
		try {
			BufferedReader in = new BufferedReader(
					new InputStreamReader(getClass().getResourceAsStream(
							"/resource/" + filename)));

			String line = in.readLine();
			while (line != null) {
				fighters.add(line);
				line = in.readLine();
			}

			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("File could not be found: " + filename);
		} catch (IOException e) {
			System.out.println("There was a problem reading the file: " + filename);
		}
	}

	public String getFighters() {
		return fighters.toString();
	}

	public int getSize() {
		return fighters.size();
	}

	public String getFighter(int index) {
		return fighters.get(index);
	}

	public void removeFighter(String fighter) {
		fighters.removeFirstOccurrence(fighter);
	}
	
	public String getName() {
		return name;
	}
	
	protected void setName(String name) {
		this.name = name;
	}

}
