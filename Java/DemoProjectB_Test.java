import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoProjectB_Test {
	
	@Test
	public void cToFTest() {
		assertEquals(32, DemoProjectB.celsiusToFahrenheit(0.0), .00001);
		assertEquals(59, DemoProjectB.celsiusToFahrenheit(15.0), .00001);
		assertEquals(12.2, DemoProjectB.celsiusToFahrenheit(-11), .00001);
	}
	
	@Test
	public void cToKTest() {
		assertEquals(273.15, DemoProjectB.celsiusToKelvin(0), .00001);
		assertEquals(288.15, DemoProjectB.celsiusToKelvin(15.0), .00001);
		assertEquals(257.75, DemoProjectB.celsiusToKelvin(-15.4), .00001);
	}

	@Test
	public void differenceTest() {
		assertEquals(50, DemoProjectB.differenceInTemperatures(50.0, 100.0), .00001);
		assertEquals(1075.2, DemoProjectB.differenceInTemperatures(125.2, 1200.4), .00001);
		assertEquals(31.02, DemoProjectB.differenceInTemperatures(64.2, 95.22), .00001);
	}

	@Test
	public void fToCTest() {
		assertEquals(0.0, DemoProjectB.fahrenheitToCelsius(32), .00001);
		assertEquals(49.44, (int)(DemoProjectB.fahrenheitToCelsius(121) * 100) / 100.0, .00001);
		assertEquals(-11.94, (int)(DemoProjectB.fahrenheitToCelsius(10.5) * 100) / 100.0, .00001);
	}
	
	
	@Test
	public void highTemperatureTest() {
		assertEquals(79.0, DemoProjectB.highTemperature(45.6, 65.24, 79.0), 0.00001);
		assertEquals(96.3, DemoProjectB.highTemperature(24.76, 96.3, 66.1), 0.00001);
		assertEquals(21.6, DemoProjectB.highTemperature(21.6, 20.4, 10.23), 0.00001);
	}
	
	@Test
	public void waterCanFreezeTest() {
		assertEquals(true, DemoProjectB.waterCanFreeze(32.0));
		assertEquals(false, DemoProjectB.waterCanFreeze(32.9));
		assertEquals(true, DemoProjectB.waterCanFreeze(20.1));
	}
	
	@Test
	public void waterCanBoilTest() {
		assertEquals(false, DemoProjectB.waterCanBoil(100));
		assertEquals(true, DemoProjectB.waterCanBoil(213));
		assertEquals(true, DemoProjectB.waterCanBoil(300));
	}

	@Test
	public void averageTest() {
		assertEquals(89.171, ((int)((DemoProjectB.average(97.2, 94.3, 90.1, 84.3, 80.1, 90.5, 87.7)) * 1000)) / 1000.0, .00001);
		assertEquals(39.714, ((int)((DemoProjectB.average(44.2, 52.1, 33.7, 42.1, 31.4, 46.3, 28.2)) * 1000)) / 1000.0, .00001);
	}
	
}
