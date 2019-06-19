package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame = new JFrame("Guest Book");
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Name");
	JButton view = new JButton("View Names");
	ArrayList <String> names = new ArrayList <String>();
	
	
	public static void main(String[] args) {
		GuestBook e = new GuestBook();
		e.createUI();
	}
	
	void createUI(){
		frame.setVisible(true);
		frame.setSize(300, 75);
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		
		add.addActionListener(this);
		view.addActionListener(this);
		
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		if(buttonPressed == add) {
			String f = JOptionPane.showInputDialog("Add a Name");
			names.add(f);
		}
		
		
		if(buttonPressed == view) {
			String list = "";
			for (int i = 0; i < names.size(); i++) {
				list += "Guest #" + (i+1) + " " + names.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, list);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
