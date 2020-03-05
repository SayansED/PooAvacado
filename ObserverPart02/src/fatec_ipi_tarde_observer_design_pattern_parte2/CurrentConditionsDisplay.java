package fatec_ipi_tarde_observer_design_pattern_parte2;

import java.util.Observable;

public class CurrentConditionsDisplay implements Observer, DisplayElement{

	private Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	/*
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData){
			WeatherData wd = (WeatherData) o;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			display();
		}
		*/

		public void update(double temp, double humidity, double pressure) {
			display(temp, humidity, pressure);
		}

		@Override
		public void display(double temp, double h, double p) {
			System.out.printf("T: %.2f\nH: %.2f\nP: %.2f", temp, h, p);
		}

	}
