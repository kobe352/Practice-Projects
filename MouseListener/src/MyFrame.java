import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

// MouseListener is used for receiving user's mouse inputs such as press, release, click, enter, and exit.
// implements = receiving interface so must add unimplemented methods.
public class MyFrame extends JFrame implements MouseListener{

	JLabel label;

	// constructor
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);

		// adds a red box
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);

		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released) on a component
		// executes mouseClicked when mouse has been clicked and released.
		System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		// executes mousePressed when mouse is pressed.
		System.out.println("You pressed the mouse");
		label.setBackground(Color.yellow);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Invoked when a mouse button has been released on a component
		// executes mouseReleased when mouse is released.
		System.out.println("You released the mouse");
		label.setBackground(Color.green);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		// executes mouseEntered when mouse enters the area of picture.
		System.out.println("You entered the area");
		label.setBackground(Color.blue);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		// executes mouseExited when mouse leaves the area of picture.
		System.out.println("You exited the area");
		label.setBackground(Color.red);
	}
}
