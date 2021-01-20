package _05_vault;

public class Vault_runner {
	public static void main(String[] args) {
		Vault v = new Vault();
		Bond b = new Bond();
		System.out.println(b.findCode(v));
	}
}
