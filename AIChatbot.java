import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String userName = "";

        System.out.println("====================================");
        System.out.println("      CODEALPHA AI CHATBOT");
        System.out.println("====================================");

        System.out.print("Enter your name: ");
        userName = sc.nextLine();

        System.out.println("Hello " + userName + "!");
        System.out.println("Type 'help' to see available commands.");
        System.out.println("Type 'bye' to exit.\n");

        while (true) {

            System.out.print(userName + ": ");
            String input = sc.nextLine().toLowerCase();

            if (input.contains("hi") || input.contains("hello")) {
                System.out.println("Bot: Hello " + userName + "! How can I help you?");
            }

            else if (input.contains("how are you")) {
                System.out.println("Bot: I am doing great. Thanks for asking.");
            }

            else if (input.contains("java")) {
                System.out.println("Bot: Java is an object-oriented programming language.");
            }

            else if (input.contains("internship")) {
                System.out.println("Bot: Internship helps students gain practical experience.");
            }

            else if (input.contains("github")) {
                System.out.println("Bot: GitHub is a platform used to store and manage code repositories.");
            }

            else if (input.contains("oop")) {
                System.out.println("Bot: OOP stands for Object Oriented Programming.");
            }

            else if (input.contains("project")) {
                System.out.println("Bot: Projects help improve coding and problem-solving skills.");
            }

            else if (input.contains("faq")) {
                System.out.println("Bot: Frequently Asked Questions include Java, GitHub, Internship and OOP.");
            }

            else if (input.equals("help")) {

                System.out.println("\nAvailable Commands:");
                System.out.println("hello");
                System.out.println("how are you");
                System.out.println("java");
                System.out.println("internship");
                System.out.println("github");
                System.out.println("oop");
                System.out.println("project");
                System.out.println("faq");
                System.out.println("bye\n");
            }

            else if (input.equals("bye")) {
                System.out.println("Bot: Goodbye " + userName + "! Have a nice day.");
                break;
            }

            else {
                System.out.println("Bot: Sorry, I don't understand that question.");
            }
        }

        sc.close();
    }
}
