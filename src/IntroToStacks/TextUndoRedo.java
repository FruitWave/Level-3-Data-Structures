package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
	private JFrame one;
	private JPanel two;
	private JLabel three;

	private Stack<String> stacky = new Stack<String>();
	private Stack<String> tacticalnukeonline = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo olololo = new TextUndoRedo();
		olololo.gui();
	}

	void gui() {
		one = new JFrame();
		two = new JPanel();
		three = new JLabel();
		one.add(two);
		two.add(three);
		one.addKeyListener(this);
		one.pack();
		one.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if ((e.getKeyCode() != KeyEvent.VK_BACK_SPACE) && (e.getKeyCode() != KeyEvent.VK_BACK_SLASH)) {
			String dinosaurs = three.getText();
			String dragons = e.getKeyChar() + "";
			dinosaurs += dragons;
			stacky.push(dinosaurs);
			three.setText(stacky.peek());
			System.out.println(stacky.peek());
		} else {
			if (e.getKeyCode() != KeyEvent.VK_BACK_SPACE) {
				tacticalnukeonline.push(stacky.pop());
				three.setText(stacky.peek());
			} else if (e.getKeyCode() != KeyEvent.VK_BACK_SLASH) {
				stacky.push(tacticalnukeonline.pop());
				three.setText(stacky.peek());
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
