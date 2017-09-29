package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {

	public static void main(String[] args) {
		String amountfirst = "";
		String amountlast = "";
		String last = "";
		boolean lastEntry = false;
		int amountsfirstint = 0;
		int amountslastint = 0;
		int resultsFound = 0;
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> push = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			double pushofthepop = new Random().nextDouble();
			pushofthepop *= 100;
			push.push(pushofthepop);
		}
		// System.out.println("\n" + push);
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		for (int i = 0; i < 2; i++) {
			lastEntry = i == 1 ? true : false;
			if (!lastEntry) {
				amountfirst = JOptionPane.showInputDialog("Enter a minimum amount.");
				amountsfirstint = Integer.parseInt(amountfirst);
			} else {
				amountlast = JOptionPane.showInputDialog("Enter a maximum amount.");
				amountslastint = Integer.parseInt(amountlast);
			}

		}
		System.out.println("\n Minimum: " + last);
		System.out.println("\n Maximum: " + amountfirst);
		System.out.println(push.size() + " size");
		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.
		int minvar1 = push.size();
		for (int i = 0; i < minvar1; i++) {

			if ((push.peek() > amountsfirstint) && (push.peek() < amountslastint)) {
				resultsFound++;
				System.out.println("\n Result " + resultsFound + ": " + push.peek());
				push.pop();
			} else {
				push.pop();
			}
		}
		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
