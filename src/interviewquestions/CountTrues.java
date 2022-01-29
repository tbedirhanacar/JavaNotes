package interviewquestions;

public class CountTrues {
    public static void main(String[] args) {

        boolean[] arr = {true, false, false, true, false, true};
        System.out.println(countTrue(arr));

    }
    public static int countTrue(boolean[] arr){
        int counter = 0;
        for (boolean w : arr) {
            if (w) {
                counter++;
            }
        }
        return counter;
    }
}
