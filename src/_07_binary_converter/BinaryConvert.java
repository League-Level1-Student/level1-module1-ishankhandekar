package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class BinaryConvert implements ActionListener {
	JButton b = new JButton("Convert");
	JTextField t = new JTextField(30);
	public void GetBinary() {
		JFrame j = new JFrame();
		JPanel p = new JPanel();
		j.add(p);
		
		
		b.addActionListener(this);
		p.add(t);
		p.add(b);
		j.pack();
		j.setVisible(true);
		
	}
	public String convert(String input) {
		    if(input.length() != 8){
		        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
		        return "-";
		    }
		    String binary = "[0-1]+";//must contain numbers in the given range
		    if (!input.matches(binary)) {
		        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
		        return "-";   
		    }
		    try {
		        int asciiValue = Integer.parseInt(input, 2);
		        char theLetter = (char) asciiValue;
		        return "" + theLetter;
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
		        return "-";
		    }
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String toConvert = t.getText();
		String convertion = convert(toConvert);
		System.out.println(convertion + " is the character that this code gives");
		
		
	}

	}

