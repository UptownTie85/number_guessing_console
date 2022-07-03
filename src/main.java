import java.util.Random;
import java.util.Scanner;

public class main {

    static void game() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int x = 0;
        int y = 0;
        int rand_num = 0;
        int guess = 0;
        boolean correct = false;

        System.out.print("Enter the first number: ");
        x = scanner.nextInt();

        System.out.print("Enter the second number: ");
        y = scanner.nextInt();

        rand_num = random.nextInt(y - x) + x;
        System.out.println("Random number: " + rand_num);

        while (!correct) {

            System.out.print("Guess the random number: ");
            guess = scanner.nextInt();

            if (guess == rand_num) {
                System.out.println("Correct!");
                correct = true;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
    public static void main(String[] args){
        game();

        String choice = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Play again? ");
        choice = scanner.nextLine();

        if (choice.equals("Yes")) {
            game();
        } else {
            System.out.println("Goodbye!");
        }
    }
}
