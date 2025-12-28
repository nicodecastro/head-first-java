public class DrumKitTestDrive {
	public static void main(String [] args) {
		DrumKit d = new DrumKit();
		d.playSnare();
		d.setSnare(false);
		if (d.isSnare()) {
			d.playSnare();
		}
		d.playTopHat();
	}
}

class DrumKit {
	private boolean topHat = true;
	private boolean snare = true;

	boolean isSnare() {
		return snare;
	}

	void setSnare(boolean snare) {
		this.snare = snare;
	}

	void playSnare() {
		System.out.println("bang bang ba-bang");
	}

	void playTopHat() {
		System.out.println("ding ding da-ding");
	}
}