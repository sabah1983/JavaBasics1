
public class MortgagaRate {

	public static void main(String[] args) {

		double rate = 3.5;
		int price = 400000;

		if (rate > 4.5) {
			System.out.println("Is very high");
		} else {
			System.out.println("Not Buy a house");
			if (price > 200000) {
				System.out.println("Need money");
			} else {
				System.out.println("Pay cash");
			}
		}

	}
}
