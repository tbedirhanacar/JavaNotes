package interviewquestions;

public class EqualityOfThreeValues {
    public static int equal(int a, int b, int c) {
        if (a==b && a==c){
            return 3;
        }else if (a==b || a==c || b==c){
            return 2;
        }else {
            return 0;
        }
    }
}
