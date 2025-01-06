package gr.aueb.cf.fiveprojects;

import java.io.*;
import java.util.*;

public class Lottery {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        List<Integer> numbers = new ArrayList<>();

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }
        scanner.close();

        int[] nums = numbers.stream().mapToInt(i -> i).toArray();
        Arrays.sort(nums);

        // Παράγωγοι συνδυασμοί και φιλτράρισμα των εξάδων
        generateCombinations(nums);
    }

    public static void generateCombinations(int[] nums) {
        List<int[]> validCombinations = new ArrayList<>();

        // Δημιουργία όλων των συνδυασμών 6 αριθμών
        for (int i = 0; i < nums.length - 5; i++) {
            for (int j = i + 1; j < nums.length - 4; j++) {
                for (int k = j + 1; k < nums.length - 3; k++) {
                    for (int l = k + 1; l < nums.length - 2; l++) {
                        for (int m = l + 1; m < nums.length - 1; m++) {
                            for (int n = m + 1; n < nums.length; n++) {
                                int[] combination = {nums[i], nums[j], nums[k], nums[l], nums[m], nums[n]};

                                // Εφαρμογή φίλτρων
                                if (isValidCombination(combination)) {
                                    validCombinations.add(combination);
                                }
                            }
                        }
                    }
                }
            }
        }

        // Γράφουμε τα αποτελέσματα σε αρχείο
        try (PrintWriter writer = new PrintWriter(new File("valid_combinations.txt"))) {
            for (int[] combination : validCombinations) {
                writer.println(Arrays.toString(combination));
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }
    }

    public static boolean isValidCombination(int[] combination) {
        int evenCount = 0, oddCount = 0, consecutiveCount = 0;
        Map<Integer, Integer> lastDigitCount = new HashMap<>();
        Map<Integer, Integer> decadeCount = new HashMap<>();

        for (int i = 0; i < combination.length; i++) {
            int num = combination[i];
            int lastDigit = num % 10;
            int decade = num / 10;

            // Count even and odd
            if (num % 2 == 0) evenCount++;
            else oddCount++;

            // Check for consecutive numbers
            if (i > 0 && combination[i] == combination[i - 1] + 1) {
                consecutiveCount++;
            }

            // Count last digits
            lastDigitCount.put(lastDigit, lastDigitCount.getOrDefault(lastDigit, 0) + 1);

            // Count decades
            decadeCount.put(decade, decadeCount.getOrDefault(decade, 0) + 1);
        }

        // Εφαρμογή των φίλτρων
        if (evenCount > 4 || oddCount > 4) return false;
        if (consecutiveCount > 2) return false;
        if (lastDigitCount.values().stream().anyMatch(count -> count > 3)) return false;
        if (decadeCount.values().stream().anyMatch(count -> count > 3)) return false;

        return true;
    }
}
