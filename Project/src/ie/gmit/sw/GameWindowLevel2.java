package ie.gmit.sw;

public class GameWindowLevel2 extends GameWindowModel{

	//Default return
		private static GameWindowLevel2 instance;
		
		//Constructor to create level 1
		public GameWindowLevel2() {
			//Change how matrices were instantiated after getting error.
			//https://stackoverflow.com/questions/5307283/exception-in-thread-awt-eventqueue-0
			model = new int[][] { 
					{ 4, 4, 4, 4, 4, 3 , 1, 7, 7, 7},
					{ 4, 4, 4, 4, 5, 3 , 1, 6, 6, 6},
					{ 4, 4, 4, 5, 3, 3 , 1, 0, 0, 0},
					{ 5, 5, 5, 5, 3, 3 , 1, 0, 0, 1},
					{ 3, 3, 3, 3, 1, 1 , 1, 0, 0, 1},
					{ 2, 2, 2, 2, 1, 0 , 0, 0, 0, 2},
					{ 0, 0, 0, 1, 0, 0 , 0, 0, 0, 2},
					{ 0, 0, 2, 0, 0, 0 , 0, 0, 0, 2},
					{ 0, 1, 0, 0, 0, 0 , 0, 0, 0, 2},
					{ 1, 0, 0, 0, 0, 0 , 0, 0, 0, 2}
					
			};
			
			objects = new int[][] { 
					{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
					{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
					{ 0, 0, 0, 0, 0, 0 , 0, 0, 0, 0},
					{ 0, 0, 0, 0, 0, 3 , 0, 0, 0, 0},
					{ 0, 0, 0, 0, 0, 0 , 0, 0, 5, 0},
					{ 0, 0, 0, 0, 0, 0 , 0, 5, 5, 0},
					{ 5, 5, 2, 0, 0, 0 , 5, 5, 5, 0},
					{ 5, 5, 0, 0, 0, 5 , 5, 5, 5, 9},
					{ 5, 0, 0, 0, 5, 5 , 5, 5, 5, 0},
					{ 0, 0, 0, 5, 5, 5 , 5, 5, 5, 0}

			};
		}
		
		//if its null set return to the aboove level else instance must not be null so return that instead
		public static GameWindowLevel2 getInstance() {
			if(instance == null) {
				return new GameWindowLevel2();
			}else {
				return instance;
			}
		}
}
