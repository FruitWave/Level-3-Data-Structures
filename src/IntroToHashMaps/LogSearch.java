package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	JFrame ramef;
	JPanel anelp;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	HashMap<Integer, String> data;

	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values. Create a GUI with three buttons.
	 * 
	 * * Button 1: Add Entry When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * After an ID is entered, use another input dialog to ask the user to enter a name. Add this information as a new
	 * entry to your HashMap. \\\DONE\\\
	 * 
	 * Button 2: Search by ID When this button is clicked, use an input dialog to ask the user to enter an ID number. If
	 * that ID exists, display that name to the user. Otherwise, tell the user that that entry does not exist.
	 * \\\DONE\\\
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a message dialog in the following
	 * format: ID: 123 Name: Harry Howard ID: 245 Name: Polly Powers ID: 433 Name: Oliver Ortega etc...\\\DONE\\\
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove Entry When this button is clicked,
	 * prompt the user to enter an ID using an input dialog. If this ID exists in the HashMap, remove it. Otherwise,
	 * notify the user that the ID is not in the list.\\\DONE\\\
	 *
	 */
	public static void main(String[] args) {
		LogSearch miner = new LogSearch();

		miner.mine();
	}

	public void mine() {
		data = new HashMap<Integer, String>();
		ramef = new JFrame("This is a title. Such wow.");
		anelp = new JPanel();
		one = new JButton("Click One");
		one.addActionListener(this);
		two = new JButton("Click Two");
		two.addActionListener(this);
		three = new JButton("Click Three");
		three.addActionListener(this);
		four = new JButton("Click Four");
		four.addActionListener(this);
		ramef.add(anelp);
		anelp.add(one);
		anelp.add(two);
		anelp.add(three);
		ramef.pack();
		ramef.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == one) {
			String inpot = JOptionPane.showInputDialog("The System is telling me to 'ask the user (that's you) to enter an ID number'. You better comply.");
			int pottedplant = Integer.parseInt(inpot);
			String thePotHasBeenPlanted = JOptionPane
					.showInputDialog("The System is telling me to 'use another input dialog to ask the user (that's you) to enter a name'. You better comply.");
			data.put(pottedplant, thePotHasBeenPlanted);

		} else if (e.getSource() == two) {
			String potIsSitting = JOptionPane.showInputDialog("Enter an ID code. We'll hack the rest.");
			int potHasCrashed = Integer.parseInt(potIsSitting);
			String pleaseRestartPot = data.get(potHasCrashed);
			if (pleaseRestartPot != null) {
				JOptionPane.showMessageDialog(null, "Name is: " + pleaseRestartPot);
			}
		} else if (e.getSource() == three) {
			String finalStatement = "";
			for (Integer i : data.keySet()) {
				String newInfoNums = "\nID: " + i;
				String newInfoNams = "Name: " + data.get(i);
				String newStatement = newInfoNums + ", " + newInfoNams;
				finalStatement += newStatement;
				// JOptionPane.showMessageDialog(null, "ID is: " + i + ", Name is: " + data.get(i));
			}
			JOptionPane.showMessageDialog(null, finalStatement);
		} else if (e.getSource() == four) {
			String potHasBeenRebootedFromBackup = JOptionPane.showInputDialog("Enter the Pot code you want to eliminate. Excuse me, I sneezed. I meant 'ID code'.");
			int potBackupCopyIsCorrupted = Integer.parseInt(potHasBeenRebootedFromBackup);
			data.remove(potBackupCopyIsCorrupted);
			String systemBlueScreenTotalDeath = "Entry for Id: " + potBackupCopyIsCorrupted + " has been removed.";
			JOptionPane.showMessageDialog(null, systemBlueScreenTotalDeath);
		}

	}

}
