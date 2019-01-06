package ie.gmit.sw;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;

import javax.imageio.ImageIO;

public class BufferedImageReader implements ImageReader {

	// Default return
	private static BufferedImageReader instance;

	//Generated methods
	@Override
	public Image[] readImages(String directory, Image[] img) {
		// TODO Auto-generated method stub
		return null;
	}

	public BufferedImageReader() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Make an instance of buffered image reader or return the default instance
	public static ImageReader getInstance() {
		if (instance == null) {
			return new BufferedImageReader();
		} else {
			return instance;
		}
	}

	//Taken from GameView from skeleton project provided
	public BufferedImage[] loadImages(String directory, BufferedImage[] img) throws Exception {
		File dir = new File(directory);
		File[] files = dir.listFiles();
		Arrays.sort(files, (s, t) -> s.getName().compareTo(t.getName()));

		img = new BufferedImage[files.length];
		for (int i = 0; i < files.length; i++) {
			img[i] = ImageIO.read(files[i]);
		}
		return img;
	}
}
