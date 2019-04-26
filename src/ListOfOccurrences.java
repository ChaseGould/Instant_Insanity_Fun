import java.util.ArrayList;

public class ListOfOccurrences {
	
	private int[] occurrences;
	
	public ListOfOccurrences() {
		this.occurrences = initializeArray();
	}
	
	private int[] initializeArray() {
		int[] occurrences = new int[31];
		occurrences[0] = -1;
		for(int i = 1; i < occurrences.length; i++)
			occurrences[i] = 0;
		return occurrences;
	}
	
	public int[] getOccurrences() {
		return this.occurrences;
	}
	
	public String toString() {
		String stringy = "";
		for(int i =1; i < this.occurrences.length; i++) {
			stringy += "The color " + i + " occurrs " + this.occurrences[i] + " times. \n";
		}
		return stringy;
	}
	
	
	public void setOccurrences(ArrayList<Cube> cubeList) {
		for(Cube cubey : cubeList) {
			int[] colors = cubey.getColors();
			for(int color : colors) {
				int i = color;
				occurrences[i] += 1;
			}
		}
	}

}
