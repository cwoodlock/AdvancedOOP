package ie.gmit.sw.View;

import java.awt.*;
import javax.swing.*;

import ie.gmit.sw.GameWindowModels.GameWindowFactory;
import ie.gmit.sw.GameWindowModels.GameWindowModel;


public class GameWindow {
	
	//Get whatever game window model you want
	//GameWindowModel gameViewModel = GameWindowFactory.loadLevel2();
	 GameWindowModel gameViewModel = GameWindowFactory.loadLevel1();
	
	public GameWindow() throws Exception {
		GameView view = new GameView(gameViewModel.getModel(), gameViewModel.getObjects());
		Dimension d = new Dimension(GameView.DEFAULT_VIEW_SIZE, GameView.DEFAULT_VIEW_SIZE/2);
		view.setPreferredSize(d);
		view.setMinimumSize(d);
		view.setMaximumSize(d);

		JFrame f = new JFrame("GMIT - B.Sc. in Computing (Software Development)");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(new FlowLayout());
		f.add(view);
		f.addKeyListener(view);
		f.setSize(1000, 1000);
		f.setLocation(100, 100);
		f.pack();
		f.setVisible(true);
	}
}