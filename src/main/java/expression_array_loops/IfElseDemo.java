package expression_array_loops;

public class IfElseDemo {
    public static void main(String[] aa){
        int hours=1;

        String suffix;

        if(hours==1){
            suffix="";
        }else {
            suffix="s";
        }

        System.out.println(hours + " hour " + suffix);

        boolean timesUp;
        timesUp=  (hours == 0);
        /*if(hours ==0){
            timesUp=true;
        }else {
            timesUp=false;
        }*/

        System.out.println("Times up?  " + timesUp);

    }
}
