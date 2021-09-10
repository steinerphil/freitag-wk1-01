import java.util.Scanner;

public class PasswordInput {

    public static void main(String[] args) {
        enterPassword();
    }


    // Get password from user
    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter password: ");
        return scanner.nextLine();
    }

    private static void enterPassword() {

        while (!PasswordValiPhil.validatePassword(getUserInput())) {
            PasswordValiPhil.validatePassword(getUserInput());
        }

    }


}
