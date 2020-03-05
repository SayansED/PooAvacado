package fatec_ipi_paoo_weather_observer;

import java.util.ArrayList;
import java.util.List;

public class StatsDisplay implements Observer, DisplayElement{
	private List <Double> temps = new ArrayList <> ();
	public void update (double temp, double humidity, double pressure) {
		temps.add(temp);
		display(temp, humidity, pressure);
	}

	@Override
	public void display(double t, double h, double p) {
		//System.out.printf("Média: %.2f\n", calculaMedia());
		historicoTemp(t);
	}

	private void historicoTemp (double t) {
		int cont = 0;
		for (Double temp : temps) {
			cont = cont+1;
			
			if(cont == 10) {
				System.out.printf("Historico 10 ultimas temperaturas: %.2f\n", t);
			}
			
				
		}

	}

}

