package ocr_partie2_ihm.observer;

public interface Observable {
	public void addObservateur(Observateur obs);

	public void updateObservateur();

	public void delObservateur();
}
