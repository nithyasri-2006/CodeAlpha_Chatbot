// ChatBot class handles chatbot responses
public class ChatBot {

    public String getResponse(String message) {

        message = message.toLowerCase();

        if (message.contains("hi") || message.contains("hello")) {
            return "Hello! How can I help you?";
        }
        else if (message.contains("java")) {
            return "Java is an object-oriented programming language.";
        }
        else if (message.contains("oop")) {
            return "OOP stands for Object-Oriented Programming.";
        }
        else if (message.contains("codealpha")) {
            return "CodeAlpha is a platform providing internship opportunities.";
        }
        else if (message.contains("bye")) {
            return "Goodbye! Have a nice day.";
        }
        else {
            return "Sorry, I did not understand that. Please try again.";
        }
    }
}
