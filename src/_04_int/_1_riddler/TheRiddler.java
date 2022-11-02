package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
			  int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
			  JOptionPane.showInputDialog("What comes up but never comes back down?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
			  JOptionPane.showInputDialog("Correct!");
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
			  JOptionPane.showInputDialog("What goes down but never comes back up?");
			  JOptionPane.showInputDialog("Correct!");
			  JOptionPane.showInputDialog("In the morning, I have 4 legs. In the evening, I have 2 legs. In the night, I have 3 legs. What am I?");
			  JOptionPane.showInputDialog("Wrong. It was a human.");
			  JOptionPane.showInputDialog("I am the father of all fruits. What am I?");
			  JOptionPane.showInputDialog("Correct!");
			  JOptionPane.showInputDialog("I'm as light as a feather, but even the strongest weightlifter can't hold me. What am I?");
			  JOptionPane.showInputDialog("Correct!");
			  JOptionPane.showInputDialog("I am a detective, but not a police. Who am I?");
			  JOptionPane.showInputDialog("Wrong. It was Batman.");
			  JOptionPane.showInputDialog("The more there is, the less you see. Of all the things in the world, what could I be?");
			  JOptionPane.showInputDialog("Correct!");
			  JOptionPane.showInputDialog("What is the beginning of eternity, the end of time and space, and the beginning of every end?");
			  JOptionPane.showInputDialog("Wrong. The answer was the letter e.");
			  JOptionPane.showInputDialog("If you drop me I could break. But if you smile I will still smile back. What am I?");
			  JOptionPane.showInputDialog("Wrong. You were supposed to say mirror!");
			  JOptionPane.showInputDialog("Mary's father has 5 daughters: Nana, Nene, Nini, Nono... who is the last daughter?");
			  JOptionPane.showInputDialog("Wrong.Mary is the last daughter!");
		// 2. Make a pop up to show the score.
		      score++;
	}
}

