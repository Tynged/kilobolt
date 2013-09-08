package gamepkg;

public class Background {
	
	private static int backgroundHeight = 2160;
	private static int backgroundWidth = 480;
	private int bgX, bgY, speedX;

	public Background(int x, int y) {
		bgX = x;
		bgY = y;
		speedX = 0;
	}
	
	public void update() {
		bgX += speedX;
		
		if (bgX <= -backgroundHeight) {
			bgX += backgroundHeight * 2;
		}
	}

	public int getBgX() {
		return bgX;
	}

	public void setBgX(int bgX) {
		this.bgX = bgX;
	}

	public int getBgY() {
		return bgY;
	}

	public void setBgY(int bgY) {
		this.bgY = bgY;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}
}
