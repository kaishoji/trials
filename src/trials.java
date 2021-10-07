import java.util.Scanner;

public class trials {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        String userName;

        System.out.println("Hello user. Let's get started.");
        System.out.println("Please enter a username:");
        userName = in.nextLine();

        String passWord;

        System.out.println("Welcome, " + userName + ", let's continue.");
        System.out.println("Please enter a password:");
        passWord = in.nextLine();


        String passwordConfirm;

        System.out.println("Please confirm password:");
        passwordConfirm = in.nextLine();

        while (passWord != passwordConfirm) {
            System.out.println("[ERROR] Passwords do not match. Please try again.");
            System.out.println("Please confirm password:");
            passwordConfirm = in.nextLine();
        }

        System.out.println("Thank you, " + userName + ", let's move forward.");
    }
}
