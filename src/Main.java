import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		
		//lambda expressions for color generating equations
		MyEquation equation1 = (int x) -> { return (int) (1 + (Math.floor(x*Math.PI) % 30)); };
		MyEquation equation2 = (int x) -> { return (int) (1 + (Math.floor(x*Math.E) % 30)); };		
		MyEquation equation3 = (int x) -> { return (int) (1 + (Math.floor(x*Math.sqrt(3)) % 30)); };	
		MyEquation equation4 = (int x) -> { return (int) (1 + (Math.floor(x*Math.sqrt(5)) % 30)); };	
		
		//total number of cube faces
		int n = 180;
		
		ArrayList<Cube> cubesList1 = new ArrayList<Cube>();
		//puzzle generator populates a list of cubes with colors
		puzzleGenerator(equation1, n, cubesList1);
		
		ArrayList<Cube> cubesList2 = new ArrayList<Cube>();
		//puzzle generator populates a list of cubes with colors
		puzzleGenerator(equation2, n, cubesList2);
		
		ArrayList<Cube> cubesList3 = new ArrayList<Cube>();
		//puzzle generator populates a list of cubes with colors
		puzzleGenerator(equation3, n, cubesList3);
		
		ArrayList<Cube> cubesList4 = new ArrayList<Cube>();
		//puzzle generator populates a list of cubes with colors
		puzzleGenerator(equation4, n, cubesList4);
		
		//sort cubes list
		//sortCubesList(cubesList1);
		
		//returns a string of cube list color assignments. used for testing purposes.
		//String listAssignments = cubesListToString(cubesList2);
		//System.out.println(listAssignments);
		
		ListOfOccurrences occurrences = new ListOfOccurrences();
		occurrences.setOccurrences(cubesList2);
		
		System.out.println(occurrences.toString());
		
	}
	
	public static void puzzleGenerator(MyEquation equation, int n, ArrayList<Cube> cubesList) {
		for(int i = 0; i < n/6; i++) {
			int[] generatedColors = new int[6];
			
			for(int j = i*6; j < i*6+6; j++) {
				//1 + ((floor n*pi) mod 30), 
				generatedColors[j%6]= equation.apply(j);
			}
			
			Cube cubey = new Cube(generatedColors);
			cubesList.add(cubey);
		}
	}
	
	public static void sortCubesList(ArrayList<Cube> cubesList) {
		Collections.sort(cubesList);
	}
	
	//testing function outputs all colors from a list of cubes.
	public static String cubesListToString(ArrayList<Cube> cubesList) {
		String output = "";
		int counter = 0;
		for(Cube e : cubesList) {
			output += "Cube " + counter + ": " + e.toString() + "\n";
			counter++;
		}
		return output;
	}
	
}


