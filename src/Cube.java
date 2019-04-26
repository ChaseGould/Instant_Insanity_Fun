
public class Cube implements Comparable<Cube>{

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

	@Override
	public int compareTo(Cube otherCube) {
		if (this.getColors()[0] > otherCube.getColors()[0]) 
			return 1;
		else if (this.getColors()[0] < otherCube.getColors()[0])
			return -1;
		else
			return 0;
	}
	
}
