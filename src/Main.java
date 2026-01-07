import java.util.Scanner;

// Main class to run AI Chatbot
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChatBot bot = new ChatBot();

        System.out.println("ChatBot: Hello! Type 'exit' to end the chat.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }

            String response = bot.getResponse(userInput);
            System.out.println("ChatBot: " + response);
        }

        sc.close();
    }
}
