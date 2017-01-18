package com.meganum.proj;

import acm.program.ConsoleProgram;
import acm.program.Program;
import java.util.*;
import javax.swing.*;

public class GameManager extends ConsoleProgram{
	
	private static final String SPACER_WIDTH = "                                        ";

	public void run(){
		commanderText1 = new JLabel ("Commander");
		deckText1 = new JLabel ("Deck");
		deadText1 = new JLabel ("Dead");
		
		add(commanderText1, SOUTH);
		add(new JLabel(SPACER_WIDTH), SOUTH);
		add(deckText1, SOUTH);
		add(new JLabel(SPACER_WIDTH), SOUTH);
		add(deadText1, SOUTH);
		
		commanderText2 = new JLabel ("Commander");
		deckText2 = new JLabel ("Deck");
		deadText2 = new JLabel ("Dead");
		
		
		add(commanderText2, NORTH);
		add(new JLabel(SPACER_WIDTH), NORTH);
		add(deckText2, NORTH);
		add(new JLabel(SPACER_WIDTH), NORTH);
		add(deadText2, NORTH);
	}
	
	private JLabel commanderText1;
	private JLabel deckText1;
	private JLabel deadText1;
	
	private JLabel commanderText2;
	private JLabel deckText2;
	private JLabel deadText2;
	
	

}
