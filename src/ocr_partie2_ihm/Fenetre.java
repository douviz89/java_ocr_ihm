package ocr_partie2_ihm;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class Fenetre extends JFrame {

	public Fenetre() throws HeadlessException {
		this.setTitle("My first java window");
		this.setSize(400, 400);
		// Nous demandons maintenant à notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setContentPane(new Panneau());

		this.setVisible(true);
	}

}
