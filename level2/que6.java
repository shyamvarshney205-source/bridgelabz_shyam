public class que6 {

    // Length conversions
    public static double metersToCentimeters(double meters) {
        return meters * 100.0;
    }

    public static double centimetersToMeters(double centimeters) {
        return centimeters / 100.0;
    }

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
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Weight conversions
    public static double kilogramsToGrams(double kg) {
        return kg * 1000.0;
    }

    public static double gramsToKilograms(double grams) {
        return grams / 1000.0;
    }

    public static double kilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }

    public static double gramsToOunces(double grams) {
        return grams / 28.3495;
    }

    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    // Volume conversions
    public static double litersToMilliliters(double liters) {
        return liters * 1000.0;
    }

    public static double millilitersToLiters(double ml) {
        return ml / 1000.0;
    }

    public static double litersToGallons(double liters) {
        return liters / 3.78541;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Time conversions
    public static double hoursToMinutes(double hours) {
        return hours * 60.0;
    }

    public static double minutesToSeconds(double minutes) {
        return minutes * 60.0;
    }

    public static double secondsToMinutes(double seconds) {
        return seconds / 60.0;
    }

    public static double minutesToHours(double minutes) {
        return minutes / 60.0;
    }
}
