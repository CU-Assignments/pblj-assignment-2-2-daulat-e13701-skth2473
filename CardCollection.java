import java.util.*;

public class CardCollection {
    public static void main(String[] args) {
        Hashtable<String, List<String>> cardTable = new Hashtable<>();

        addCard(cardTable, "Heart", "Ace of Hearts");
        addCard(cardTable, "Heart", "King of Hearts");
        addCard(cardTable, "Spade", "Queen of Spades");
        addCard(cardTable, "Diamond", "Jack of Diamonds");
        addCard(cardTable, "Club", "10 of Clubs");

        displayCards(cardTable);

        String searchSymbol = "Heart";
        System.out.println("\nCards of symbol " + searchSymbol + ": " + getCardsBySymbol(cardTable, searchSymbol));
    }

    public static void addCard(Hashtable<String, List<String>> table, String symbol, String card) {
        table.putIfAbsent(symbol, new ArrayList<>());
        table.get(symbol).add(card);
    }

    public static void displayCards(Hashtable<String, List<String>> table) {
        System.out.println("Card Collection:");
        for (String symbol : table.keySet()) {
            System.out.println(symbol + " -> " + table.get(symbol));
        }
    }

    public static List<String> getCardsBySymbol(Hashtable<String, List<String>> table, String symbol) {
        return table.getOrDefault(symbol, new ArrayList<>());
    }
}
