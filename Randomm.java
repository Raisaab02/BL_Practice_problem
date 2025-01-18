import java.util.*;

class Randomm {
    public static void main(String args[]) {
        int ar[] = new int[5];
        Random random = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Generated 3-digit random numbers:");

        for (int i = 0; i < 5; i++) {
            ar[i] = random.nextInt(900) + 100; // Generate random 3-digit number
            System.out.print(ar[i] + " ");

            // Update max and min
            if (ar[i] > max) {
                max = ar[i];
            }
            if (ar[i] < min) {
                min = ar[i];
            }
        }

        System.out.println("\n\nMaximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
