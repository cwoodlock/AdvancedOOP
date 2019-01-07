package ie.gmit.sw.Sprites;

import java.awt.image.BufferedImage;

import ie.gmit.sw.Controller.Point;

//Sprite factory to generate sprites
public class SpriteFactory {

	public static Sprite getDefaultSprite(String name, Point p, BufferedImage[] loadImages) {
		// TODO Auto-generated method stub
		Sprite sprite = new DefaultImage(name, p, loadImages);
		return sprite;
	}
}
