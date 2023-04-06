import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static public void triedemo() {
        String[] actions = {
                "Insert a word",
                "Delete a word",
                "Print all words",
                "Print all words start with...",
                "Exit the program"
        };
        // Prompt the user for input until they choose to exit
        System.out.println("Welcome to the prefix tree demo!");
        Scanner scanner = new Scanner(System.in);
        Trie trie = new Trie();
        while (true) {
            System.out.println();
            for (int i = 0; i < actions.length; i++) {
                System.out.println((i + 1) + ". " + actions[i]);
            }
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Code to insert a word into the prefix tree
                System.out.println("Number of words: ");
                int nb = scanner.nextInt();
                scanner.nextLine();
                for (int i = 0; i < nb; i++) {
                    System.out.println("Enter your word: ");
                    trie.insert(scanner.nextLine());
                }
            } else if (choice == 2) {
                // Code to check if a word is in the prefix tree
                System.out.println("Enter your word: ");
                scanner.nextLine();
                trie.delete(scanner.nextLine());
            } else if (choice == 3) {
                // Code to print all words in the prefix tree
                System.out.println(trie.startWith(trie.getRoot()));
            } else if (choice == 4) {
                System.out.println("Enter prefix: ");
                scanner.nextLine();
                System.out.println(trie.getAllPostfix(scanner.nextLine()));
            } else if (choice == 5) {
                System.out.println("Exiting the program...");
                return;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    public static void main(String[] args) {
        triedemo();
    }
}