public class PasswordValidatorThiemo {

    public static boolean checkRequiredLength(String inputToValidate, int requiredLength ) {
        // to implement check length after test
        //return true;
        if (inputToValidate.length() < requiredLength) {
            return false;
        } else return true;

    }

    // copyright by Marcel :-)
    public static boolean checkIfPasswordContainsNumbers(String password) {
            boolean containsNumber = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    containsNumber = true;
                    break;
                }
            }
            return containsNumber;
        }

    }



