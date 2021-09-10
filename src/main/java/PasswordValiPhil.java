import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class PasswordValiPhil {


    // Password Array Validator
    public static boolean[] validatePasswordArray(String[] password) {

        boolean[] passwordValid = new boolean[password.length];

        for (int i = 0; i < password.length; i++) {
            int j = i+1;
            if (checkLowerAndUpperCase(password[i]) && checkPasswordLength(password[i]) && checkContainsDigit(password[i])) {
                System.out.println("Password " + j + " is valid");
                passwordValid[i] = true;
            } else {
                passwordValid[i] = false;
                System.out.println("Password " + j + " is not valid");
            }
        }
        return passwordValid;
    }

    // Single Password Validator
    public static boolean validatePassword(String password) {
        boolean passwordValid = false;

        if (checkLowerAndUpperCase(password) && checkPasswordLength(password) && checkContainsDigit(password)) {
            System.out.println("Password is valid");
            passwordValid = true;
        } else {
           // System.out.println("Password is not valid");
        }
        return passwordValid;
    }


    public static boolean checkPasswordLength(String password) {
        int passwordMinLength = 8;
        boolean lengthIsOk = true;
        if (password.length() < passwordMinLength) {
            System.out.println("Password is too short.");
            lengthIsOk = false;
        }
        return lengthIsOk;
    }


    public static boolean checkContainsDigit(String password) {
        boolean containsDigit = false;
        char[] charsOfPassword = new char[password.length()];

        for (int i = 0; i < charsOfPassword.length; i++) {
            charsOfPassword[i] = password.charAt(i);
            containsDigit = isDigit(charsOfPassword[i]);

            if (containsDigit) {
                break;
            }
        }
        if (!containsDigit) {
            System.out.println("Your password must contain digits.");
        }
        return containsDigit;
    }


    public static boolean checkLowerAndUpperCase(String password) {
        boolean containsUpperCase = false;
        char[] charsOfPassword = new char[password.length()];

        for (int i = 0; i < charsOfPassword.length; i++) {
            charsOfPassword[i] = password.charAt(i);
            containsUpperCase = isUpperCase(charsOfPassword[i]);
            if (containsUpperCase) {
                break;
            }
        }
        if (!containsUpperCase) {
            System.out.println("Your password must contain upper case characters.");
        }
        return containsUpperCase;
    }


}


