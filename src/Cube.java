
public class Cube {

	//fields
	private int[] colors = new int[6];
	
	//constructor
	public Cube(int[] colors) {
		this.colors = colors;
	}
	
	public String toString() {
		return java.util.Arrays.toString(getColors());
	}
	
	//getter
	public int[] getColors() {
		return this.colors;
	}
	
}
