import java.util.ArrayList;

public class SimpleStartup {
	private ArrayList<Integer> locationCells;

	public void setLocationCells(int[] locs) {
		locationCells = new ArrayList<Integer>();
		for (int loc: locs) {
			locationCells.add(loc);
		}
		// printLocationCells();
	}

	public String checkYourself(int guess) {
		String result = "miss";
		if (locationCells.contains(guess)) {
			result = "hit";
			locationCells.remove(Integer.valueOf(guess));
		}
		if (locationCells.size() == 0) {
			result = "kill";
		}
		System.out.println(result);
		return result;
	}

	public void printLocationCells() {
		for (int loc: locationCells) {
			System.out.print(loc+" ");
		}
		System.out.println();
	}
}