package ie.gmit.sw;

import java.awt.image.BufferedImage;
import ie.gmit.sw.ImageReader.*;

public class DefaultImage extends Sprite {

	// Variables
	private BufferedImage[][] images = new BufferedImage[4][3]; // The images used in the animation
	// Get an instance of buffered image reader
	private BufferedImageReader imageReader = (BufferedImageReader) BufferedImageReader.getInstance();

	public DefaultImage(String name, Point p) {
		super(name, p);
		// TODO Auto-generated constructor stub
	}

	public BufferedImage[][] getImg() throws Exception {
		// Get image for the default player sprite
		BufferedImage[] img = imageReader.loadImages("./resources/images/sprites/default", null);

		// copied from Sprite.java
		int row = 0, col = 0;
		for (int i = 0; i < img.length; i++) {
			images[row][col] = img[i];
			if (col == images[row].length - 1) {
				row++;
				col = 0;
			} else {
				col++;
			}
		}
		return images;
	}
}
