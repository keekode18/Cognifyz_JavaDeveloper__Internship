import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }
            else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }
            else if (Character.isDigit(ch)) {
                hasNumber = true;
            }
            else {
                hasSpecial = true;
            }
        }

        int score = 0;

        if (password.length() >= 8) {
            score++;
        }

        if (hasUppercase) {
            score++;
        }

        if (hasLowercase) {
            score++;
        }

        if (hasNumber) {
            score++;
        }

        if (hasSpecial) {
            score++;
        }

        System.out.println();

        if (score == 5) {
            System.out.println("Password Strength: Strong");
        }
        else if (score >= 3) {
            System.out.println("Password Strength: Medium");
        }
        else {
            System.out.println("Password Strength: Weak");
        }

        System.out.println();

        System.out.println("Password requirements:");

        if (password.length() >= 8) {
            System.out.println("✓ At least 8 characters");
        } else {
            System.out.println("✗ At least 8 characters");
        }

        if (hasUppercase) {
            System.out.println("✓ Uppercase letter");
        } else {
            System.out.println("✗ Uppercase letter");
        }

        if (hasLowercase) {
            System.out.println("✓ Lowercase letter");
        } else {
            System.out.println("✗ Lowercase letter");
        }

        if (hasNumber) {
            System.out.println("✓ Number");
        } else {
            System.out.println("✗ Number");
        }

        if (hasSpecial) {
            System.out.println("✓ Special character");
        } else {
            System.out.println("✗ Special character");
        }

        sc.close();
    }
}
