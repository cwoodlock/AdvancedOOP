package ie.gmit.sw.ImageReader;

import java.awt.Image;

//interface for method to read in the images to use
public interface ImageReader {
	
	public Image[] readImages(String directory, Image[] img);
}
