import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PlutoTransit {
    public static void main(String[] args) {
        // Define the transit data
        Map<Integer, Map<Integer, String>> transitData = new HashMap<>();

        // Define the positions of Pluto in each zodiac sign for each year
        String[][] positions = {
                // Aries, Taurus, Gemini, Cancer, Leo, Virgo, Libra, Scorpio, Sagittarius,
                // Capricorn, Aquarius, Pisces
                { "Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn",
                        "Aquarius", "Pisces" },
                { "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn",
                        "Aquarius", "Pisces", "Aries" },
                // Add positions for subsequent 20-year periods...
        };

        // Populate the transitData map with the positions of Pluto for each year within
        // each 20-year period
        int startYear = 2023;
        for (int i = 0; i < positions.length; i++) {
            int year = startYear + i;
            Map<Integer, String> yearData = new HashMap<>();

            String[] zodiacSigns = positions[i];
            for (int j = 0; j < zodiacSigns.length; j++) {
                int currentYear = year + j;

                String position = zodiacSigns[j];
                yearData.put(currentYear, position);
            }
            transitData.put(year, yearData);
        }

        // TODO: Handle the case where the desired period, year, or season is not found
        // in the transit data

        // Substep
        // Get the desired period, year, and season from user input or any other source

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the desired period (Year):");
        int desiredYear = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter the desired zodiac (Constellation):");
        int desiredZodiac = scanner.nextInt();
        scanner.nextLine();

        // the rest of the steps:

        // TODO: Retrieve the desired period data using the get method on the
        // transitData map

        // TODO: Check if the desired year exists within the period data using
        // containsKey

        // TODO: If the year exists, retrieve the position for that year using get

        // TODO: Check if the retrieved position contains the desired season

        // TODO: Print the position if all conditions are met. Otherwise, print an
        // appropriate message indicating no data is available
    }
}
