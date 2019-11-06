package ocr_partie2_ihm.animations;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton implements MouseListener {
	private String name;
	private Image img;

	public Bouton(String str) {
		super(str);
		this.name = str;
		try {
			img = ImageIO.read(new File("degrade_vert.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		// GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan,
		// true);
		// g2d.setPaint(gp);
		// g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
		g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		g2d.setColor(Color.BLACK);
		g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 / 4), (this.getHeight() / 2) + 5);
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered");
		try {
			img = ImageIO.read(new File("degrade_jaune.png"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exited");
		try {
			img = ImageIO.read(new File("degrade_vert.png"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse pressed");
		try {
			img = ImageIO.read(new File("degrade_orange.png"));
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse released");
		if ((e.getX() > 0 && e.getX() < this.getWidth()) && (e.getY() > 0 && e.getY() < this.getHeight())) {
			try {
				img = ImageIO.read(new File("degrade_jaune.png"));
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}