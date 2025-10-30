import java.util.Scanner;

public class password_checker {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String password = "";
        boolean charUpper = false;
        boolean charLower = false;
        boolean charDigit = false;
        int password_score = 0;


        System.out.println("Please enter your password: ");
        password = input.nextLine();

        for (int i = 0; i<password.length(); i++){
            char a =   password.charAt(i);

            if(Character.isUpperCase(a)){
                charUpper = true;
            }
            if(Character.isLowerCase(a)){
                charLower = true;
            }
            if (Character.isDigit(a)) {
                charDigit = true;
            }
        }

        if (charUpper) {
            password_score += 1;
        }
        if (charLower) {
            password_score += 1;
        }
        if (charDigit) {
            password_score += 1;
        }


        System.out.println(password_score);
        if (password_score >= 3) {
            System.out.println("High security");
        } else if (password_score >= 2) {
            System.out.println("Mid security");
        } else if (password_score >= 1) {
            System.out.println("Low security");
        }

    }
}