import java.util.*;

class Maini {
    public static void main(String[] args) {
        Hashtable<String, List<String>> cardCollection = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for adding cards
        System.out.print("Enter the number of cards to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter card symbol (Hearts, Diamonds, Clubs, Spades): ");
            String symbol = scanner.nextLine();
            System.out.print("Enter card value (e.g., Ace, King, 10): ");
            String card = scanner.nextLine();
            addCard(cardCollection, symbol, card);
        }
        
        // Display all cards in a given symbol
        System.out.print("Enter the card symbol to search (Hearts, Diamonds, Clubs, Spades): ");
        String symbol = scanner.nextLine();
        
        List<String> cards = cardCollection.get(symbol);
        if (cards != null) {
            System.out.println("Cards in " + symbol + ": " + cards);
        } else {
            System.out.println("No cards found for symbol: " + symbol);
        }
        
        scanner.close();
    }

    // Method to add cards to the hashtable
    private static void addCard(Hashtable<String, List<String>> collection, String symbol, String card) {
        collection.putIfAbsent(symbol, new ArrayList<>());
        collection.get(symbol).add(card);
    }
}
