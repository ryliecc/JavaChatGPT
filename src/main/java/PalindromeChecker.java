public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Überprüfe, ob die Eingabe null oder leer ist
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Entferne Leerzeichen und führende/trailing Leerzeichen
        input = input.replaceAll("\\s+", "").toLowerCase();

        // Initialisiere zwei Zeiger, einen am Anfang und einen am Ende der Zeichenkette
        int left = 0;
        int right = input.length() - 1;

        // Vergleiche die Zeichen von beiden Enden, während sich die Zeiger in Richtung Mitte bewegen
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false; // Die Zeichen sind nicht gleich, daher kein Palindrom
            }
            left++;
            right--;
        }

        return true; // Alle Zeichen wurden erfolgreich verglichen, es handelt sich um ein Palindrom
    }

    public static void main(String[] args) {
        String word1 = "anna";
        String word2 = "hello";
        
        System.out.println(word1 + " ist ein Palindrom: " + isPalindrome(word1));
        System.out.println(word2 + " ist ein Palindrom: " + isPalindrome(word2));
    }
}
