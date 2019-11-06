package ocr_partie2_ihm.jbuttons;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	
	private JPanel pan = new JPanel();
	private JButton bouton = new JButton("Mon bouton");

	public static void main(String[] args) {

		new Fenetre();
	}

	public Fenetre() {
		this.setTitle("Animation");
		this.setSize(300, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// Ajout du bouton à notre content pane
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
	}
}
