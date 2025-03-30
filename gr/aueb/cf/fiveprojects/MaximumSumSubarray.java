package gr.aueb.cf.fiveprojects;

public class MaximumSumSubarray {

    // Μέθοδος για να υπολογίσουμε το μέγιστο άθροισμα συνεχόμενου υποπίνακα
    public static int maxSubArraySum(int[] arr) {
        // Αν ο πίνακας είναι κενός, επιστρέφουμε 0 (αν και η εκφώνηση δεν αναφέρει ότι μπορεί να έχουμε κενό πίνακα)
        if (arr == null || arr.length == 0) {
            return 0;
        }

        // Αρχικοποίηση των δύο μεταβλητών
        int max_ending_here = arr[0]; // Τοπικό μέγιστο για την πρώτη θέση
        int max_so_far = arr[0]; // Global maximum

        // Διατρέχουμε τα υπόλοιπα στοιχεία του πίνακα
        for (int i = 1; i < arr.length; i++) {
            // Υπολογίζουμε το τοπικό μέγιστο για την τρέχουσα θέση
            max_ending_here = Math.max(arr[i], max_ending_here + arr[i]);

            // Ενημερώνουμε το global maximum
            max_so_far = Math.max(max_so_far, max_ending_here);
        }

        // Επιστρέφουμε το global maximum, το οποίο είναι το μέγιστο άθροισμα συνεχόμενου υποπίνακα
        return max_so_far;
    }

    public static void main(String[] args) {
        // Παράδειγμα πίνακα
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Εκτύπωση του μέγιστου αθροίσματος υποπίνακα
        System.out.println("Maximum sum subarray: " + maxSubArraySum(arr));
    }
}
