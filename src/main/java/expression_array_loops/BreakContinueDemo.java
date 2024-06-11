package expression_array_loops;

public class BreakContinueDemo {
    public static void main(String[] args) {
        int[] scores = { 55, 96, 35, 0, 87, 22, 101, 79 };

        for(int score : scores) {
            if(score == 0) {
                System.out.println("Ignoring score of 0.");
                continue;
            }
            if(score > 100) {
                System.out.println("Invalid score: " + score);
                break;
            }
            System.out.println("Score is " + score);
        }

    }
}
