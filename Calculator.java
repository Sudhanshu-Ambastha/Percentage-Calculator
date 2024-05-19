import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // System.out.print("Enter the maximum marks (400, 500, or 600): ");
            int maxMarks = scanner.nextInt();

            int subjectCount = maxMarks / 100;
            Double[] obtainedMarks = new Double[subjectCount];

            for (int i = 0; i < subjectCount; i++) {
                obtainedMarks[i] = scanner.nextDouble();
            }

            String result = calculatePercentage(maxMarks, obtainedMarks);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Invalid input: Please enter numbers only.");
        }

        scanner.close();
    }

    public static String calculatePercentage(int maxMarks, Double[] obtainedMarks) {
        if (maxMarks != 400 && maxMarks != 500 && maxMarks != 600) {
            return "Error: None of the parameters satisfied.";
        }

        if (obtainedMarks.length != maxMarks / 100) {
            return "Error: Number of obtained marks does not match the expected subjects count.";
        }

        double totalObtained = Arrays.stream(obtainedMarks).mapToDouble(Double::doubleValue).sum();
        double percentage = (totalObtained / maxMarks) * 100;
        StringBuilder result = new StringBuilder();

        if (maxMarks == 400) {
            result.append(String.format("4 core subjects percentage: %.2f%%", percentage)).append("\n");
        } else if (maxMarks == 500) {
            result.append(String.format("All 5 subjects percentage: %.2f%%", percentage)).append("\n");
        } else if (maxMarks == 600) {
            Arrays.sort(obtainedMarks, Collections.reverseOrder());
            double top5Total = Arrays.stream(obtainedMarks).limit(5).mapToDouble(Double::doubleValue).sum();
            double top5Percentage = (top5Total / 500) * 100;
            result.append(String.format("All 6 subjects percentage: %.2f%%", percentage)).append("\n");
            result.append(String.format("Top 5 subjects percentage: %.2f%%", top5Percentage)).append("\n");
        }

        return result.toString().trim();
    }
}
