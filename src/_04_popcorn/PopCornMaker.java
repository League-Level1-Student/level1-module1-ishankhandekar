package _04_popcorn;

import javax.swing.JOptionPane;

public class PopCornMaker {
	public static void main(String[] args) {
		Microwave wave = new Microwave();
		
		
		Popcorn corn =  new Popcorn(JOptionPane.showInputDialog("What kind of popcorn do you want?"));
		wave.putInMicrowave(corn);
		wave.setTime(10);
		wave.startMicrowave();
	}
}
