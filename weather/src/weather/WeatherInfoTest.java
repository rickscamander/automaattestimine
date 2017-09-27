package weather;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeatherInfoTest {

	@Test
	public void currentTemperature() {
		assertNotNull(WeatherInfo.currentTemperature);
	}
	
	@Test
	public void predictedHigh() {
		assertNotNull(WeatherInfo.predictedHigh);
	}
	
	@Test
	public void predictedLow() {
		assertNotNull(WeatherInfo.predictedLow);
	}
	
	@Test
	public void latitude() {
		assertNotNull(WeatherInfo.latitude);
	}
	
	@Test
	public void longitude() {
		assertNotNull(WeatherInfo.longitude);
	}
}
