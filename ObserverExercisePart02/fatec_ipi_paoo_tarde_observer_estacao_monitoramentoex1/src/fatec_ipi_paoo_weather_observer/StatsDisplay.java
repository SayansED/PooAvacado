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
		calculaMedia();
	}

	private void calculaMedia () {
		double soma = 0;
		int cont = 1;
		for (Double temp : temps) {
			soma += temp;
			cont = cont+1;
			
			if(cont == 10) {
				System.out.printf("Media dos 10 ultimxs: %.2f\n", soma/cont);
				cont=0;
				soma=0;
			}
				
		}

	}
	/*
	 @Override
		public void display(double t, double h, double p) {
			System.out.printf("Média: %.2f\n", calculaMedia());
		}

		private double calculaMedia () {
			double soma = 0;
			int cont = 1;
			double dezMedia = 0;
			for (Double temp : temps) {
				soma += temp;
				cont = cont+1;
				System.out.println("Cont: " + cont);
				if(cont == 10)
					dezMedia = soma/cont;
			}
			return dezMedia;
		}*/

}

