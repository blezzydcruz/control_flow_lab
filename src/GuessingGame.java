public class GuessingGame {

    public static void main(String[] args) {

        int secretNumber = 14;
        int guess = 16;

        if (guess == secretNumber) {
            System.out.println("correct!");
        } else if (guess > secretNumber) {
            System.out.println("too high");
        } else {
            System.out.println("too low");
        }
    }
}
