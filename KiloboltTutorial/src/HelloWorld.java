import java.util.Random;

public class HelloWorld {
	public static void main(String[] args) {

		Thread menuThread = new Thread() {
			public void run() {
				System.out.println("Main Menu");
			}
		};
		
		Thread gameThread = new Thread() {
			public void run() {
				System.out.println("Game");
			}
		};
		
		menuThread.start();
		gameThread.start();

		boolean playerAlive = true;

		while (playerAlive == true) {

			//updateGame(deltaTime);
			//renderGame(deltaTime);
			Random rand = new Random();
			rand.nextInt(6);
		}
	}
}
