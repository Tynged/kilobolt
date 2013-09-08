import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GraphicsDemo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2779740621771119267L;

	public GraphicsDemo() {
		setTitle("GraphicsDemo");
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		GraphicsDemo demo = new GraphicsDemo();
	}

	public void paint(Graphics g) {

		g.setColor(Color.WHITE);
		g.fillRect(40, 40, 120, 40);
		g.setColor(Color.blue);
		g.drawString("Yay, graphics!", 60, 60);
		g.drawRect(40, 40, 120, 40);
	}
}
