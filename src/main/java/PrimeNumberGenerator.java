public class PrimeNumberGenerator {
    public static void generateFirstNPrimes(int n) {
        if (n <= 0) {
            System.out.println("Bitte geben Sie eine positive Zahl n ein.");
            return;
        }

        int count = 0; // Zählt die gefundenen Primzahlen
        int number = 2; // Die aktuell zu überprüfende Zahl

        System.out.println("Die ersten " + n + " Primzahlen sind:");

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }

        System.out.println(); // Neue Zeile am Ende
    }

    // Hilfsmethode zur Überprüfung, ob eine Zahl prim ist
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 10; // Anzahl der ersten Primzahlen, die generiert werden sollen
        generateFirstNPrimes(n);
    }
}
