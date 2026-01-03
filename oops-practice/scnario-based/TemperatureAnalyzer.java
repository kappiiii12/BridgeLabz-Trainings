public class TemperatureAnalyzer {

    public static void main(String[] args) {
        // float[7][24] represents 7 days, 24 hours each
        float[][] weeklyTemps = new float[7][24];
        
        // Fill with some dummy data for demonstration
        for (int d = 0; d < 7; d++) {
            for (int h = 0; h < 24; h++) {
                weeklyTemps[d][h] = (float) (Math.random() * 35); 
            }
        }

        analyze(weeklyTemps);
    }

    public static void analyze(float[][] temps) {
        float globalMax = -Float.MAX_VALUE;
        float globalMin = Float.MAX_VALUE;
        int hottestDay = 0;
        int coldestDay = 0;

        System.out.println("--- Daily Average Temperatures ---");

        for (int day = 0; day < temps.length; day++) {
            float daySum = 0;
            for (int hour = 0; hour < temps[day].length; hour++) {
                float current = temps[day][hour];
                daySum += current;

                // Check for absolute hottest/coldest records
                if (current > globalMax) {
                    globalMax = current;
                    hottestDay = day;
                }
                if (current < globalMin) {
                    globalMin = current;
                    coldestDay = day;
                }
            }
            float average = daySum / 24;
            System.out.printf("Day %d: %.2f°C%n", (day + 1), average);
        }

        System.out.println("\n--- Summary ---");
        System.out.println("Hottest Day: Day " + (hottestDay + 1) + " (Peak: " + globalMax + "°C)");
        System.out.println("Coldest Day: Day " + (coldestDay + 1) + " (Low: " + globalMin + "°C)");
    }
}