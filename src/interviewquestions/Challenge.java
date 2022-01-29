package interviewquestions;

public class Challenge {

    public static void main(String[] args) {

        System.out.println(solutions(1,2,1));

    }

        public static int solutions(int a, int b, int c) {
            int delta = b*b-4*a*c;
            if(delta==0){
                return 1;
            }
            if (delta > 0) {
                return 2;
            } else {
                return 0;
            }

        }
}
