package fatec_ipi_tarde_observer_design_pattern_parte2;

import java.util.Random;

public class ForecastDisplay implements Observer, DisplayElement{
	
	private Random gerador = new Random();

	public void update(double temp, double humidity, double pressure) {
		display(temp, humidity, pressure);
	}

	@Override
	public void display(double temp, double humidity, double pressure) {
		System.out.printf("Previsão: %.2f", (temp-2) + gerador.nextDouble() * 4);
		
	}

}
