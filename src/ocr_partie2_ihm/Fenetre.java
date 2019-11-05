package ocr_partie2_ihm;

import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Fenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Fenetre() throws HeadlessException {
		// D�finit un titre pour notre fen�tre
		this.setTitle("My first java window");
			
		// D�finit sa taille : 400 pixels de large et 100 pixels de haut
		this.setSize(400, 500);
		
		// Nous demandons maintenant � notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		
		// Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Et enfin, la rendre visible
		this.setVisible(true);
	}

}
