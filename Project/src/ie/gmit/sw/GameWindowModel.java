package ie.gmit.sw;

public class GameWindowModel {
	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
	private int[][] model;

	//This matrix is a representation of where objects (things) in the game are placed
	private int[][] objects;
	
	public int[][] getModel() {
		return model;
	}

	public void setModel(int[][] model) {
		this.model = model;
	}

	public int[][] getObjects() {
		return objects;
	}

	public void setObjects(int[][] objects) {
		this.objects = objects;
	}

}
