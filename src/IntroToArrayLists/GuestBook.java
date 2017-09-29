package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names". Yep
	// When the add name button is clicked, display an input dialog that asks
	// the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked,
	// display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame window;
	JPanel pane;
	JButton hack;
	JButton resources;
	String flavorText;
	ArrayList<String> names;
	static double name_num;

	public static void main(String[] args) {
		GuestBook houseMaster = new GuestBook();
		houseMaster.setUp();
	}

	void setUp() {
		flavorText = "Hacked Club Guest Book";
		window = new JFrame(flavorText);
		pane = new JPanel();
		hack = new JButton("Hack Names");
		resources = new JButton("Guest Whitelist");
		hack.addActionListener(this);
		resources.addActionListener(this);
		names = new ArrayList<>();
		window.add(pane);
		pane.add(hack);
		pane.add(resources);
		window.pack();
		window.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hack) {
			String hackEntry = JOptionPane.showInputDialog("HACKER entry_valve ACCESSED = True. ENTER name_hac...");
			name_num++;
			names.add(hackEntry);
		} else if (e.getSource() == resources) {
			if (name_num > 0) {
				String megaline = "";
				String line = "";
				for (int i = 0; i < names.size(); i++) {
					line = "Guest #" + (i + 1) + " " + names.get(i) + "\n";
					megaline += line;
				}
				JOptionPane.showMessageDialog(null, megaline);
			} else {
				JOptionPane.showMessageDialog(null, "No guests on whitelist.");
			}

		}

	}

}
