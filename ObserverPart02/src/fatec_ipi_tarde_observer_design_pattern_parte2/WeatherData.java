package fatec_ipi_tarde_observer_design_pattern_parte2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

public class WeatherData extends Observable{

	/*
	private CurrentConditionsDisplay currentConditionsDisplay;
	private StatsDisplay statsDisplay;
	private ForecastDisplay forecastDisplay;
	 */

	//Linked - duplamente ligada
	// hierarquia de acordo com necessidade
	private List <Observer> observers = new LinkedList <>();
	//private double temperature, humidity, pressure;
	private Random gerador = new Random();

	/*
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObservers(Observer o) {
		observers.remove(o);
	}
	 */

	private float temperature;
	private float humidity;
	private float pressure;

	public void setMeasurements (
			float temperature, float humidity,
			float
			pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/*
	@Override
	public void notifyObservers() {
		for (Observer o: observers) {
			o.update(getTemperature(), getHumidity(), getPressure());
			System.out.println("\n======================================");
		}
	}
	 */

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}


	public double getTemperature() {
		return this.temperature;
	}

	public double getHumidity() {
		return this.pressure;
	}
	public double getPressure() {
		return this.pressure;
	}
	public void measurementsChanged () {
		//this.notifyObservers();
		setChanged();
		notifyObservers();
	}

	public void setMeasurements() {
		this.temperature = 20 + gerador.nextFloat() * 5;
		this.humidity = (float) (0.6 + gerador.nextFloat() * 0.1);
		this.pressure = 600 + gerador.nextFloat() * 400;
		this.measurementsChanged();
	}

	public void iniciar() {

		while (true) {
			setMeasurements();
			try {
				Thread.sleep(500);
			}
			catch (InterruptedException e){
				//e.printStackTrace();
				throw new RuntimeException (e);
			}
		}
	}
}
