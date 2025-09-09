public class que4 {

    // Length conversions
    public static double metersToKilometers(double meters) {
        return meters / 1000.0;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000.0;
    }

    public static double metersToMiles(double meters) {
        return meters / 1609.344;
    }

    public static double milesToMeters(double miles) {
        return miles * 1609.344;
    }

    // Temperature conversions
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Weight conversions
    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}
 