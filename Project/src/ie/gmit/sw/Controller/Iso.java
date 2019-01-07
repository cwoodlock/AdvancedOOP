package ie.gmit.sw.Controller;

import java.awt.Graphics;

import ie.gmit.sw.ImageReader.BufferedImageReader;

public class Iso extends BufferedImageReader implements Isoator{

	public Iso(){
		super();
		// TODO Auto-generated constructor stub
	}

	public static final int DEFAULT_VIEW_SIZE = 1280;
	protected static final int TILE_WIDTH = 128;
	protected static final int TILE_HEIGHT = 64;

	// This method breaks the SRP
	public int getIsoX(int x, int y) {
		int rshift = (DEFAULT_VIEW_SIZE / 2) - (TILE_WIDTH / 2) + (x - y); // Pan camera to the right
		return (x - y) * (TILE_WIDTH / 2) + rshift;
	}

	// This method breaks the SRP
	public int getIsoY(int x, int y) {
		return (x + y) * (TILE_HEIGHT / 2);
	}

	// This method breaks the SRP
	public Point getIso(int x, int y) {
		return new Point(getIsoX(x, y), getIsoY(x, y)); // Could be more efficient...
	}

}
