package fatec_ipi_tarde_observer_design_pattern_parte2;

public class teste {

	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		//CurrentConditionsDisplay codiConditionsDisplay = new CurrentConditionsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		StatsDisplay statsDisplay = new StatsDisplay();
		
		/*
		wd.registerObserver(codiConditionsDisplay);
		wd.registerObserver(forecastDisplay);
		wd.registerObserver(statsDisplay);
		*/
		wd.iniciar();
	}

}
