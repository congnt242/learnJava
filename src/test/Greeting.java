package test;
import java.util.Scanner;

public class Greeting {
    Scanner userName = new Scanner(System.in);
    void userGreeting() {
        String user;
        String userNameUppercase;
        System.out.print("\nWhat 's your name?");
        user = userName.nextLine();
        userNameUppercase = user.toUpperCase();
        System.out.print("\nHello "+userNameUppercase+", nice to meet you.");
    }
}
