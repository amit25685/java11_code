package expression_array_loops;

public class Exercise4 {
    public static void main(String[] aa){
        int hoursNeeded = 5;
        int hoursAvailable = 5;
        int hoursRemaining;

        if(hoursAvailable > 0) {
            hoursRemaining = hoursAvailable - hoursNeeded;
            if(hoursRemaining < 0) {
                System.out.println("Not enough time.");
            } else {
                String suffix = "";
                if(hoursRemaining != 1) {
                    suffix = "s";
                }

                System.out.println("You will have " + hoursRemaining + " hour" + suffix + " remaining.");
            }
        } else {
            System.out.println("Times up.");
        }

    }
}
