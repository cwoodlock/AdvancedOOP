package ie.gmit.sw.GameWindowModels;

public class GameWindowModel {
	/*
	 * This matrix represents the isometric game model, with each number mapping to an
	 * image in the images/ground/ directory.
	 */
	protected int[][] model;

	//This matrix is a representation of where objects (things) in the game are placed
	protected int[][] objects;
	
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
