package ocr_partie2_ihm;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		System.out.println("in paint component");
		g.setColor(Color.RED);
		int x1 = this.getWidth() / 4;
		int y1 = this.getHeight() / 4;
		g.drawOval(x1, y1, this.getWidth() / 2, this.getHeight() / 2);
		
		g.drawRoundRect(10, 10, 30, 50, 10, 10);
	    g.fillRoundRect(55, 65, 55, 30, 10, 25);
	}
}
