package gamepkg;

public class Background {
	
	private static int BACKGROUND_HEIGHT = 2160;
	private int bgX, bgY, speedX;

	public Background(int x, int y) {
		bgX = x;
		bgY = y;
		speedX = 0;
	}
	
	public void update() {
		bgX += speedX;
		
		if (bgX <= -BACKGROUND_HEIGHT) {
			bgX += BACKGROUND_HEIGHT * 2;
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
