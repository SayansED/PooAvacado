package fatec_ipi_tarde_observer_design_pattern_parte2;

public interface Subject {
	
	public void registerObserver (Observer o);
	public void removeObservers (Observer o);
	public void notifyObservers ();
}
