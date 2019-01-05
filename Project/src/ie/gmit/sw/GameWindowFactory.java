package ie.gmit.sw;

//Factory class returns whatever gamewindow you choose
public class GameWindowFactory {
	
	public static GameWindowModel loadLevel1() {
		return GameWindowLevel1.getInstance();
	}

	public static GameWindowModel loadLevel2() {
		return GameWindowLevel2.getInstance();
	}

}
