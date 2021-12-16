package Interface_9_4_2;

public class Businessman implements Richman, SocialWorker {
	int saving = 0;

	public int getSaving() {
		return saving;
	}

	public Businessman(int saving) {
		this.saving = saving;
	}

	@Override
	public void earnmony(int earn) {

		saving = saving + earn;
		System.out.println("Richman Save Mony...." + saving);
	}

	@Override
	public void donation(int donation) {
		saving = saving - donation;
		System.out.println("Richman Donate Mony...." + saving);

	}

	@Override
	public void party(int party) {
		saving = saving - party;
		System.out.println("Richman doing party....." + saving);
	}

	@Override
	public void helpToothers(int help) {
		saving = saving - help;
		System.out.println("Social Worker help other person......" + saving);
	}

	public static void main(String[] args) {
		Richman rm = new Businessman(10000);
		rm.earnmony(10000);
		rm.donation(500);
		rm.party(500);
		SocialWorker sw = new Businessman(10000);
		sw.helpToothers(2000);

	}

}
