package ie.gmit.sw;

//Sprite factory to generate sprites
public class SpriteFactory {
	public static Sprite getDefaultSprite(String name, Point p) {
		Sprite sprite = new DefaultImage(name, p);
		return sprite;
	}
}
