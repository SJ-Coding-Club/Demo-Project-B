public class DemoProjectB {
	/**
	 * For this project, you will be writing some functions to build a weather app.
	 * This will teach you stuff like conditionals (If/Else) and Math.class
	 * functions.
	 * 
	 * @author Jack Donofrio
	 */

	/**
	 * K = C + 273.15
	 * 
	 * @param celsius
	 * @return temperature in degrees Kelvin
	 */
	public static double celsiusToKelvin(double temperatureInCelsius) {
		return 0;
	}

	/**
	 * celsius = (5 / 9) * (F - 32) Hint: What's the difference between 5 / 9 and
	 * 5.0 / 9.0
	 * 
	 * 
	 * @param temperatureInFahrenheit
	 * @return temperature in degrees Celsius
	 */
	public static double fahrenheitToCelsius(double temperatureInFahrenheit) {
		return 0;
	}

	/**
	 * fahrenheit = (9 / 5) * C + 32 Hint: 9 / 5 vs 9.0 / 5.0 ?
	 * 
	 * @param temperatureInCelsius
	 * @return temperature in degrees Fahrenheit
	 */
	public static double celsiusToFahrenheit(double temperatureInCelsius) {
		return 0;
	}

	/**
	 * Basically find |x - y|
	 * 
	 * Hint: Math.abs(double number) -> Returns absolute value of 'number'
	 * 
	 * @param mondayTemperature
	 * @param tuesdayTemperature
	 * @return absolute difference between monday temp and tuesday temp
	 */
	public static double differenceInTemperatures(double mondayTemperature, double tuesdayTemperature) {
		return 0;
	}

	/**
	 * 
	 * average = (sum of items) / (number of items)
	 * 
	 * @param mon   temperature
	 * @param tues  temperature
	 * @param wed   temperature
	 * @param thurs temperature
	 * @param fri   temperature
	 * @param sat   temperature
	 * @param sun   temperature
	 * @return the daily average temperature
	 */
	public static double average(double mon, double tues, double wed, double thurs, double fri, double sat, double sun) {
		return 0;
	}

	/**
	 * Hint: You can use if / else statements here OR, you can use Math.max(double
	 * number1, double number2) ---> returns higher number
	 * 
	 * You can create overlapping max functions like this: Math.max(number1,
	 * Math.max(number2, number3)) ---> returns highest of three
	 * 
	 * @param mon
	 * @param tues
	 * @param wed
	 * @return return highest temperature of the three days
	 */
	public static double highTemperature(double mon, double tues, double wed) {
		return 0;
	}

	/**
	 * 0 celsius and below is freezing
	 * 
	 * Either make the simple adjustment for fahrenheit, OR use the conversion
	 * function you wrote before
	 * 
	 * @param temperature in fahrenheit
	 * @return whether water can freeze at this temperature
	 */
	public static boolean waterCanFreeze(double temperatureInFahrenheit) {
		return false; // change this
	}

	/**
	 * 100 celsius and above is boiling
	 * 
	 * Use the fahrenheitToCelsius conversion function you wrote before
	 * 
	 * @param temperature In Fahrenheit
	 * @return whether water can boil at this temperature
	 */
	public static boolean waterCanBoil(double temperatureInFahrenheit) {
		return false; // change
	}
	
	
}
