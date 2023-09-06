public class StringReversal {
    public static String reverseString(String input) {
        // Überprüfe, ob die Eingabe null oder leer ist
        if (input == null || input.isEmpty()) {
            return input;
        }

        // Verwende einen StringBuilder, um die umgekehrte Zeichenkette zu erstellen
        StringBuilder reversed = new StringBuilder(input.length());
        
        // Durchlaufe die Zeichenkette rückwärts und füge jeden Buchstaben dem StringBuilder hinzu
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Gib die umgekehrte Zeichenkette als String zurück
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original = "Hallo";
        String reversed = reverseString(original);
        System.out.println("Original: " + original);
        System.out.println("Umgekehrt: " + reversed);
    }
}
