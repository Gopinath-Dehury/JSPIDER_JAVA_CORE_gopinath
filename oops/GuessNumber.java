import java.util.*;

class GuessNumber {
    public static void main(String[] args) {
        int i = 3;
        Scanner s = new Scanner(System.in);
        int n = (int) (Math.random() * 5 + 1);
        int score = 0;
        while (i > 0) {
            System.out.print("Guess the number between[1-5]");
            // for (int j = 1; j <= n; j++) {
            //     System.out.print(".");
            // }
            System.out.println();

            int GuessNumber = s.nextInt();
            if (GuessNumber == n) {
                System.out.println("Your guess is correct.");
                score += 10;
                n = (int) (Math.random() * 5 + 1);
            } else {

                System.out.println("Wrong Guess!! Try again ");
                if (i > 1)
                    System.out.println(+(i - 1) + " times");
                else
                    System.out.println("Game over!!");
            }
            i--;
        }
        System.out.println("Your final score is " + score);
    }
}
