package ie.gmit.sw.View;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;
import javax.swing.Timer;

import ie.gmit.sw.Controller.Direction;
import ie.gmit.sw.Controller.PaintController;
import ie.gmit.sw.Controller.Point;
import ie.gmit.sw.ImageReader.BufferedImageReader;
import ie.gmit.sw.Sprites.Sprite;
import ie.gmit.sw.Sprites.SpriteFactory;

/*
 * This is a God class and is doing way too much. The instance variables cover everything from isometric to 
 * Cartesian drawing and the class has methods for loading images and converting from one coordinate space to
 * another.
 * 
 */
public class GameView extends PaintController implements ActionListener, KeyListener { 
	private static final long serialVersionUID = 777L;
	
	
	//Encapsulate the things that vary...
	public static final int DEFAULT_VIEW_SIZE = 1280;
	private Sprite player;
	//private Sprite player2;

	//Do we really need two models like this?
	private int[][] matrix;
	private int[][] things;
	
	private BufferedImage[] tiles; //Note that all images, including sprites, have dimensions of 128 x 64. This make painting much simpler.
	private BufferedImage[] objects; //Taller sprites can be created, by using two tiles (head torso, lower body and legs) and improve animations
	private Color[] cartesian = {Color.GREEN, Color.GRAY, Color.DARK_GRAY, Color.ORANGE, Color.CYAN, Color.YELLOW, Color.PINK, Color.BLACK}; //This is a 2D representation
	
	private Timer timer; //Controls the repaint interval.
	private boolean isIsometric = true; //Toggle between 2D and Isometric (Z key)
	
	public GameView(int[][] matrix, int[][] things) throws Exception {
		init();
		this.matrix = matrix;
		this.things = things;
		
		setBackground(Color.BLACK);
		setDoubleBuffered(true); //Each image is buffered twice to avoid tearing / stutter
		timer = new Timer(100, this); //calls the actionPerformed() method every 100ms
		timer.start(); //Start the timer
	}
	
	private void init() throws Exception {
		//Get an instance of buffered image reader
		BufferedImageReader imageReader = (BufferedImageReader) BufferedImageReader.getInstance();
		
		//loadImages from imageReader
		tiles = imageReader.loadImages("./resources/images/ground", tiles);
		objects = imageReader.loadImages("./resources/images/objects", objects);
		//Using sprite factory we can now make the default sprite
		//player = new Sprite("Player 1", new Point(0, 0), imgReader.loadBufferedImages("./resources/images/sprites/default", null));
		player = SpriteFactory.getDefaultSprite("Player 1", new Point(3,3), imageReader.loadImages("./resources/images/sprites/default", null));
		//player2 = SpriteFactory.getDefaultSprite("Player 2", new Point(0,0), imageReader.loadImages("./resources/images/sprites/green", null));
	}

	public void toggleView() {
		isIsometric = !isIsometric;
		this.repaint();
	}

	public void actionPerformed(ActionEvent e) { //This is called each time the timer reaches zero
		this.repaint();
	}

	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			player.setDirection(Direction.RIGHT);
		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			player.setDirection(Direction.LEFT);
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			player.setDirection(Direction.UP);
		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			player.setDirection(Direction.DOWN);
		} else if (e.getKeyCode() == KeyEvent.VK_Z) {
			toggleView();
		} else if (e.getKeyCode() == KeyEvent.VK_X) {
			player.move();
		} else {
			return;
		}
	}
	
	public void keyReleased(KeyEvent e) {
	} // Ignore
	
	public void keyTyped(KeyEvent e) {
	} // Ignore
	
}