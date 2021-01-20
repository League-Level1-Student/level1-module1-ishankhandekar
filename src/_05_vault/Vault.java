package _05_vault;

import java.util.Random;

import javax.swing.JOptionPane;

public class Vault {
	static Random rand = new Random();
	static int secretCode = rand.nextInt(1000000);
	public static void run() {
		Vault vault = new Vault();
		
	}public boolean trycode(int guess) {
		if (guess == secretCode) {
			return true;
		}
		return false;
	}
}
 class Bond {
	public int findCode(Vault v) {
		for (int i = 0;  i< 1000000; i++) {
			if (v.trycode(i) == true) {
				return i;
			}
		}
		return -1;
		
	}
	}
