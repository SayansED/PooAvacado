package fatec_ipi_tarde_observer_design_pattern_parte2;

import java.util.List;
import java.util.ArrayList;

public class StatsDisplay implements Observer, DisplayElement{

	private List <Double> temps = new ArrayList <> ();
	
	public void update(double temp, double humidity, double pressure) {
		temps.add(temp);
		display(temp, humidity, pressure);
	}

	@Override
	public void display(double temp, double humidity, double pressure) {
		System.out.printf("Média: %.2f\n", calcularMedia());
		System.out.printf("Indice de calor: %.2f\n", computeHeatIndex(temp, humidity));
	}
	
	private double calcularMedia () {
		double soma = 0;
		for (Double temp : temps)
			soma += temp;
		return 1. * soma / temps.size();
	}
	
	private float computeHeatIndex(double t, double rh) {
		float index = (float)((16.923 + (0.185212 * t) + (5.37941 * rh)
		-
		(0.100254 * t * rh) + (0.00941695 * (t * t)) + (0.00728898
		*
		(rh * rh)) + (0.000345372 * (t * t * rh)) - (0.000814971 *
		(t * rh * rh)) + (0.0000102102 * (t * t * rh * rh)) -
		(0.000038646 * (t * t * t)) + (0.0000291583 *
		(rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
		(0.000000197483 * (t * rh * rh * rh)) -
		(0.0000000218429 * (t * t * t * rh * rh)) +
		0.000000000843296 *
		(t * t * rh * rh * rh)) - (0.0000000000481975 * 1));
		return index;
	}

}
